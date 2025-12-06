package LinkedList;

public class LinkedList {
    public static class Node {
        private Node previous;
        public int value;
        public Node next;

        public Node(Node previous, int value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size = 0;

    //Getters
    public int getSize() {
        return size;
    }
    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public Node getNode(int index) {
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    //Methods
    public void add(int number) {
        if (this.size == 0) {
            Node newnode = new Node(null, number, null);
            this.head = newnode;
            this.tail = newnode;
        } else {
            Node secondTail = tail;
            tail = new Node(secondTail, number, null);
            secondTail.next = tail;
        }
        size++;
    }
     public void add(int number, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(number);
            return;
        }
        Node nextNode = getNode(index);
        Node previousNode = nextNode.previous;
        Node newNode = new Node(previousNode, number, nextNode);
        nextNode.previous = newNode;
        previousNode.next = newNode;
        size++;
     }

     public int pop() {
        if (this.size == 0) {
            throw new IndexOutOfBoundsException();
        }
        if (this.size == 1) {
            int value = this.head.value;
            this.head = null;
            size--;
            return value;
        }
        Node tailNode = this.tail;
        this.tail = tailNode.previous;
        this.tail.next = null;
        size--;
        return tailNode.value;
     }
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (this.size == 1) {
            int value = this.head.value;
            this.head = null;
            this.tail = null;
            size--;
            return value;
        }
        if (index == 0) {
            int value = this.head.value;
            this.head = this.head.next;
            this.head.previous = null;
            this.size--;
            return value;
        }
        if (index == this.size - 1) {
            return pop();
        }

        Node indexNode = getNode(index);
        Node previousNode = indexNode.previous;
        Node nextNode = indexNode.next;
        previousNode.next = nextNode;
        nextNode.previous = previousNode;
        size--;
        return indexNode.value;
    }


}
