package search;

import java.util.Optional;

public class BinarySearchFirstLastClient {

    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        BinarySearchFirstLast firstLast = new BinarySearchFirstLast();
        long[] array = new long[13];
        array[0] = -1;
        array[1] = 2;
        array[2] = 7;
        array[3] = 7;
        array[4] = 7;
        array[5] = 7;
        array[6] = 7;
        array[7] = 7;
        array[8] = 9;
        array[9] = 9;
        array[10] = 10;
        array[11] = 10;
        array[12] = 11;

        int key = 7;
        Optional<Index> index = firstLast.binarySearchFirstLast(array, key);
        System.out.printf(key+" ::firstIndex:: "+index.map(Index::getFirst).orElse(-1)+" ::lastIndex:: "+index.map(Index::getLast).orElse(-1));
    }

}
