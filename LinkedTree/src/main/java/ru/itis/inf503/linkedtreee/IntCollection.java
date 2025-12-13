package ru.itis.inf503.linkedtreee;

public interface IntCollection {

    void add(int value);

    int size();

    String[] path(int value);

    int max();

    int min();
}