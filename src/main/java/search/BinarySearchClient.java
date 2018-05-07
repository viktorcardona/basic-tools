package search;

import sort.QuickSort;
import util.RandomUtil;

/**
 * @author Victor Cardona
 */
public class BinarySearchClient {

    private static int size = 100_000_000;
    private static int max = 1_000_000_000;

    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        long[] array = getSortedArray();
        int index = RandomUtil.randomInt(array.length);
        long key = array[index];
        System.out.println("index: "+index+", key: " + key);

        long start0 = System.currentTimeMillis();
        BinarySearch binarySearch = new BinarySearch();
        int indexFound = binarySearch.binarySearch(array, key);
        long end0 = System.currentTimeMillis();

        System.out.println("Binary Search: ");
        System.out.println("Time: " + (end0 - start0)+" ms");
        System.out.println(index+" == " + indexFound);
        System.out.println("Found? " + (index == indexFound));

    }

    private static long[] getSortedArray() {
        long start0 = System.currentTimeMillis();
        long[] array = RandomUtil.generateRandomArray(size, max);
        long end0 = System.currentTimeMillis();

        System.out.println("Array: Generated: ");
        System.out.println("Time: " + ((end0 - start0)/1_000)+" segs");

        QuickSort quickSort = new QuickSort();
        long start = System.currentTimeMillis();
        quickSort.sort(array);
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("Array: Sorted: ");
        System.out.println("Time: " + ((end - start)/1_000)+" segs");
        System.out.println("Array: Result: " + RandomUtil.extractNumbersUntilSize(array, 10));
        return array;
    }



}
