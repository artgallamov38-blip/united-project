package ru.itis.inf503.linkedtreee;

public class MainTreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(2);
        tree.add(5);
        tree.add(1000);
        tree.add(4);
        tree.add(3);
        tree.add(-1);
        tree.add(0);
        tree.add(2);
        tree.add(100);
        System.out.println(tree);
        System.out.println(tree.max());
        System.out.println(tree.min());
        for (String i : tree.path(1000)) {
            System.out.println(i);
        }
    }
}
