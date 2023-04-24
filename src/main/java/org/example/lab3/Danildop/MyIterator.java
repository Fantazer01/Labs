package org.example.lab3.Danildop;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class MyIterator<T> implements Iterator<T> {
    private final Iterator<T> _iterator;
    private Predicate<T> _predicate = null;
    private T _item = null;
    private T _result = null;
    private BiFunction<T, T, T> _func = null;

    private MyIterator(Iterator<T> iterator){
        _iterator=iterator;
    }
    private MyIterator(Iterator<T> iterator, Predicate<T> predicate){
        _iterator = iterator;
        _predicate = predicate;
    }
    private MyIterator(Iterator<T> iterator, BiFunction<T, T, T> func) {
        _iterator = iterator;
        _func = func;
    }

    public boolean hasNext() {
        if (_predicate == null && _func == null)
            return _iterator.hasNext();
        if (_predicate != null)
            return predicateHasNext();
        return funcHasNext();
    }

    private boolean predicateHasNext() {
        while (_iterator.hasNext()) {
            _item = _iterator.next();
            if (_predicate.test(_item))
                return true;
        }
        return false;
    }

    private boolean funcHasNext() {
        if (_iterator.hasNext()) {
            T item1 = _iterator.next();
            T item2;
            if (_iterator.hasNext()) {
                item2 = _iterator.next();
            } else
                item2 = item1;
            _result = _func.apply(item1, item2);
            return true;
        }
        return false;
    }

    public T next() {
        if (_predicate == null && _func == null)
            return _iterator.next();

        if (_predicate != null)
            return predicateNext();

        return funcNext();
    }

    private T predicateNext() {
        if (_item == null)
            throw new NoSuchElementException();
        T item = _item;
        _item = null;
        return item;
    }

    private T funcNext() {
        if (_result == null)
            throw new NoSuchElementException();
        T result = _result;
        _result = null;
        return result;
    }

    public static <T> MyIterator<T>  fromIterator(Iterator<T> iterator){
        return new MyIterator<T>(iterator);
    }
    public MyIterator<T> filter(Predicate<T> predicate){
        return  new MyIterator<T>(this, predicate);
    }
    public MyIterator<T> reduce(BiFunction<T, T, T> func) {
        return new MyIterator<T>(this, func);
    }

}
