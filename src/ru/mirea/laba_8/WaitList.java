package ru.mirea.laba_8;

import java.util.Collection;

public class WaitList<E> implements IWaitList<E>{

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
