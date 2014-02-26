package craps;

// Represents a display panel for a Craps table

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextField wonText, lostText, pointText;
    private int wonCount, lostCount;

    // Constructor
    public DisplayPanel() {
        super(new GridLayout(2, 3, 10, 0));
        setBorder(new EmptyBorder(0, 0, 5, 0));

        add(new JLabel("    Won:"));
        add(new JLabel("    Lost:"));
        add(new JLabel("    Point:"));

        Font displayFont = new Font("Monospaced", Font.BOLD, 16);

        wonText = new JTextField("  0", 5);
        wonText.setFont(displayFont);
        wonText.setEditable(false);
        wonText.setBackground(Color.WHITE);
        add(wonText);

        lostText = new JTextField("  0", 5);
        lostText.setFont(displayFont);
        lostText.setEditable(false);
        lostText.setBackground(Color.WHITE);
        add(lostText);

        pointText = new JTextField(5);
        pointText.setFont(displayFont);
        pointText.setEditable(false);
        pointText.setBackground(Color.DARK_GRAY);
        add(pointText);
    }

    // Updates this display, based on the result and
    // "point" in the previous roll
    public void update(int result, int point) {
        if (result > 0) {
            wonCount++;
            wonText.setText("  " + wonCount);
            pointText.setText("");
            pointText.setBackground(Color.DARK_GRAY);
        } else if (result < 0) {
            lostCount++;
            lostText.setText("  " + lostCount);
            pointText.setText("");
            pointText.setBackground(Color.DARK_GRAY);
        } else {
            pointText.setText("  " + point);
            pointText.setBackground(Color.YELLOW);
        }
    }
}
