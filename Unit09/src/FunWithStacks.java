import java.util.ArrayList;

public class FunWithStacks implements Stack {
    private ArrayList<String> arr;

    public FunWithStacks() {
        arr = new ArrayList<>();
    }

    public void push(String s) {
        arr.add(0, s);
    }

    public String pop() {
        if (arr.isEmpty()) {
            return "The stack is empty.";
        } else {
            return arr.remove(0);
        }
    }

    public String peek() {
        if (arr.isEmpty()) {
            return "The stack is empty.";
        } else {
            return arr.get(0);
        }
    }

}
