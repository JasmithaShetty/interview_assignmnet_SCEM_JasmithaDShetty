public class problem1_test {
        public static void main(String[] args) {

                // testcase1
                test(
                                new int[] { 3, 2, 3, 9 });

                // testcase2
                test(
                                new int[] { 1, 2, 3, 4 });

                // testcase3
                test(
                                new int[] { 1, 2, 3, -1 });

                // testcase4
                test(
                                new int[] { 1, 2, -3, 4 });

                // testcase5
                test(
                                new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 });

                // testcase6
                test(
                                new int[] { 0, 0, 0, 1 });
        }

        private static void test(int[] array) {
                boolean result = problem1.duplicateChecker(array);
                System.out.println(result);
        }
}