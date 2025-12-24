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
        try {
            linkedList.add(1, 13);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();

            System.out.println("Вышли за пределы массива. Введите другой индекс.");
        } catch (DemonsNumException e1) {
            System.out.println("Изыди");
            e1.printStackTrace();
            System.exit(666);
        }

        linkedList.sort();
        Node current = linkedList.getHead();
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
