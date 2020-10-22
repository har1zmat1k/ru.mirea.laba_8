package ru.mirea.laba_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;


public class WaitList<E> implements IWaitList<E>{
    private ConcurrentLinkedQueue<E> content;

    public WaitList() {
        this.content = new ConcurrentLinkedQueue<E>(new ArrayList<E>());
    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    public boolean canBeDeleted(E element){
        return element != this.content.toArray()[0];
    }

    public int size(){
        return this.content.size();
    }

    ////////////////////////////////
    @Override
    public String toString() {
        return content.toString();
    }

    @Override
    public E add(E element) {
        content.add(element);
        return null;
    }

    @Override
    public E remove(E element) {
        content.remove(element);
        return null;
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
