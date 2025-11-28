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
        int direction = random.nextInt(3);
        //0 - назад, 1 - право, 2 - вперёд, 3 - лево
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
        }
    }
}

