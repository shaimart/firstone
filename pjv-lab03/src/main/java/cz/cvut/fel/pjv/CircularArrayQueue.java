package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {
    public String[] elements;
    public int front;
    public int rear;
    public int size;

    public CircularArrayQueue(String[] elements, int front, int rear, int size) {
        this.elements = elements;
        this.front = front;
        this.rear = rear;
        this.size = size;
    }

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this(5);
    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        elements = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;}
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if (size == elements.length) {
            return true;}
        else {
            return false; }
    }

    @Override
    public boolean enqueue(String obj) {
        if (isFull() || obj == null) {
        return false;}
        else {
            if (rear == elements.length - 1) {
                rear =-1;
            }
            size +=1;
            rear +=1;
            elements[rear] = obj;
            return true;}
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
            return null;}
        String tmp = elements[front];
        if (front == elements.length - 1) {
            front =-1;}
        front +=1;
        size -=1;
        return tmp;
    }

    @Override
    public void printAllElements() {
        int i = front;
        while (i != rear +1) {
            System.out.println(elements[i]);
            i++;
            if (i == elements.length) {
                i = 0;
             }
            }
        }
    }

