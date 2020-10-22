package ru.mirea.laba_8;


import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    public BoundedWaitList(ConcurrentLinkedQueue<E> content, int capacity) {
        super(content);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public E add(E element) {
        return super.add(element);
    }
}
