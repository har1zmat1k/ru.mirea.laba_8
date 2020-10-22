package ru.mirea.laba_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    private ConcurrentLinkedQueue<E> content;

    public WaitList() {
    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "sd";
    }

    ////////////////////////////////
    @Override
    public E add(E element) {
        return null;
    }

    @Override
    public E remove(E element) {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
