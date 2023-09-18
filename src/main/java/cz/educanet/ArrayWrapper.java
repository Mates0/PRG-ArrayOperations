package cz.educanet;

import java.util.Comparator;

public class ArrayWrapper<T> implements IArrayWrapper<T> {

    private final T[] array;

    public ArrayWrapper(T[] array) {
        this.array = array;
    }

    @Override
    public T get(int index) throws ArrayIndexOutOfBoundsException {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T getCount() {
        return null;
    }

    @Override
    public IArrayWrapper<T> append(T item) {
        return null;
    }

    @Override
    public IArrayWrapper<T> prepend(T item) {
        return null;
    }

    @Override
    public IArrayWrapper<T> remove(T item) {
        return null;
    }

    @Override
    public IArrayWrapper<T> sort() {
        return null;
    }

    @Override
    public IArrayWrapper<T> bogoSort() {
        return null;
    }

    @Override
    public T maxBy(Comparator<T> comparator) {
        return null;
    }

    @Override
    public T minBy(Comparator<T> comparator) {
        return null;
    }

    @Override
    public T[] getRaw() {
        return array;
    }
}
