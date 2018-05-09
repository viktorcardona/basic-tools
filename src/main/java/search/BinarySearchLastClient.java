package search;

public class BinarySearchLastClient {

    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        BinarySearchLast last = new BinarySearchLast();
        long[] array = new long[10];
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

        int key = 7;
        int lastIndex = last.binarySearchLast(array, key);//-1 means not found

        System.out.printf(key+" ::lastIndex:: "+lastIndex);
    }
}
