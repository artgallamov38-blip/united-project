package ru.itis.inf503.artgame;

import java.util.Random;

public class Game {
    public final static int GAMEWIDTH = 1000;
    public final static int GAMEHEIGHT = 1000;
    public final static int VICTORYWIDTH = 400;
    public final static int VICTORYHEIGHT = 400;

    public void run() {
        Random random = new Random();
        int positionX = random.nextInt(1, 1000);
        Ant ant = new Ant("мура");
        ant.setStartPosition(positionX, 0);

        for (int i = 0; i < 100; i++) {
            ant.move();
            System.out.println("x: " + ant.getX() + " y: " + ant.getY());
        }
    }
}
