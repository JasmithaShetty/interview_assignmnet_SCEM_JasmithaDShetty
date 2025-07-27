public class problem2_test {

    public static void main(String[] args) {

        // testcase1
        test(new int[] { 0, 1, 0, 4, 21 });

        // testcase2
        test(new int[] { 0, 1, 0, 3, 12 });

        // testcase3
        test(new int[] { 1, 2, 3, 4 });

        // testcase4
        test(new int[] { 0, 0, 0, 0 });
    }

    private static void test(int[] array) {

        // calling the function to rearrange the array
        problem2.reArranged(array);
        printarray(array);
        System.out.println();
    }

    private static void printarray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] ");
    }
}