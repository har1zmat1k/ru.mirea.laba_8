package ru.mirea.laba_8;

import java.util.Collection;

public interface IWaitList<E> {
    E add(E element);
    E remove(E element);
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}
