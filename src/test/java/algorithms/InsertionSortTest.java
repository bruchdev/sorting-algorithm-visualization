package algorithms;

import org.junit.jupiter.api.Test;

class InsertionSortTest extends SortingAlgorithmTest {
    @Override
    @Test
    public void unsorted_nonUnique() {
        var arr = initializeUnsortedNonUnique();

        var algo = new InsertionSort(arr, false);
        algo.sort();

        testArray(arr);
    }

    @Override
    @Test
    public void unsorted_unique() {
        var arr = initializeUnsortedUnique();

        var algo = new InsertionSort(arr, false);
        algo.sort();

        testArray(arr);
    }

    @Override
    @Test
    public void sorted_nonUnique() {
        var arr = initializeSortedNonUnique();

        var algo = new InsertionSort(arr, false);
        algo.sort();

        testArray(arr);
    }

    @Override
    @Test
    public void sorted_unique() {
        var arr = initializeSortedUnique();

        var algo = new InsertionSort(arr, false);
        algo.sort();

        testArray(arr);
    }
}