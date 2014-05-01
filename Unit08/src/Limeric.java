public class Limeric extends Poem {
    @Override
    public int numLines() {
        return 5;
    }

    @Override
    public int getSyllables(int k) {
        return (k == 3 || k == 4) ? 6 : 9;
    }
}
