
public class FunWithInsertionSort {

    private int list[];

    public FunWithInsertionSort(int[] l) {
        list = l;
    }

    public int[] getList() {
        return list;
    }

    public int moveElementsOver(int index) {
        int val = list[index];
        while ((index > 0) && (list[index - 1] > val)) {
            list[index] = list[index - 1];
            index--;
        }
        return index;
    }

    public void placeInCorrectPosition(int index) {
        int val = list[index];
        int moveIndex = moveElementsOver(index);
        list[moveIndex] = val;
    }

    public int[] sort() {
        for (int i = 1; i < list.length; i++) {
            placeInCorrectPosition(i);
        }
        return list;
    }


}
