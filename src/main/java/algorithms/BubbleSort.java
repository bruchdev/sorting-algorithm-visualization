package algorithms;

import java.util.ArrayList;

public class BubbleSort extends SortingAlgorithm {
    public BubbleSort(ArrayList<Integer> array, boolean printInConsole) {
        super(array, printInConsole);
    }

    @Override
    public void sort() {
        int SLEEP_DURATION = 10;
        int n = array.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (printInConsole) printArray(j, j + 1);
                comparisonCount++;
                if (array.get(j) > array.get(j + 1)) {
                    // Swap and visualize the result of the selection for this iteration
                    swapAndPrint(j, j + 1, SLEEP_DURATION);
                    swapCount++;

                }
            }
            // Mark the current position as sorted
            sortedIndices.add(n - i - 1);
        }
        // Final visualization with all elements highlighted in green
        if (printInConsole) printArray(-1, -1);
    }
}
