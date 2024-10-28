package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

class QuickSortTest {
    @Test
    public void testQuickSort_Sorted100() {
        ArrayList<Integer> testArray = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            testArray.add(i);
        }

        algorithms.QuickSort algo = new algorithms.QuickSort(testArray, false);
        algo.sort();

        for (int i = 1; i < testArray.size(); i++) {
            Assertions.assertTrue(testArray.get(i) >= testArray.get(i - 1));
        }
    }

    @Test
    public void testQuickSort_Unsorted100() {
        ArrayList<Integer> testArray = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            testArray.add(r.nextInt(100));
        }

        algorithms.QuickSort algo = new algorithms.QuickSort(testArray, false);
        algo.sort();

        for (int i = 1; i < testArray.size(); i++) {
            Assertions.assertTrue(testArray.get(i) >= testArray.get(i - 1));
        }
    }
}