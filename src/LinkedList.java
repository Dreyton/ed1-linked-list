public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void addAtStart(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node<T> aux = head;
        head = newNode;
        newNode.setNext(aux);
        size++;

    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        String result = "[";
        Node<T> aux = head;
        while (aux.getNext() != null) {
            result += aux.getValue() + ", ";
            aux = aux.getNext();
        }
        result += aux.getValue() + "]";
        return result;
    }
}
