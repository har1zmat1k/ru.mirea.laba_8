package ru.mirea.laba_8;

import java.util.Collection;

public interface IWaitList<E> {
    public E add(E element);
    public E remove(E element);
    public boolean contains(E element);
    public boolean containsAll(Collection<E> c);
    public boolean isEmpty();
}
