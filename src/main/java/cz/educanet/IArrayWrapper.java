package cz.educanet;

import java.util.Comparator;

public interface IArrayWrapper<T> {

     /**
      * Attempts to get element on the given index
      *
      * @param index Index
      * @return item
      * @throws ArrayIndexOutOfBoundsException If index is out of bounds
      */
     T get(int index) throws ArrayIndexOutOfBoundsException;

     /**
      * Returns first element
      *
      * @return first item
      */
     T getFirst();

     /**
      * Returns last element
      *
      * @return last item
      */
     T getLast();

     /**
      * Returns number of elements
      *
      * @return number of elements
      */
     T getCount();

     /**
      * Resizes and appends at the end of the array
      *
      * @param item Item to append
      * @return new array with the appended item
      */
     IArrayWrapper<T> append(T item);

     /**
      * Resizes and prepends an item at the end of the array
      *
      * @param item Item to prepend
      * @return new array with the prepended item
      */
     IArrayWrapper<T> prepend(T item);

     /**
      * Removes first found item from the array
      *
      * @param item Item to remove
      * @return new array without the passed item
      */
     IArrayWrapper<T> remove(T item);

     /**
      * Sorts the items in the array using the
      *  <a href="https://en.wikipedia.org/wiki/Selection_sort">selection sort</a>) algorithm
      *
      * @return new sorted array
      */
     IArrayWrapper<T> sort();

     /**
      * Sorts the items in the array using the
      *  <a href="https://en.wikipedia.org/wiki/Bogosort">bogosort</a>) algorithm
      *
      * @return new sorted array
      */
     IArrayWrapper<T> bogoSort();

     /**
      * Finds maximal element in the array
      *
      * @param comparator Comparator
      * @return Maximal element
      */
     T maxBy(Comparator<T> comparator);

     /**
      * Finds minimal element in the array
      *
      * @param comparator Comparator
      * @return Minimal element
      */
     T minBy(Comparator<T> comparator);

     /**
      * Returns raw array wrapped by this class/interface
      *
      * @return Raw array
      */
     T[] getRaw();
}
