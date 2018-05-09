package search;

import java.util.Optional;

public class BinarySearchFirstLast extends BinarySearch {

    public Optional<Index> binarySearchFirstLast(long[] inputArr, final long key) {

        int index = binarySearch(inputArr, key);

        if (index == -1) {
            return Optional.empty();
        }

        final int indexCopy = index;
        final int first = getFirstIndex(index, inputArr, key);
        final int last =  getLastIndex(indexCopy, inputArr, key);
        return Optional.of(new Index(first, last));
    }

    private int getFirstIndex(int index, final long[] inputArr, final long key) {

        if (index <= 0) {
            return index;
        }

        while ( (index - 1) >= 0 && inputArr[index - 1] == key) {
            index--;
        }

        return index;
    }

    public int getLastIndex(int index, final long[] inputArr, final long key) {

        if (index == -1) {
            return index;
        }

        while ( (index + 1) < inputArr.length && inputArr[index + 1] == key) {
            index++;
        }

        return index;
    }

}
