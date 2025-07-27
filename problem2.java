//Function to check for duplicates
public class problem2 {

    public static void reArranged(int[] arr) {

        // checking if the array is empty
        if (arr.length == 0) {
            return;
        }

        // initializing position for non-zero elements
        int position = 0;

        // checking if there are any non-zero elements
        for (int i = 0; i < arr.length; i++) {

            // if non-zero element found, move that element to the start of the array
            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        // after moving all non-zero elements to the start
        // fill the remaining elements with zeroes
        for (int j = position; j < arr.length; j++) {
            arr[j] = 0;
        }

    }
}