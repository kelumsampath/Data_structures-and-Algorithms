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

    // Get the value at a given position.
    public int get(int position) {
        return Integer.MIN_VALUE;
    }

    // Find the position of the head value that is equal to a given value.
    // The equals method us used to determine equality.
    public int getPosition(int data) {
        // go looking for the data
        DLLNode temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.getData() == data) {
                // return the position if found
                return pos;
            }
            pos += 1;
            temp = temp.getNext();
        }
        // else return -1
        return Integer.MIN_VALUE;
    }
}
