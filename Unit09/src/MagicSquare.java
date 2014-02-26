/**
 * Tianrui Guo
 * MagicSquare
 */

public class MagicSquare {

    public static boolean isMagicSquare(int arr[][]) {
        for (int[] arr1 : arr) {
            if (arr.length != arr1.length) {
                return false;
            }
        }

        // Calculate sum of one diagonal
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        // Compare with other diagonal
        int dsum = 0;
        for (int i = 0; i < arr.length; i++) {
            dsum += arr[i][arr[0].length - i - 1];
        }
        if (dsum != sum) {
            return false;
        }

        // Compare sum with each row
        for (int[] row : arr) {
            int s = 0;
            for (int i : row) {
                s += i;
            }
            if (sum != s) {
                return false;
            }
        }

        // Compare sum with each column
        for (int c = 0; c < arr.length; c++) {
            int s = 0;
            for (int r = 0; r < arr[0].length; r++) {
                s += arr[r][c];
            }
            if (sum != s) {
                return false;
            }
        }

        return true;
    }

}
