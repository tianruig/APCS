package craps;

// Represents the craps table with two rolling dice

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrapsTable extends JPanel
        implements ActionListener {

    private RollingDie die1, die2;
    private final int delay = 20;
    private Timer clock;
    private CrapsGame game;
    private DisplayPanel display;

    // Constructor
    public CrapsTable(DisplayPanel displ) {
        setBackground(Color.green);
        setBorder(new LineBorder(Color.ORANGE.darker(), 3));
        display = displ;
        game = new CrapsGame();
        die1 = new RollingDie();
        die2 = new RollingDie();
        clock = new Timer(delay, this);
    }

    // Rolls the dice (called when the "Roll" button
    // is clicked)
    public void rollDice() {
        RollingDie.setBounds(3, getWidth() - 3, 3, getHeight() - 3);
        die1.roll();
        die2.roll();
        clock.start();
    }

    // Processes timer events
    public void actionPerformed(ActionEvent e) {
        if (diceAreRolling()) {
            if (!clock.isRunning()) {
                clock.restart();
            }
            if (die1.isRolling()) {
                die1.avoidCollision(die2);
            } else if (die2.isRolling()) {
                die2.avoidCollision(die1);
            }
        } else {
            clock.stop();
            int total = die1.getNumDots() + die2.getNumDots();
            int result = game.processRoll(total);
            int point = game.getPoint();
            display.update(result, point);
        }

        repaint();
    }

    // returns true if dice are still rolling; otherwise
    // returns false
    public boolean diceAreRolling() {
        return die1.isRolling() || die2.isRolling();
    }

    // Called automatically after a repaint request
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        die1.draw(g);
        die2.draw(g);
    }
}
