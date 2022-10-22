package model.ai;

import model.Actor;
import model.Model;

import assets.Command;
import assets.Settings;
import numeric.Distance;
import numeric.Random;
import numeric.Vector2;

import java.util.stream.Stream;

import static numeric.Arithmetic.*;
import static numeric.Comparison.*;
import static numeric.Distance.*;

public
class GhostAI implements ActorAI {

    @Override public
    void command(Actor a, Model m) {
        var testI = a.position.i % Settings.TRANSITION == 0;
        var testJ = a.position.j % Settings.TRANSITION == 0;

        if(!(testI && testI))
            return;
        
        var directions = new Vector2[] {
            new Vector2(0, -1),
            new Vector2(0, 1),
            new Vector2(-1, 0),
            new Vector2(1, 0)
        };

        directions = Stream.of(directions)
            .filter(d -> !equal(d, opposite(a.direction)))
            .filter(d -> !m.willCollide(a.position, d))
            .toArray(Vector2[]::new);

        Vector2 nextDirection = directions[0];

        for(var i = 1; i < directions.length; ++i) {
            var previousDistance = Distance.rectilinear(sum(a.position, directions[i]), m.player.position);
            var currentDistance = Distance.rectilinear(sum(a.position, nextDirection), m.player.position);
            if(previousDistance < currentDistance) {
                nextDirection = directions[i];
            } else if(previousDistance == currentDistance && Random.integer(2) == 0) {
                nextDirection = directions[i];
            }
        }

        if(equal(nextDirection, new Vector2(-1, 0)))
            a.command = Command.MOVE_LEFT;
        else if(equal(nextDirection, new Vector2(1, 0)))
            a.command = Command.MOVE_RIGHT;
        else if(equal(nextDirection, new Vector2(0, 1)))
            a.command = Command.MOVE_DOWN;
        else if(equal(nextDirection, new Vector2(0, -1)))
            a.command = Command.MOVE_UP;
    }

    public
    Vector2 randomDirection() {
        int val = Random.integer(0, 3);
        int i = (val == 1 ? 1 : 0) - (val == 0 ? 1 : 0);
        int j = (val == 3 ? 1 : 0) - (val == 2 ? 1 : 0);
        return new Vector2(i, j);
    }

        public
        Vector2 chase(Actor a, Actor p) {


            int distanceA = rectilinear(sum(a.position, new Vector2(1, 0)), p.position);
            int distanceB = rectilinear(sum(a.position, new Vector2(-1, 0)), p.position);
            int distanceC = rectilinear(sum(a.position, new Vector2(0, 1)), p.position);
            int distanceD = rectilinear(sum(a.position, new Vector2(0, -1)), p.position);

            int i = 0;
            int j = 0;

            int minimum = Math.min(Math.min(distanceA, distanceB), Math.min(distanceC, distanceD));
            System.out.println(minimum);

            if(minimum == distanceA)
                i = 1;
            else if(minimum == distanceB)
                i = -1;
            else if(minimum == distanceC)
                j = 1;
            else
                j = -1;

            return new Vector2(i,  j);
        }
}
