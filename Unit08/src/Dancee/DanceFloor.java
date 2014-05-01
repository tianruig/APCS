package Dancee;// Represents a display panel for a dance group

import javax.swing.*;
import java.awt.*;

public class DanceFloor extends JPanel {
    private StudentGroup students;

    // Constructor
    public DanceFloor() {
        setBackground(Color.WHITE);
    }

    // Called from HoppingGroup
    public void update(StudentGroup students) {
        this.students = students;
        repaint();
    }

    // Called when this panel needs to be repained
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (students != null)
            students.draw(g);
    }
}
