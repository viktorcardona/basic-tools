package search;

public class BinarySearchFirst {

    /**
     *
     * Returns the FIRST position in the array where the key is found.
     *
     * @param inputArr Sorted Array!
     * @param key Target Value
     * @return position of key or -1 if it does not exist
     */
    public int binarySearch(long[] inputArr, long key) {

        int index = new BinarySearch().binarySearch(inputArr, key);

        if (index <= 0) {
            return index;
        }

        while ( (index - 1) >= 0 && inputArr[index - 1] == key) {
            index--;
        }

        return index;
    }

}
