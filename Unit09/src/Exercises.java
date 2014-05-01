import java.util.ArrayList;

public class Exercises {

    static Exercises e = new Exercises();

    public static void main(String[] args) {
        System.out.println(e.computeScore("abc"));


    }

    public static void rotateLeft(int[] a) {
        int first = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = first;
    }

    public static void rotateRight(int[] a) {
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
    }

    public static void rotate(int[] a, int d) {
        while (d < 0) {
            rotateLeft(a);
            d++;
        }
        while (d > 0) {
            rotateRight(a);
            d--;
        }
    }

    public static double averageTopTwo(int[] scores) {
        int i, n = scores.length;
        int iMax1 = 0;
        int iMax2 = 1;

        if (scores[iMax1] > scores[iMax2]) {
            i = iMax1;
            iMax1 = iMax2;
            iMax2 = i;
        }

        for (i = 2; i < n; i++) {
            if (scores[i] > scores[iMax1]) {
                iMax2 = iMax1;
                iMax1 = i;
            } else if (scores[i] > scores[iMax2]) {
                iMax2 = i;
            }
        }
        return (double) (scores[iMax1] + scores[iMax2]) / 2;
    }

    public char getRandomRps() {
        char[] rps = new char[14];
        for (int i = 0; i < 3; i++) {
            rps[i] = 'r';
        }
        for (int i = 3; i < 8; i++) {
            rps[i] = 'p';
        }
        for (int i = 8; i < 14; i++) {
            rps[i] = 's';
        }
        return rps[(int) (Math.random() * 14)];
    }

    public void testGetRandomRps() {
        int r = 0;
        int p = 0;
        int s = 0;

        for (int i = 0; i < 140000; i++) {
            char c = e.getRandomRps();
            switch (c) {
                case 'r':
                    r++;
                    break;
                case 'p':
                    p++;
                    break;
                default:
                    s++;
            }
        }

        System.out.println(r);
        System.out.println(p);
        System.out.println(s);

    }

    public int[] makePythagoreanTriple(int m, int n) {
        // make m the bigger of the 2
        if (n > m) {
            int tmp = m;
            m = n;
            n = tmp;
        }

        int a = m * m - n * n;
        int b = 2 * m * n;
        int c = m * m + n * n;
        return new int[]{a, b, c};
    }

    public int[] createWedge(int n) {
        int[] arr = new int[2 * n - 1];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 1; i < n; i++) {
            arr[i + n - 1] = n - i;
        }
        return arr;
    }

    // returns Scrabble score for a word without using any if or switch statements
    public int computeScore(String word) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int[] scores = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            score += scores[alpha.indexOf(word.charAt(i))];
        }

        return score;
    }

    public ArrayList<String> reverseArrayList(ArrayList<String> al) {
        ArrayList<String> al2 = new ArrayList<>();
        for (int i = al.size(); i >= 0; i--) {
            al2.add(al.get(i));
        }
        return al2;
    }

    public void removeSmallestValueInArrayListOfIntegers(ArrayList<Integer> al) {
        int smallestIndex = 0;

        for (int i = 1; i < al.size(); i++) {
            if (al.get(i).compareTo(al.get(smallestIndex)) < 0) {
                smallestIndex = i;
            }
        }

        al.remove(smallestIndex);
    }

    public void filter(ArrayList<Object> list1, ArrayList<Object> list2) {

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    list1.remove(i);
                    i--;
                    break;
                }
            }
        }
    }

    public void removeDuplicates(ArrayList<String> words) {
        ArrayList<String> w = new ArrayList<>();
        for (String s : words) {
            if (w.indexOf(s) != -1) {
                w.add(s);
            }
        }
    }

    // m is median if there are equal number of elements greater than m as there are less than m.
    public boolean isMedian(double[] sample, double m) {
        return sample.length % 2 == 0
                ? sample[sample.length] <= m && sample[sample.length + 1] >= m
                : sample[sample.length + 1] == m;
    }
}
