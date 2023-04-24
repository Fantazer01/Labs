package org.example.lab3.Danildop;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MyIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;
    private Predicate<T> predicate = null;
    private T item = null;

    private MyIterator(Iterator<T> iterator){
        this.iterator=iterator;
    }
    private MyIterator(Iterator<T> iterator, Predicate<T> predicate){
        this.iterator = iterator;
        this.predicate = predicate;
        this.item = null;
    }
    public boolean hasNext() {
        //если следующий элемент не подхдит по условию, смотрим следующий
        //перебираем элементы пока не найдем подходящий предикату или пока не кончится
        if(predicate==null)
            return iterator.hasNext();

        while (iterator.hasNext()) {
            item = iterator.next();
            if (predicate.test(item))
                return true;
        }

        return false;
    }

    public T next() {
        if (predicate == null)
            return iterator.next();

        if (item == null)
            throw new NoSuchElementException();

        return item;
    }

    public static <T> MyIterator<T>  fromIterator(Iterator<T> iterator){
        return new MyIterator<T>(iterator);
    }
    public MyIterator<T> filter(Predicate<T> predicate){
        return  new MyIterator<T>(iterator,predicate);
    }

}
