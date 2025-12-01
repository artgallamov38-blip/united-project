package ru.itis.inf503.massive;

public class MainLinkedList {
    public static void main(String[] args) {
        //создание списка
        Node node0 = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        Node head = node0;

        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println(current.value);
        Node last = new Node(123);
        current.next = last;
        current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current = head;
        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        current = head;
        for (int i = 0; i < 1; i++) {
            current = current.next;
            if (i == 0) {current.next = current.next.next;}
        }
        current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }
}
//вставка в середину вставка в начало удаление начала и тд
