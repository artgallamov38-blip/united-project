package ru.itis.inf503.LinkedMassive;

public class LinkedList {
    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node last;
    private int size = 0;
    public int size() {
        return size;
    }
    public void append(int value) {
        Node newnode = new Node(value);
        newnode.next = null;
        this.last.next = newnode;
    }
    public void appIndex(int value, int index) {
        Node newnode = new Node(value);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = newnode;
        newnode.next = current.next.next;
    }
    public int pop() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        int val = current.next.value;
        current.next = null;
        return val;
    }
    public void remove(int index) {

        Node current = head;
    }
}
