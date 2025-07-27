//Function to check for duplicates
public class problem1 {

    public static boolean duplicateChecker(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
