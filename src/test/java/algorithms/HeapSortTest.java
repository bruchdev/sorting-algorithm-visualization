package algorithms;

import org.junit.jupiter.api.Test;

public class HeapSortTest extends SortingAlgorithmTest {
    @Override
    @Test
    public void unsorted_nonUnique() {
        var arr = initializeUnsortedDuplicated();

        var algo = new HeapSort(arr, false);
        algo.sort();

        testArray(arr);
    }

    @Override
    @Test
    public void unsorted_unique() {
        var arr = initializeUnsortedUnique();

        var algo = new HeapSort(arr, false);
        algo.sort();

        testArray(arr);
    }

    @Override
    @Test
    public void sorted_nonUnique() {
        var arr = initializeSortedDuplicated();

        var algo = new HeapSort(arr, false);
        algo.sort();

        testArray(arr);
    }

    @Override
    @Test
    public void sorted_unique() {
        var arr = initializeSortedUnique();

        var algo = new HeapSort(arr, false);
        algo.sort();

        testArray(arr);
    }
}

