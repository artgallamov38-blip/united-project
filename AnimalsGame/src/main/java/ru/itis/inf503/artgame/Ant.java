package ru.itis.inf503.artgame;

import java.util.Random;

public class Ant extends Animal {


    public Ant(String name) {
        //вызов констра предка
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
        //получаем псевдослучайное число
        int direction = random.nextInt(4);
        //0 - назад, 1 - право, 2 - вперёд, 3 - лево
        switch (direction) {
            case 0: if (y > 0) y--; break;
            case 1: if (x < Game.GAMEWIDTH) x++; break;
            case 2: if (y < Game.GAMEHEIGHT) y--; break;
            case 3: if (x > 0) x--; break;
        }

    }
}
