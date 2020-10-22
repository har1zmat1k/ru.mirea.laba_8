package ru.mirea.laba_8;


public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {

    }
    @Override
    public E remove(E element) {
        if( super.canBeDeleted(element))
            super.remove(element);
        else{
            System.out.println("Элемент является первым в списке");
        }
        return null;
    }

    public void moveToBack(E element){
        if(!super.canBeDeleted(element)){
            super.remove(element);
            super.add(element);
        }
        else {
            System.out.println("Элемент не является первым в списке");
        }
    }
}
