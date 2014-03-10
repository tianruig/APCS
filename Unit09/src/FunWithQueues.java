/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: FunWithQueues
 * Description: Simulate the behavior of a queue
 */

import java.util.ArrayList;

public class FunWithQueues implements Queue {
    private ArrayList<String> queue;

    public FunWithQueues() {
        queue = new ArrayList<>();
    }

    // Adds a String to the end of queue
    public void addToQueue(String s) {
        queue.add(s);
    }

    // Removes the first String from queue and returns it. If queue is empty, return "The queue is empty."
    public String removeFromQueue() {
        if (queue.isEmpty()) {
            return "The queue is empty.";
        } else {
            String s = queue.get(0);
            queue.remove(0);
            return s;
        }
    }

    // Adds String to beginning of queue
    public void addVIPToQueue(String s) {
        queue.add(0, s);
    }

    // Concatenate all the strings in queue, without spaces in between
    public String printList() {
        String s = "";
        for (int i = 0; i < queue.size(); i++) {
            s += queue.get(i);
        }
        return s;
    }
}
