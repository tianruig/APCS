
public class FunWithSelectionSort {

    private int[] list;
    private int len;

    public FunWithSelectionSort(int[] arr) {
        list = arr;
        len = list.length;
    }

    public int[] getList() {
        return list;
    }

    public void swap(int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public int findIndexOfSmallest(int a) {
        int minIndex = a;
        for (int i = a; i < len; i++) {
            if (list[minIndex] > list[i]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public void sort() {
        for (int i = 0; i < len - 1; i++) {
            swap(i, findIndexOfSmallest(i));
        }
    }
}
