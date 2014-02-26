import java.util.ArrayList;

public class FunWithStacks {
    private ArrayList<String> arr;

    public FunWithStacks() {
        arr = new ArrayList<String>();
    }

    public void push(String s) {
        arr.add(0, s);
    }

    public String pop() {
        String s = peek();
        arr.remove(0);
        return s;
    }

    public String peek() {
        if (arr.isEmpty()) {
            return "The stack is empty";
        } else {
            return arr.get(0);
        }
    }

}
