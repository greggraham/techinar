public class Test {
    int[] array = new int[] {1, 2, 3};

    static void increaseInt(int[] anIntArray) {
        anIntArray[0]++;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("First element of array is: " + t.array[0]);
        Test.increaseInt(t.array);
        System.out.println("First element of array is now: " + t.array[0]);
    }
}
