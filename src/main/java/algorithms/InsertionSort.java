package algorithms;

import ui.Utils;

import java.util.ArrayList;
import java.util.Set;


public class InsertionSort extends SortingAlgorithm {

    public InsertionSort(ArrayList<Integer> array, boolean printInConsole) {
        super(array, printInConsole);
    }

    @Override
    public void sort() {
        int n = array.size();

        for (int i = 1; i < n; i++) {

            int sleepDuration = 20; // Dynamic delay for shifts and comparisons
            int highlightSortedElementDelay = 40; // Delay specifically for highlighting sorted elements

            int key = array.get(i);
            int j = i - 1;


            // Highlight the key element: = YELLOW =
            if (printInConsole) highlightElement(array, i, "\033[33m", sleepDuration);

            // Shift elements in sorted portion to make space for key: = RED =
            while (j >= 0 && array.get(j) > key) {
                comparisonCount++;
                array.set(j + 1, array.get(j));
                if (printInConsole) highlightElement(array, j + 1, "\033[31m", sleepDuration);
                j--;
            }

            // Show target position in: = BLUE =  before insertion
            if (printInConsole) highlightElement(array, j + 1, "\033[34m", sleepDuration * 2);
            array.set(j + 1, key);
            swapCount++;

            // Delay and mark as sorted in: = GREEN =
            if (printInConsole) {
                try {
                    Thread.sleep(highlightSortedElementDelay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            sortedIndices.add(j + 1);
            if (printInConsole) printArray(-1, -1);
        }

        if (printInConsole) {
            highlightEverything();
            printArray(-1, -1);
        }
    }

    private void highlightElement(ArrayList<Integer> array, int index, String color, int sleepDuration) {
        final String SQUARE = "◼";
        StringBuilder output = new StringBuilder();

        int maxHeight = Utils.findMax(array);
        for (int row = maxHeight; row > 0; row--) {
            output.append("\033[2K");
            for (int col = 0; col < array.size(); col++) {
                int element = array.get(col);
                if (element >= row) {
                    if (col == index) {
                        output.append(color).append(Utils.getCurrentSymbol()).append(RESET); // Highlight element in specified color
                    } else {
                        output.append(Utils.getCurrentSymbol());
                    }
                } else {
                    output.append(" ");
                }
            }
            output.append("\n");
        }

        System.out.print(output.toString());
        System.out.print("\033[" + maxHeight + "F");

        try {
            Thread.sleep(sleepDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


