package cz.educanet;

import java.util.Comparator;

public interface IArrayWrapper {

     /**
      * Attempts to get element on the given index
      *
      * @param index Index
      * @return item
      * @throws ArrayIndexOutOfBoundsException If index is out of bounds
      */
     int get(int index) throws ArrayIndexOutOfBoundsException;

     /**
      * Returns first element
      *
      * @return first item
      */
     int getFirst();

     /**
      * Returns last element
      *
      * @return last item
      */
     int getLast();

     /**
      * Returns number of elements
      *
      * @return number of elements
      */
     int getCount();

     /**
      * Resizes and appends at the end of the array
      *
      * @param item Item to append
      * @return new array with the appended item
      */
     IArrayWrapper append(int item);

     /**
      * Resizes and prepends an item at the end of the array
      *
      * @param item Item to prepend
      * @return new array with the prepended item
      */
     IArrayWrapper prepend(int item);

     /**
      * Removes first found item from the array
      *
      * @param item Item to remove
      * @return new array without the passed item
      */
     IArrayWrapper remove(int item);

     /**
      * Sorts the items in the array using the
      *  <a href="https://en.wikipedia.org/wiki/Selection_sort">selection sort</a>) algorithm
      *
      * @return new sorted array
      */
     IArrayWrapper sort();

     /**
      * Sorts the items in the array using the
      *  <a href="https://en.wikipedia.org/wiki/Bogosort">bogosort</a>) algorithm
      *
      * @return new sorted array
      */
     IArrayWrapper bogoSort();

     /**
      * Finds maximal element in the array
      *
      * @return Maximal element
      */
     int max();

     /**
      * Finds minimal element in the array
      *
      * @return Minimal element
      */
     int min();

     /**
      * Returns raw array wrapped by this class/interface
      *
      * @return Raw array
      */
     int[] getRaw();
}
