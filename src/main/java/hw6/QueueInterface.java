package hw6;

public interface QueueInterface {
    void enqueue(int value);
    int dequeue();
    int size();
    boolean isEmpty();
}
