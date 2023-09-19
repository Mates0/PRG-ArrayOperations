package cz.educanet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {

    @Test
    void get() {
        int[] array = {1,2,3};
        ArrayWrapper arrayWrapper = new ArrayWrapper(array);
        assertEquals(2, arrayWrapper.get(1));
    }

    @Test
    void getFirst() {
        int[] array = {1,2,3};
        ArrayWrapper arrayWrapper = new ArrayWrapper(array);
        assertEquals(1, arrayWrapper.get(0));
    }

    @Test
    void getLast() {
    }

    @Test
    void getCount() {
    }

    @Test
    void append() {
    }

    @Test
    void prepend() {
    }

    @Test
    void remove() {
    }

    @Test
    void sort() {
    }

    @Test
    void bogoSort() {
    }

    @Test
    void max() {
    }

    @Test
    void min() {
    }

    @Test
    void getRaw() {
    }
}