package ru.itis.inf503.linkedtreee;

/*
    Значение в узлах левого поддерева <= значения в узле.
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
        return node.value + " " + print(node.left) + print(node.right);
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            size++;
        } else
            add(value, root);
        size++;
    }

    private void add(int value, Node node){
        if (value <= node.value) { //влево
            if (node.left == null) { //если нащупали конец, то добавляем
                node.left = new Node(value);
                size++;
            } else { //если нет, то проверяем дальше
                add(value, node.left);
            }
        } else { //вправо
            if (node.right == null) { //если нащупали конец, то добавляем
                node.right = new Node(value);
                size++;
            } else { //если нет, то проверяем дальше
                add(value, node.right);
            }
        }
    }

    public int size() {
        return size;
    }

    public int min() { //минимальный элемент будет всегда на самой левой, из-за "сортировки" дерева
        if (root == null) {
            throw new EmptyTreeException();
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public int max() { //максимальный элемент всегда на самой правой позиции, из-за "сортировки" дерева
        if (root == null) {
            throw new EmptyTreeException();
        }
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    public String[] path(int value) {
        if (root == null) {
            throw new EmptyTreeException();
        }

        String[] path = new String[size];
        int index = 0;

        Node current = root;
        path[index++] = "root";

        while (current != null) { //пока не дошли до конца ищем элемент
            if (value == current.value) {
                // обрезаем массив до фактического размера
                String[] result = new String[index];
                for (int i = 0; i < index; i++) {
                    result[i] = path[i]; //перекопируем элементы в нормальный по размеру массив
                }
                return result;
            } else if (value <= current.value) { //если меньше, то идём влево
                current = current.left;
                if (current != null) { //если не наткнулись на конец, то ставим l в путь
                    path[index++] = "l";
                }
            } else { //если больше, то вправо
                current = current.right;
                if (current != null) { //если не наткнулись на конец, то ставим r в путь
                    path[index++] = "r";
                }
            }
        }

        // если значение не найдено
        throw new NotFoundException();
    }



}