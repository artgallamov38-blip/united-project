package ru.itis.inf503.artgame;

import java.util.Random;

public class Something extends Animal {
    public Something(String name) {
        //вызов констра предка
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
        //получаем псевдослучайное число
        int xt = random.nextInt(1, 1001);
        int yt = random.nextInt(1, 1001);
        x = xt;
        y = yt;
        }
    }
