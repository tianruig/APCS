package Dancee;//  This class processes the timer events, generates the "beat"
//  for the dance as described by the parameters passed to its play method,
// and calls the DanceModel's nextBeat method when the timer fires.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Band implements ActionListener {
    private EasySound[] beat;
    private StudentGroup students;
    private Dance dance;
    private Timer clock;
    private int beatCount;

    public Band(StudentGroup group) {
        students = group;

        beat = new EasySound[3];
        beat[1] = new EasySound("beat1.wav");
        beat[2] = new EasySound("beat2.wav");
        beat[1].play();
        beat[2].play();
    }

    public void play(Dance dance) {
        this.dance = dance;
        clock = new Timer(dance.getTempo(), this);
        clock.start();
        beatCount = 0;
    }

    public void stop() {
        clock.stop();
    }

    public void actionPerformed(ActionEvent e) {
        int i = dance.getBeat(beatCount);
        if (i > 0)
            beat[i].play();
        students.makeNextStep();
        beatCount++;
    }
}

