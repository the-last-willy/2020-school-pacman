package application;

import application.time.Clock;
import application.time.Duration;
import application.Game;

import assets.Settings;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static application.time.Arithmetic.*;
import static application.time.Unit.*;

public
class Application {

    public
    Application() {
        this.frame = new JFrame("PACMAN");
        this.game = new Game();

        var panel = new JPanel() {
            @Override protected
            void paintComponent(Graphics g) {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
                game.render(g);
            }
        };
        panel.setPreferredSize(new Dimension(672, 768));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(panel);
        frame.pack();

        frame.addKeyListener(new KeyAdapter() {
            @Override public
            void keyPressed(KeyEvent e) {
                game.handle(e);
            }
        });

        run();
    }

    private
    void run() {
        Clock clock = new Clock();
        Duration timeSinceFrame = new Duration(Duration.NULL);
        Duration timePerFrame = Duration.seconds(1.f / Settings.FRAMERATE);

        while(true) {
            timeSinceFrame = sum(timeSinceFrame, clock.restart());
            if(timeSinceFrame.compareTo(timePerFrame) >= 0) {
                timeSinceFrame = difference(timeSinceFrame, timePerFrame);

                game.update();
                frame.repaint();
            }
        }
    }

    private
    JFrame frame;

    private
    Game game;
}
