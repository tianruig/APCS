public class Haiku extends Poem {

    @Override
    public int numLines() {
        return 3;
    }

    @Override
    public int getSyllables(int k) {
        return k == 2 ? 7 : 5;
    }
}

