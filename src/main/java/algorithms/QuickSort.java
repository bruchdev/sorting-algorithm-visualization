package algorithms;

import java.util.ArrayList;
import java.util.ServiceLoader;

public class QuickSort extends SortingAlgorithm {

    public QuickSort(ArrayList<Integer> array, boolean printInConsole) {
        super(array, printInConsole);
    }

    @Override
    public void sort() {
        int SLEEP_DURATION = 10;
        Thread t = NewQuickSortThread(0, array.size() - 1, SLEEP_DURATION);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (printInConsole) printArray(-1, -1);
    }

    Thread NewQuickSortThread(int start, int end, int sleepDuration) {
        return new Thread(() -> {
            if (start < end) {
                int pi = partition(start, end, sleepDuration);
                Thread left = NewQuickSortThread(start, pi - 1, sleepDuration);
                Thread right = NewQuickSortThread(pi + 1, end, sleepDuration);

                left.start();
                right.start();

                try {
                    left.join();
                    right.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    int partition(int start, int end, int sleepDuration) {
        int pivotValue = array.get(end);
        int partitionIndex = start;

        for (int i = start; i < end; i++) {
            if(printInConsole) printArray(i, end);
            if (array.get(i) <= pivotValue) {
                swapAndPrint(partitionIndex, i, sleepDuration);
                swapCount++;
                partitionIndex++;
                if (array.get(i) == pivotValue) sortedIndices.add(i);
            }

            comparisonCount++;
        }

        swapAndPrint(partitionIndex, end, sleepDuration);
        swapCount++;
        sortedIndices.add(partitionIndex);
        if (start == end - 1) {
            sortedIndices.add(start);
            sortedIndices.add(end);
        }

        return partitionIndex;
    }

}
