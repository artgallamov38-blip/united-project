package ru.itis.inf503.artgame;

import java.util.Random;

public class Hopper extends Animal {
    public Hopper(String name) {
        //вызов констра предка
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
        //получаем псевдослучайное число
        int direction = random.nextInt(4);
        //0 - вправо, 1 - вперёд, 2 - лево, 3 - назад
        switch (direction) {
            case 0:
                if (x < Game.GAMEWIDTH) x++;
                break;
            case 1:
                if (y < Game.GAMEHEIGHT) y += 2;
                break;
            case 2:
                if (x > 0) x--;
                break;
            case 3:
                if (y > 0) y--;
        }
    }
}

