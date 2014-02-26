package craps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrapsTest1 extends JFrame
        implements ActionListener {

    private CrapsGame game;
    private JTextField input;
    private JTextArea display;

    // Constructor
    public CrapsTest1() {
        super("Craps: Test 1");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Next roll:"));
        input = new JTextField(5);
        input.setBackground(Color.YELLOW);
        input.addActionListener(this);
        c.add(input);

        display = new JTextArea(10, 20);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        c.add(new JScrollPane(display,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));

        game = new CrapsGame();
    }

    // Called when a number is enetered into the JTextField input
    // 
    public void actionPerformed(ActionEvent e) {
        String s = input.getText().trim();
        int total = Integer.parseInt(s);
        int result = game.processRoll(total);
        int point = game.getPoint();
        input.setText("");
        display.append(total + ":  Result = " + result + " Point = " + point + "\n");
    }

    public static void main(String[] args) {
        CrapsTest1 window = new CrapsTest1();
        window.setBounds(100, 100, 300, 240);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }
}
