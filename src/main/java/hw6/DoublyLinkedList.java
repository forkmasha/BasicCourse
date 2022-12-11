package hw6;
public class DoublyLinkedList implements LinkedListInterface {
    private class Node {
        private int value;
        private Node next;
        private Node previous;
        public void display() {
            System.out.print(value + ", ");
        }
    }
    private int size;
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    @Override
    public void addFirst(int value) {
        {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = head;
            newNode.previous = null;
            if (head != null)
                head.previous = newNode;
            head = newNode;
            if (tail == null)
                tail = newNode;
            size++;
        }
    }
    @Override
    public void addLast(int value) {
        {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = null;
            newNode.previous = tail;
            if (tail != null)
                tail.next = newNode;
            tail = newNode;
            if (head == null)
                head = newNode;
            size++;
        }
    }
    @Override
    public void add(int index, int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        newNode.previous = null;

        if (index < 0) {
            System.out.println("index should be >= 0.");
        } else if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            for (int i = 1; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                newNode.next = temp.next;
                newNode.previous = temp;
                temp.next = newNode;
                if (newNode.next != null)
                    newNode.next.previous = newNode;
            } else {
                System.out.println("The previous node is null.");
            }
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void printValue() {
        Node current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
