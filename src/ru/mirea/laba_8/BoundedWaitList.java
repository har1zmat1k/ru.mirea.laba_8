package ru.mirea.laba_8;


public class BoundedWaitList<E> extends WaitList<E>{
    private final int capacity;

    public BoundedWaitList(int capacity) {
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
        if(super.size() < capacity)
            super.add(element);
        else {
            System.out.println("Этот список ожидания имеет ограниченную емкость");
        }
        return null;
    }
}
