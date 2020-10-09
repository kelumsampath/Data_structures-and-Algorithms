package T2LinkedList;

public class DLLNode {
    public int data;
    public DLLNode prev;
    public DLLNode next;

    public DLLNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}
