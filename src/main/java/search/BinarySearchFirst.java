package search;

public class BinarySearchFirst extends BinarySearch {

    /**
     *
     * Returns the FIRST position in the array where the key is found.
     *
     * @param inputArr Sorted Array!
     * @param key Target Value
     * @return position of key or -1 if it does not exist
     */
    public int binarySearchFirst(long[] inputArr, long key) {

        int index = binarySearch(inputArr, key);

        if (index <= 0) {
            return index;
        }

        while ( (index - 1) >= 0 && inputArr[index - 1] == key) {
            index--;
        }

        return index;
    }

}
