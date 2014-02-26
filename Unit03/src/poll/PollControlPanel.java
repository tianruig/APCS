package poll;

/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: Poll
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PollControlPanel extends JPanel
        implements ActionListener {

    private JButton button1, button2, button3;
    private PollDisplayPanel chartPanel;

    public PollControlPanel(PollDisplayPanel chart) {
        chartPanel = chart;

        button1 = new JButton("Tami");
        button1.setPreferredSize(new Dimension(80, 30));
        button1.setToolTipText("Vote for Tami");
        button1.addActionListener(this);

        button2 = new JButton("Brian");
        button2.setPreferredSize(new Dimension(80, 30));
        button2.setToolTipText("Vote for Brian");
        button2.addActionListener(this);

        button3 = new JButton("Liz");
        button3.setPreferredSize(new Dimension(80, 30));
        button3.setToolTipText("Vote for Liz");
        button3.addActionListener(this);

        add(button1);
        add(button2);
        add(button3);
    }

    /**
     * Processes button events
     */
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (button == button1) {
            chartPanel.vote1();
        } else if (button == button2) {
            chartPanel.vote2();
        } else if (button == button3) {
            chartPanel.vote3();
        }
        chartPanel.repaint();
    }
}
