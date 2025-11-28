package ru.itis.inf503.artgame;

public abstract class Animal {
    public String name;
    protected int x;
    protected int y;

    public Animal(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    public void setStartPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public abstract void move();
}
