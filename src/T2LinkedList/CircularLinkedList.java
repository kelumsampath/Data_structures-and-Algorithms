package T2LinkedList;

public class CircularLinkedList {
    protected CLLNode tail;
    protected int length;

    // Constructs a new circular list
    public CircularLinkedList(){
        tail = null;
        length = 0;
    }

    // Adds data to beginning of list
    public void add(int data){
        addToHead(data);
    }

    // Adds element to head of list
    public void addToHead(int data){
        CLLNode temp = new CLLNode(data);
        if (tail == null) { // first data added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.getNext());
            tail.setNext(temp);
        }
        length++;
    }
}
