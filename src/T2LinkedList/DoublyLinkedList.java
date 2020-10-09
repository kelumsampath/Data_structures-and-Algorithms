package T2LinkedList;

public class DoublyLinkedList {
    // properties
    private DLLNode head;
    private DLLNode tail;
    private int length;

    // Create a new empty list.
    public DoublyLinkedList() {
        head = new DLLNode(Integer.MIN_VALUE,null,null);
        tail = new DLLNode(Integer.MIN_VALUE, head, null);
        head.setNext(tail);
        length = 0;
    }
}
