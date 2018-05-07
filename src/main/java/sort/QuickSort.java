package sort;

/**
 *
 */
public class QuickSort {

    private long array[];
    private int length;

    public void sort(long[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number => middle index number
        long pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }

        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private void swap(int i, int j) {
        long temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
