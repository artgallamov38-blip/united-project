package LinkedList;

public class NedoNode {
    NedoNode next;
    NedoNode previous;
    int value;
    public NedoNode(NedoNode previous, int value, NedoNode next) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }
}
