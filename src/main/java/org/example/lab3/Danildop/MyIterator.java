package org.example.lab3.Danildop;

import java.util.Iterator;
import java.util.function.Predicate;

public class MyIterator<T> implements Iterator<T> {
    private Iterator<T> iterator;
    private Predicate<T> predicate=null;

    private MyIterator(Iterator<T> iterator){
        this.iterator=iterator;
    }
    private MyIterator(Iterator<T> iterator,Predicate<T> predicate){
        this.iterator=iterator;
        this.predicate=predicate;
    }
    public boolean hasNext() {

        //если следующий элемент не подхдит по условию, смотрим следующий
        //перебираем элементы пока не найдем подходящий предикату или пока не кончится
        if(predicate==null)
            return iterator.hasNext();
        else {
            Iterator<T> newiterator= iterator;
            while(!predicate.test(newiterator.next())){
                newiterator= (Iterator<T>) newiterator.next();
            }
            return newiterator.hasNext();
        }
    }

    public T next() {
        return iterator.next();
    }

    public static <T> MyIterator<T>  fromIterator(Iterator<T> iterator){
        return new MyIterator<T>(iterator);
    }
    public MyIterator<T> filter(Predicate<T> predicate){
        return  new MyIterator<T>(iterator,predicate);
    }

}
