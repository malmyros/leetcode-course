package com.example.additional.ringbuffer;

public class RingBuffer<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private final int capacity;

    private E[] data;

    private volatile int readSequence;

    private volatile int writeSequence;

    public RingBuffer(int capacity) {
        this.capacity = (capacity < 1) ? DEFAULT_CAPACITY : capacity;
        this.data = (E[]) new Object[this.capacity];
        this.readSequence = 0;
        this.writeSequence = -1;
    }

    public int size() {
        return (writeSequence - readSequence) + 1;
    }

    private boolean isFull() {
        return (writeSequence - readSequence) + 1 == capacity;
    }

    private boolean isEmpty() {
        return writeSequence < readSequence;
    }

    public boolean offer(E element) {
        if (!isFull()) {
            int nextWriteSequence = writeSequence + 1;
            data[nextWriteSequence] = element;
            writeSequence++;
            return true;
        }
        return false;
    }

    public E poll() {
        if (!isEmpty()) {
            E nextValue = (E) data[readSequence % capacity];
            readSequence++;
            return nextValue;
        }
        return null;
    }

    public static void main(String[] args) {

        RingBuffer<Integer> ringBuffer = new RingBuffer<>(5);
        System.out.println("Capacity: " + ringBuffer.capacity);

        System.out.println("Size: " + ringBuffer.size());
        System.out.println("Is empty: " + ringBuffer.isEmpty());

        ringBuffer.offer(1);
        System.out.println("Size: " + ringBuffer.size());
        System.out.println("Is empty: " + ringBuffer.isEmpty());

        Integer item = ringBuffer.poll();

        System.out.println("Item: " + item);
        System.out.println("Size: " + ringBuffer.size());
        System.out.println("Is empty: " + ringBuffer.isEmpty());
    }
}
