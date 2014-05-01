public abstract class Poem {
    public abstract int numLines();

    public abstract int getSyllables(int k);

    public void printRhythm() {
        int lines = numLines();
        for (int i = 1; i <= lines; i++) {
            int syllablles = getSyllables(i);
            for (int j = 1; j < syllablles; j++) {
                System.out.print("ta-");
            }
            System.out.println("ta");
        }
    }
}

