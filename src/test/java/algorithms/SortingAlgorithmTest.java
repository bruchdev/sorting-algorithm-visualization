package algorithms;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class SortingAlgorithmTest {

    public abstract void unsorted_nonUnique();

    public abstract void unsorted_unique();

    public abstract void sorted_nonUnique();

    public abstract void sorted_unique();

    protected ArrayList<Integer> initializeUnsortedNonUnique() {
        var arr = fillNonUniqueElements();
        Collections.shuffle(arr);
        return arr;
    }

    protected ArrayList<Integer> initializeUnsortedUnique() {
        var arr = fillUniqueElements();
        Collections.shuffle(arr);
        return arr;
    }

    protected ArrayList<Integer> initializeSortedNonUnique() {
        var arr = fillNonUniqueElements();
        Collections.sort(arr);
        return arr;
    }

    protected ArrayList<Integer> initializeSortedUnique() {
        var arr = fillNonUniqueElements();
        Collections.sort(arr);
        return arr;
    }

    private ArrayList<Integer> fillUniqueElements() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(i);
        }
        return arr;
    }

    private ArrayList<Integer> fillNonUniqueElements() {
        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            arr.add(r.nextInt(100));
        }
        return arr;
    }

    protected void testArray(ArrayList<Integer> testArray) {
        for (int i = 1; i < testArray.size(); i++) {
            Assertions.assertTrue(testArray.get(i) >= testArray.get(i - 1));
        }
    }
}
