
public class SLList<T> implements List<T> {

    private Node<T> head;
    private int length = 0;

    @Override
    public void add(int index, T e) { // add node to linked list
        if (index > this.length) {
            throw new IndexOutOfBoundsException("Marah :) add Exception");
        }
        this.length += 1;
        if (index == 0) {
            this.head = new Node<>(e, this.head);

        } else {
            Node<T> pred = nodeAt(index - 1);
            pred.next = new Node<>(e, pred.next);

        }

    }

    public int getSize() {  // get size by attribute
        return this.length;
    }

    @Override
    public T remove(int index) {  // remove node from linked list
        if (index < 0) {
            return (T) "negative Index";
        }
        if (head == null) {
            return null;
        }
        if (index != 0) {
            this.length -= 1;
            Node<T> a1 = nodeAt(index - 1);  // previous
            Node<T> a2 = nodeAt(index); // this node
            T removed = a2.value;
            a1.next = a2.next;
            return removed;
        } else {
            this.length -= 1;
            T removed = this.head.value;
            this.head = head.next;
            return removed;
        }
    }

    @Override
    public int size() {
        int sizeList = 0;
        Node<T> pred = this.head;
        while (true) {
            if (pred == null) {
                break;
            }
            sizeList++;
            pred = pred.next;
        }
        return sizeList;
    }

    public SLList() {   // constructor
        this.head = null;
    }

    private Node<T> nodeAt(int index) {   // get node at index
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public boolean isEmpty() {   // to check if list is empty
        return this.head == null;
    }

    @Override
    public T get(int index) {
        if (index >= this.length) {
            throw new IndexOutOfBoundsException("Marah :) get Exception");
        }
        return nodeAt(index).value;
    }
}
