package search;

public class BinarySearchFirstClient {

    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        BinarySearchFirst first = new BinarySearchFirst();
        long[] array = new long[10];
        array[0] = -1;
        array[1] = -1;
        array[2] = 7;
        array[3] = 7;
        array[4] = 7;
        array[5] = 7;
        array[6] = 7;
        array[7] = 7;
        array[8] = 9;
        array[9] = 9;

        int key = 7;
        int lastIndex = first.binarySearchFirst(array, key);//-1 means not found

        System.out.printf(key+" ::firstIndex:: "+lastIndex);
    }

}
