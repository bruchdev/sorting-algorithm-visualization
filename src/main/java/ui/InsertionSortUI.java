package ui;

import static ui.UI.array;

class InsertionSortUI {
    protected static void start() {
        Utils.prepareForSorting("Insertion sort");
        algorithms.InsertionSort algo = new algorithms.InsertionSort(array, true);
        algo.printArray();
        Utils.sleepALittle(2000);
        algo.sort();
        Utils.sleepALittle(2000);
        algo.clearScreenAndPrintStatistics("Insertion Sort");
        Utils.sleepALittle(6000);
    }
}
