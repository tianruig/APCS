/**
 * Name: Tianrui
 * Date: 3/6/14
 * Period: 5
 * Project:
 * Description:
 */
public class Exercises {

    public static void shuffle(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, (int) (Math.random() * arr.length));
        }
    }

    public static void swap(Object[] arr, int a, int b) {
        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
