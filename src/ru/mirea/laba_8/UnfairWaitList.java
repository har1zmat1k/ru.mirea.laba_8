package ru.mirea.laba_8;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
    }

    @Override
    public E remove(E element) {
        return super.remove(element);
    }

    public void moveToBack(E element){

    }
}
