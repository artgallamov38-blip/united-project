package ru.itis.inf503.linkedtreee;

public class MainTreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(-2);
        tree.add(0);
        tree.add(5);
        tree.add(2);
        tree.add(-1);
        System.out.println(tree);
        System.out.println(tree.max());
        System.out.println(tree.min());
        try {
            for (String i : tree.path(2)) {
                System.out.print(i + " ");
            }
        } catch (NotFoundException e) {
            System.err.println("Указанный элемент не найден");
            System.exit(2);
        }
    }
}
