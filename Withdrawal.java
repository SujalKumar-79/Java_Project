import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdrawal extends JFrame implements ActionListener {

    JTextField amountTextField;
    JButton withdrawalBtn, backBtn;

    Withdrawal() {
        // Setting Frame properties
        setVisible(true);
        setLayout(null);
        setSize(900, 830);
        setLocation(350, 15);
        setTitle("Withdrawal Section");

        // ATM Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); // Add image
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(00, -30, 900, 900);
        add(imageLabel);

        // Deposit amount Label
        JLabel withdrawalLabel = new JLabel("Enter the amount you want to withdraw");
        withdrawalLabel.setForeground(Color.WHITE);
        withdrawalLabel.setFont(new Font("System", Font.BOLD, 16));
        withdrawalLabel.setBounds(170, 300, 400, 20);
        imageLabel.add(withdrawalLabel);

        // Amount Value Text Field
        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountTextField.setBounds(170, 350, 320, 25);
        imageLabel.add(amountTextField);

        // Depost Button
        withdrawalBtn = new JButton("Withdraw");
        withdrawalBtn.setBounds(355, 485, 150, 30);
        withdrawalBtn.addActionListener(this);
        imageLabel.add(withdrawalBtn);

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
            } else if (ae.getSource() == withdrawalBtn) {
                if (amountTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter an amount to withdraw");
                } else {
                    int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to withdraw?");
                    if (confirmed == JOptionPane.YES_OPTION) {
                        // Withdraw the amount
                        JOptionPane.showMessageDialog(null, amountTextField.getText() + " amount withdrawn");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new Withdrawal();
    }
}