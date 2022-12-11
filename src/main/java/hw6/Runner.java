package hw6;

public class Runner {
    public static void main(String[] args) {
        StackUsingLinkedList stk = new StackUsingLinkedList();
        System.out.println("Task 1");
        System.out.println("Stack size " + stk.size());
        System.out.println("Check is Empty " + stk.isEmpty());
        System.out.println();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        stk.push(8);
        stk.push(9);
        stk.push(10);

        System.out.println("Stack.size " + stk.size());
        System.out.println("Check is Empty " + stk.isEmpty());

        System.out.printf("\nTop element is %d\n ", stk.top());
        System.out.println("Stack after popping 2 times ");
        stk.pop();
        stk.pop();
        System.out.printf("\nTop element is %d\n ", stk.top());

        System.out.println();
        System.out.println("Task 2");
        DoublyLinkedListQueue que = new DoublyLinkedListQueue();
        System.out.println("size " + que.size());
        System.out.println("Check is Empty " + que.isEmpty());
        que.enqueue(2);
        que.enqueue(5);
        que.enqueue(7);
        System.out.println("size " + que.size());
        System.out.println("Check is Empty " + que.isEmpty());
        que.dequeue();
        System.out.println("size " + que.size());

        System.out.println();
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("Task 3");
        System.out.println("size " + list.size());
        System.out.println("Check is Empty " + list.isEmpty());
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(5);
        list.printValue();
        list.add(1, 12);
        list.addLast(30);
        list.printValue();
        System.out.println("size " + list.size());
        System.out.println("Check is Empty " + list.isEmpty());
    }
}

