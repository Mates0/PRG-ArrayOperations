package cz.educanet;

import java.util.Comparator;

public class ArrayWrapper implements IArrayWrapper {

    private final int[] array;

    public ArrayWrapper(int[] array) {
        this.array = array;
    }

    @Override
    public int get(int index) throws ArrayIndexOutOfBoundsException {
        return 0;
    }

    @Override
    public int getFirst() {
        return 0;
    }

    @Override
    public int getLast() {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public IArrayWrapper append(int item) {
        return null;
    }

    @Override
    public IArrayWrapper prepend(int item) {
        return null;
    }

    @Override
    public IArrayWrapper remove(int item) {
        return null;
    }

    @Override
    public IArrayWrapper sort() {
        return null;
    }

    @Override
    public IArrayWrapper bogoSort() {
        return null;
    }

    @Override
    public int max() {
        return 0;
    }

    @Override
    public int min() {
        return 0;
    }

    @Override
    public int[] getRaw() {
        return array;
    }
}
