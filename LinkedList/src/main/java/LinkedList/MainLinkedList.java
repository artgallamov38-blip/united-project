package LinkedList;
import LinkedList.LinkedList.Node;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(-3);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.sort();
        Node current = linkedList.getHead();
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
