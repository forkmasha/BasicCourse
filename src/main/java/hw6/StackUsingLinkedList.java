package hw6;

public class StackUsingLinkedList implements StackInterface {
    private static class Node {
        int data;
        Node link;
    }

    Node head;

    StackUsingLinkedList() {
        this.head = null;
    }

    public void push(int x) {
        Node temp = new Node();
        temp.data = x;
        temp.link = head;
        head = temp;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // using this function we will return the top element of the stack
    public int top() {
        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (head == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        head = (head).link;
    }

    public int size() { // calculate and return size of list

        int size = 0;

        Node current = head;

        if (head == null) {
            return 0;
        }

        while (current != null) {
            size++;
            current = current.link;
        }
        return size;
    }

}
