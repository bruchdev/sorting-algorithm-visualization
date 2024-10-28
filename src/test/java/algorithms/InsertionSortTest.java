package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

class InsertionSortTest {
    @Test
    public void testInsertionSort_Sorted100() {
        ArrayList<Integer> testArray = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            testArray.add(i);
        }

        algorithms.InsertionSort algo = new algorithms.InsertionSort(testArray, false);
        algo.sort();

        for (int i = 1; i < testArray.size(); i++) {
            Assertions.assertTrue(testArray.get(i) >= testArray.get(i - 1));
        }
    }

    @Test
    public void testInsertionSort_Unsorted100() {
        ArrayList<Integer> testArray = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            testArray.add(r.nextInt(100));
        }

        algorithms.InsertionSort algo = new algorithms.InsertionSort(testArray, false);
        algo.sort();

        for (int i = 1; i < testArray.size(); i++) {
            Assertions.assertTrue(testArray.get(i) >= testArray.get(i - 1));
        }
    }

}