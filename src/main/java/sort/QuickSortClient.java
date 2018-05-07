package sort;

import util.RandomUtil;

/**
 * @author Victor Cardona
 */
public class QuickSortClient {

    private static int size = 100_000_000;
    private static int max = 1_000_000_000;

    public static void main(String[] args) {
        test01();
    }

    public static void test01() {

        long start0 = System.currentTimeMillis();
        long[] array = RandomUtil.generateRandomArray(size, max);
        long end0 = System.currentTimeMillis();

        System.out.println("Array: Generation: ");
        System.out.println("Time: " + ((end0 - start0)/1_000)+" segs");

        QuickSort quickSort = new QuickSort();
        long start = System.currentTimeMillis();
        quickSort.sort(array);
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("Array: Sorted: ");
        System.out.println("Time: " + ((end - start)/1_000)+" segs");
        System.out.println("Array: Result: " + RandomUtil.extractNumbersUntilSize(array, 10));

    }

}
