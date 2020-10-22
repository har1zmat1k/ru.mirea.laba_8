package ru.mirea.laba_8;


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
