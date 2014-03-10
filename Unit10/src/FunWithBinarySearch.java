
public class FunWithBinarySearch {

    public int find(int[] arr, int value) {
        // Perform a binary search on the array arr, looking for value.
        // This method should return the index of the arr the value is found.
        // Returns -1 if the value is not in the arr
        int begin = 0;
        int end = arr.length;

        int mid = end / 2;
        end--;

        while (end > begin + 1) {
            if (value < arr[mid]) {
                end = mid;
                mid = (begin + end) / 2;
            } else {
                begin = mid;
                mid = (begin + end) / 2;
            }
        }

        if (value == arr[begin]) {
            return begin;
        } else if (value == arr[end]) {
            return end;
        } else {
            return -1;
        }

    }
}
