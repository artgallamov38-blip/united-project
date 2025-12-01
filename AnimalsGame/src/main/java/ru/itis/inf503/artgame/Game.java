package ru.itis.inf503.artgame;

import java.util.Random;

public class Game {
    public final static int GAMEWIDTH = 1000;
    public final static int GAMEHEIGHT = 1000;
    public final static int VICTORYWIDTH = 100;
    public final static int VICTORYX = 3;
    public final static int VICTORYHEIGHT = 100;
    public final static int VICTORYY = 4;

    public void run() {
        Random random = new Random();
        boolean stopper = true;
        int antPositionX = random.nextInt(1, 1000);
        Ant ant = new Ant("мура");
        ant.setStartPosition(antPositionX, 0);

        Turtle turtle = new Turtle("череп");
        int turtlePositionX = random.nextInt(1, 1000);
        turtle.setStartPosition(turtlePositionX, 0);

        Hopper hopper = new Hopper("кузя");
        int hopperPositionX = random.nextInt(1, 1000);
        hopper.setStartPosition(hopperPositionX, 0);

        Something something = new Something("кто-то");
        int somethingPositionX = random.nextInt(1, 1000);
        something.setStartPosition(somethingPositionX, 0);

        while (stopper) {
            ant.move();
            turtle.move();
            hopper.move();
            something.move();
            if (victoryCheck(ant)) {stopper = false; System.out.println("Победил " + ant.name);}
            else if (victoryCheck(turtle)) {stopper = false; System.out.println("Победил " + turtle.name);}
            else if (victoryCheck(hopper)) {stopper = false; System.out.println("Победил " + hopper.name);}
            else if (victoryCheck(something)) {stopper = false; System.out.println("Победил " + something.name);}
        }
        System.out.println();
    }
    private boolean victoryCheck(Animal animal) {
        return (animal.getX() >= VICTORYX && animal.getX() <= VICTORYX + VICTORYWIDTH) && (animal.getY() >= VICTORYY && animal.getY() <= VICTORYY + VICTORYHEIGHT);
    }
    }
