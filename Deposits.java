import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposits extends JFrame implements ActionListener {

    JTextField amountTextField;
    JButton depositBtn, backBtn;

    Deposits() {
        // Setting Frame properties
        setVisible(true);
        setLayout(null);
        setSize(900, 830);
        setLocation(350, 15);
        setTitle("Deposit Section");

        // ATM Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); // Add image
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(00, -30, 900, 900);
        add(imageLabel);

        // Deposit amount Label
        JLabel depositLabel = new JLabel("Enter the amount you want to deposit");
        depositLabel.setForeground(Color.WHITE);
        depositLabel.setFont(new Font("System", Font.BOLD, 16));
        depositLabel.setBounds(170, 300, 400, 20);
        imageLabel.add(depositLabel);

        // Amount Value Text Field
        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountTextField.setBounds(170, 350, 320, 25);
        imageLabel.add(amountTextField);

        // Depost Button
        depositBtn = new JButton("Deposit");
        depositBtn.setBounds(355, 485, 150, 30);
        depositBtn.addActionListener(this);
        imageLabel.add(depositBtn);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setBounds(355, 520, 150, 30);
        backBtn.addActionListener(this);
        imageLabel.add(backBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == backBtn) {
                this.dispose();
                Transactions transaction = new Transactions();
                transaction.setVisible(true);
            } else if (ae.getSource() == depositBtn) {
                if (amountTextField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter an amount to deposit");
                } else {
                    JOptionPane.showMessageDialog(null, amountTextField.getText() + " deposited successfully.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new Deposits();
    }
}