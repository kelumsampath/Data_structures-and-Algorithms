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

    // Adds element to tail of list
    public void addToTail(int data){
        // new entry:
        addToHead(data);
        tail = tail.getNext();
    }

    // Returns data at head of list
    public int peek(){
        return tail.getNext().getData();
    }

    // Returns data at tail of list
    public int tailPeek(){
        return tail.getData();
    }

    // Returns and removes data from head of list
    public int removeFromHead(){
        CLLNode temp = tail.getNext(); // ie. the head of the list
        if (tail == tail.getNext()) {
            tail = null;
        } else {
            tail.setNext(temp.getNext());
            temp.setNext(null); // helps clean things up; temp is free
        }
        length--;
        return temp.getData();
    }

    // Returns and removes data from tail of list
    public int removeFromTail(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        CLLNode finger = tail;
        while (finger.getNext() != tail) {
            finger = finger.getNext();
        }
        // finger now points to second-to-last data
        CLLNode temp = tail;
        if (finger == tail)	{
            tail = null;
        } else {
            finger.setNext(tail.getNext());
            tail = finger;
        }
        length--;
        return temp.getData();
    }

    // Returns true if no elements in list
    public boolean isEmpty(){
        return tail == null;
    }


}
