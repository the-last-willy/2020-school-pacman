package application;

import model.Model;
import view.View;

import java.awt.event.KeyEvent;
import java.awt.Graphics;

public
class Game {
    
    public
    Game() {
        this.model = new Model();
        this.view = new View();
    }

    public
    void handle(KeyEvent e) {
        model.handle(e);
    }

    public
    void update() {
        model.update();
    }

    public
    void render(Graphics g) {
        view.render(g, model);
    }

    private
    Model model;

    private
    View view;
}
