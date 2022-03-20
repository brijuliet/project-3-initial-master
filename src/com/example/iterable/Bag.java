package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    List<T> bagList;

    public Bag() {
        bagList = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.bagList.isEmpty();
    }

    @Override
    public int size() {
        return bagList.size();
    }

    @Override
    public void add(Object item) {
        this.bagList.add((T) item);
    }

    @Override
    public Iterator<T> iterator() {
        return bagList.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }
}
