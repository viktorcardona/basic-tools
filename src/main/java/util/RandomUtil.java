package util;

import java.util.Random;

/**
 *
 */
public class RandomUtil {

    public static long[] generateRandomArray(int size, int maxValue) {
        long[] array = new long[size];
        for (int i=0; i<size; i++) {
            array[i] = randomize(maxValue);
        }
        return array;
    }

    public static String extractNumbersUntilSize(long[] array, int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            sb.append(",");
        }
        return sb.toString();
    }

    private static long randomize(int maxValue) {
        Random rand=new Random();
        return Math.abs(rand.nextLong() % maxValue);
    }

}
