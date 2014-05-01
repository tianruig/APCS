package Dancee;// Represents a control panel for a dance group

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel
        implements ActionListener {
    private static Dance[] dances =
            {new Aerobics(), new Waltz(), new Rumba(), new Chacha(), new Salsa()};
    int floorDir;
    private StudentGroup students;
    private Band music;
    private JComboBox chooseDance;
    private JButton go, flip;
    private ImageIcon redAndBlack[];

    // Constructor
    public ControlPanel(StudentGroup group) {
        students = group;
        music = new Band(students);

        chooseDance = new JComboBox(dances);
        redAndBlack = new ImageIcon[2];
        redAndBlack[0] = new ImageIcon("redblack.gif");
        redAndBlack[1] = new ImageIcon("blackred.gif");
        floorDir = 0;
        flip = new JButton(redAndBlack[floorDir]);
        flip.setActionCommand("Flip");
        flip.addActionListener(this);

        go = new JButton("Go");
        go.addActionListener(this);

        setLayout(new GridLayout(8, 1, 20, 15));
        add(new JPanel());     // space holder
        add(chooseDance);
        add(go);
        add(new JPanel());
        add(new JPanel());
        add(new JPanel());
        add(flip);
    }

    private void setupStudents() {
        Dance steps1 = (Dance) chooseDance.getSelectedItem();
        Dance steps2 = new ReversedDance(steps1);
        students.setup(floorDir, steps1, steps2);
    }

    // Handles go / stop / flip button events
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if ("Go".equals(cmd)) {
            go.setText("Stop");
            flip.setEnabled(false);
            Dance dance = (Dance) chooseDance.getSelectedItem();
            music.play(dance);
        } else if ("Stop".equals(cmd)) {
            music.stop();
            flip.setEnabled(true);
            go.setText("Go");
        } else if ("Flip".equals(cmd)) {
            floorDir = 1 - floorDir;
            flip.setIcon(redAndBlack[floorDir]);
        }
        setupStudents();
    }
}
