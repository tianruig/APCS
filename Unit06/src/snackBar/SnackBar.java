package snackBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnackBar extends JFrame
        implements ActionListener {
    private static final String MY_PASSWORD = "jinx";
    //    private VendingMachine machine1, machine2, machine3;
    private VendingMachine[] machines;

    public SnackBar(int numMachines) {
        super("Snack Bar");

        Color[] brandColor = new Color[numMachines];

        for (int i = 0; i < brandColor.length; i++) {
            brandColor[i] = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        }

//        Color brandColor1 = new Color(130, 30, 10); // r, g, b
//        Color brandColor2 = new Color(255, 180, 0);
//        Color brandColor3 = new Color(90, 180, 0);

        // Load the coin icon for the vending machine buttons:
        ImageIcon coin = new ImageIcon("coin.gif");

        machines = new VendingMachine[numMachines];

        for (int i = 0; i < machines.length; i++) {
            machines[i] = new VendingMachine("Product " + (i + 1), brandColor[i], (int) (Math.random() * 90 + 10), coin);
        }

//        machine1 = new VendingMachine("Java", brandColor1, 45, coin);
//        machine2 = new VendingMachine("JApple", brandColor2, 50, coin);
//        machine3 = new VendingMachine("Jinx", brandColor3, 35, coin);

        Box wall = Box.createHorizontalBox();
        wall.add(Box.createHorizontalStrut(5));
        for (int i = 0; i < machines.length; i++) {
            wall.add(machines[i]);
            wall.add(Box.createHorizontalStrut(5));
        }

//        wall.add(machine1);
//        wall.add(Box.createHorizontalStrut(5));
//        wall.add(machine2);
//        wall.add(Box.createHorizontalStrut(5));
//        wall.add(machine3);
//        wall.add(Box.createHorizontalStrut(5));

        JPanel service = new JPanel();
        service.add(new JLabel(" Service login: "));
        JPasswordField password = new JPasswordField("", 5);
        password.addActionListener(this);
        service.add(password);

        Container c = getContentPane();
        c.setBackground(Color.GRAY);
        c.add(wall, BorderLayout.CENTER);
        c.add(service, BorderLayout.SOUTH);
    }

    /**
     * Password field: user strikes <Enter>
     */
    public void actionPerformed(ActionEvent e) {
        JPasswordField password = (JPasswordField) e.getSource();
        String word = new String(password.getPassword());
        password.setText("");
        if (MY_PASSWORD.equals(word)) {
            // double amt = Vendor.getTotalSales();
            for (int i = 0; i < machines.length; i++) {
                machines[i].reload();
            }
//            machine1.reload();
//            machine2.reload();
//            machine3.reload();
            JOptionPane.showMessageDialog(null,
                    // String.format("Total sales: $%.2f\n", amt) +
                    "Machines reloaded",
                    "Service", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Login failed", "Service", JOptionPane.ERROR_MESSAGE);
        }
    }

    // *****************************************************

    public static void main(String[] args) {
        int m = 3;
        if (args.length == 1) {
            try {
                m = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Not a valid number. Use default of 3");
            }
        }
        SnackBar window = new SnackBar(m);
        window.setBounds(50, 50, (520 / 3 * m), 310);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }
}

