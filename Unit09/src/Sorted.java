public class Sorted {
    public static void main(String[] args) {
        Sorted test = new Sorted();
        int[] arrTest1 = {2, 5, 6, 9, 12, 15};
        int[] arrTest2 = {15, 11, 10, 9, 8, 5, 4, 3, 2, 1};
        int[] arrTest3 = {2, 8, 3, 5, 7, 4, 9};
        int[][] testArrays = {arrTest1, arrTest2, arrTest3};

        for (int i = 0; i < testArrays.length; i++) {
            for (int x : testArrays[i])
                System.out.print(x + "\t");
            if (test.isAscending(testArrays[i]))
                System.out.println(" is in ascending order.");
            else if (test.isDescending(testArrays[i]))
                System.out.println(" is in descending order.");
            else
                System.out.println(" is in no sorted order.");
        }
    }

    // Returns true if arr is in a sorted ascending order
    public boolean isAscending(int[] arr) {
        int b4 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (b4 > arr[i]) {
                return false;
            }
            b4 = arr[i];
        }
        return true;
    }

    // Returns true if arr is in a sorted descending order
    public boolean isDescending(int[] arr) {
        int b4 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (b4 < arr[i]) {
                return false;
            }
            b4 = arr[i];
        }
        return true;
    }


}