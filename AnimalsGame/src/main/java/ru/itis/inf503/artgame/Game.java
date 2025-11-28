package ru.itis.inf503.artgame;

import java.util.Random;

public class Game {
    public final static int GAMEWIDTH = 1000;
    public final static int GAMEHEIGHT = 1000;
    public final static int VICTORYWIDTH = 400;
    public final static int VICTORYX = 400;
    public final static int VICTORYHEIGHT = 400;
    public final static int VICTORYY = 400;

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
        turtle.setStartPosition(hopperPositionX, 0);

        Something something = new Something("нечто");
        int somethingPositionX = random.nextInt(1, 1000);
        turtle.setStartPosition(somethingPositionX, 0);

        while (stopper) {
            ant.move();
            turtle.move();
            hopper.move();
            something.move();
            if (victoryCheck(ant)) {stopper = false; System.out.println("Победил " + ant.name);}
            if (victoryCheck(turtle)) {stopper = false; System.out.println("Победил " + turtle.name);}
            if (victoryCheck(hopper)) {stopper = false; System.out.println("Победил " + hopper.name);}
            if (victoryCheck(something)) {stopper = false; System.out.println("Победил " + something.name);}
        }
        System.out.println();
    }
    private boolean victoryCheck(Animal animal) {
        return (animal.getX() >= VICTORYX && animal.getX() <= VICTORYX + VICTORYWIDTH) && (animal.getY() >= VICTORYY && animal.getY() <= VICTORYY + VICTORYHEIGHT);
    }
    }
