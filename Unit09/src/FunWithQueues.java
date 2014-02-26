import java.util.ArrayList;

/**
 * Created by tianrui on 2/25/14.
 */
public class FunWithQueues {
    private ArrayList<String> queue;

    public FunWithQueues() {
        queue = new ArrayList<>();
    }

    public void addToQueue(String s) {
        queue.add(s);
    }

    public String removeFromQueue() {
        String s = queue.get(0);
        queue.remove(0);
        return s;
    }

    public void addVIPToQueue(String s) {
        queue.add(0, s);
    }

    public String printList() {
        String s = "";
        for (int i = 0; i < queue.size(); i++) {
            s += queue.get(i);
        }
        return s;
    }
}
