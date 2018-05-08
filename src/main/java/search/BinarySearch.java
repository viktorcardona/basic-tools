package search;

/**
 *
 */
public class BinarySearch {

    /**
     *
     * Returns the position in the array where the key is found.
     * The position returned is not guaranteed to be the first or last position where the key is found in the sorted array.
     *
     * @param inputArr Sorted Array!
     * @param key Target Value
     * @return position of key or -1 if it does not exist
     */
    public int binarySearch(long[] inputArr, long key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
