package search;

public class BinarySearchLast {

    /**
     *
     * Returns the LAST position in the array where the key is found.
     *
     * @param inputArr Sorted Array!
     * @param key Target Value
     * @return position of key or -1 if it does not exist
     */
    public int binarySearch(long[] inputArr, long key) {
        int index = new BinarySearch().binarySearch(inputArr, key);

        if (index == -1) {
            return index;
        }

        while ( (index + 1) < inputArr.length && inputArr[index + 1] == key) {
            index++;
        }

        return index;
    }


}
