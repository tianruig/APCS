package craps;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Craps extends JFrame {
    // Constructor

    public Craps() {
        super("Craps");

        DisplayPanel display = new DisplayPanel();
        CrapsTable table = new CrapsTable(display);
        ControlPanel controls = new ControlPanel(table);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(new EmptyBorder(0, 5, 0, 5));
        panel.add(display, BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);
        panel.add(controls, BorderLayout.SOUTH);

        Container c = getContentPane();
        c.add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Craps window = new Craps();
        window.setBounds(100, 100, 320, 240);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
