package hw6;

public class DoublyLinkedListQueue implements QueueInterface {
    private class Node {
        int value;
        Node next;
    }

    private Node front;
    private Node rear;
    private int size;


    @Override
    public void enqueue(int value) {
        Node oldRear = rear;
        rear = new Node();
        rear.value = value;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        size++;
        System.out.println(value + " added to the queue");
    }

    @Override
    public int dequeue() {
        int value = front.value;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        size--;
        System.out.println(value + " removed from the queue");
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);

    }
}
