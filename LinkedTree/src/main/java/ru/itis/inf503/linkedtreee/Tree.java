package ru.itis.inf503.linkedtreee;

/*
    значение в узлах левого поддерева <= знаяения в узле.
    Значения в узлах правого поддерева > значения в узлах
 */
/*
    Значения в узлах левого поддерева <= значению в узле
    Значения в узлах правого поддерева > значению в узле
 */
public class Tree implements IntCollection {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public String toString() {
            return String.valueOf(value);
        }
    }

    private Node root;
    private int size = 0;

    public String toString() {
        return print(root);
    }

    private String print(Node node) {
        if (node == null) {
            return "";
        }

        return node.value + ", " + print(node.left) + print(node.right);
    }

    public void add(int value) {
        if (root == null)
            root = new Node(value);
        else
            add(value, root);
        size++;
    }

    private void add(int value, Node node){
        if (value <= node.value) {
            if (node.left == null) { // добавляем в левое поддерево
                Node v = new Node(value);
                node.left = v;
                return;
            } else if (value < node.left.value){
                add(value, node.left);
            } else {
                Node v = new Node(value);
                v.left = node.left;
                node.left = v;
            }
        } else {
            if (node.right == null) { // добавляем в правое поддерево
                Node v = new Node(value);
                node.right = v;
                return;
            } else if (value >= node.right.value){
                add(value, node.right);
            } else {
                Node v = new Node(value);
                v.right = node.right;
                node.right = v;
            }
        }
    }

    public int size() {
        return size;
    }

    public int min() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public int max() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    public String[] path(int value) {
        if (root == null) {
            return new String[0];
        }

        String[] path = new String[size];
        int index = 0;

        Node current = root;
        path[index++] = "root";

        while (current != null) {
            if (value == current.value) {
                // обрезаем массив до фактического размера
                String[] result = new String[index];
                for (int i = 0; i < index; i++) {
                    result[i] = path[i];
                }
                return result;
            } else if (value < current.value) {
                current = current.left;
                if (current != null) {
                    path[index++] = "l";
                }
            } else {
                current = current.right;
                if (current != null) {
                    path[index++] = "r";
                }
            }
        }

        // если значение не найдено
        return new String[0];
    }



}