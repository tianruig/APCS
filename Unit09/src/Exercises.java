/**
 * Created by tianrui on 2/25/14.
 */
public class Exercises {

    public static void main(String[] args) {
        Exercises e = new Exercises();
        int r = 0;
        int p = 0;
        int s = 0;

        for (int i = 0; i < 100; i++){
            char c = e.getRandomRps();
            switch (c){
                case 'r':
                r++;
                break;
            }
        }
    }
    public char getRandomRps(){
        char [] rps = new char[14];
        for (int i = 0; i < 3; i++){ rps[i] = 'r'; };
        for (int i = 3; i < 8; i++){ rps[i] = 'p'; };
        for (int i = 8; i < 14; i++){ rps[i] = 's'; };
        return rps[(int)(Math.random() * 14)];
    }
}
