package ui;

import static ui.UI.array;

public class HeapSortUI {
    public static void start() {
        Utils.prepareForSorting("Heap Sort");
        algorithms.HeapSort algo = new algorithms.HeapSort(array, true);
        algo.printArray();
        Utils.sleepALittle(2000);
        algo.sort();
        Utils.sleepALittle(2000);
        algo.clearScreenAndPrintStatistics("Heap Sort");
        Utils.sleepALittle(6000);
    }
}
