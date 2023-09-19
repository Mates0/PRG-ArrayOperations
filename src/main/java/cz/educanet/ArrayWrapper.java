package cz.educanet;

import java.util.Comparator;

public class ArrayWrapper implements IArrayWrapper {
    private final int[] array;

    public ArrayWrapper(int[] array) {
        this.array = array;
    }

    @Override
    public int get(int index) throws ArrayIndexOutOfBoundsException {
        return array[index];
    }

    @Override
    public int getFirst() {
        return array[0];
    }

    @Override
    public int getLast() {
        return array[array.length - 1];
    }

    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public IArrayWrapper append(int item) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = item;
        return new ArrayWrapper(newArray);
    }

    @Override
    public IArrayWrapper prepend(int item) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        newArray[0] = item;
        return new ArrayWrapper(newArray);
    }

    @Override
    public IArrayWrapper remove(int item) {
        for (int i = 0; i < array.length - 1; i++) {
            int iMin = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[iMin]) {
                    iMin = j;
                }
            }
        }
        return new ArrayWrapper(array);
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
