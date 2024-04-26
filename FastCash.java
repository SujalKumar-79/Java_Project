import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FastCash extends JFrame implements ActionListener {

    JTextField amountTextField;
    JButton resetBtn, firstBtn, secondBtn, thirdBtn, fourthBtn, fifthBtn, sixthBtn, backBtn, withdrawalBtn;

    FastCash() {
        // Setting Frame properties
        setVisible(true);
        setLayout(null);
        setSize(900, 830);
        setLocation(350, 15);
        setTitle("FastCash Section");

        // ATM Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); // Add image
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(00, -30, 900, 900);
        add(imageLabel);

        // Deposit amount Label
        JLabel withdrawalLabel = new JLabel("Select the amount you want to Withdraw");
        withdrawalLabel.setForeground(Color.WHITE);
        withdrawalLabel.setFont(new Font("System", Font.BOLD, 16));
        withdrawalLabel.setBounds(170, 300, 400, 20);
        imageLabel.add(withdrawalLabel);

        // Amount Value Text Field
        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountTextField.setBounds(170, 350, 332, 25);
        imageLabel.add(amountTextField);

        // 500 Button
        firstBtn = new JButton("  500");
        firstBtn.setBounds(170, 418, 150, 26);
        firstBtn.addActionListener(this);
        imageLabel.add(firstBtn);

        // 1000 Button
        secondBtn = new JButton(" 1000");
        secondBtn.setBounds(170, 452, 150, 26);
        secondBtn.addActionListener(this);
        imageLabel.add(secondBtn);

        // 2000 Button
        thirdBtn = new JButton(" 2000");
        thirdBtn.setBounds(170, 486, 150, 26);
        thirdBtn.addActionListener(this);
        imageLabel.add(thirdBtn);

        // 5000 Button
        fourthBtn = new JButton(" 5000");
        fourthBtn.setBounds(355, 418, 150, 26);
        fourthBtn.addActionListener(this);
        imageLabel.add(fourthBtn);

        // 10000 Button
        fifthBtn = new JButton("10000");
        fifthBtn.setBounds(355, 452, 150, 26);
        fifthBtn.addActionListener(this);
        imageLabel.add(fifthBtn);

        // 20000 Button
        sixthBtn = new JButton("20000");
        sixthBtn.setBounds(355, 486, 150, 26);
        sixthBtn.addActionListener(this);
        imageLabel.add(sixthBtn);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setBounds(170, 523, 150, 26);
        backBtn.addActionListener(this);
        imageLabel.add(backBtn);

        // Deposit Button
        withdrawalBtn = new JButton("Withdraw");
        withdrawalBtn.setBounds(355, 523, 150, 26);
        withdrawalBtn.addActionListener(this);
        imageLabel.add(withdrawalBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == firstBtn) {
                amountTextField.setText("500");
            } else if (ae.getSource() == secondBtn) {
                amountTextField.setText("1000");
            } else if (ae.getSource() == thirdBtn) {
                amountTextField.setText("2000");
            } else if (ae.getSource() == fourthBtn) {
                amountTextField.setText("5000");
            } else if (ae.getSource() == fifthBtn) {
                amountTextField.setText("10000");
            } else if (ae.getSource() == sixthBtn) {
                amountTextField.setText("20000");
            } else if (ae.getSource() == backBtn) {
                this.dispose();
                Transactions transaction = new Transactions();
                transaction.setVisible(true);
            } else if (ae.getSource() == withdrawalBtn) {
                if (amountTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select an amount to withdraw");
                } else {
                    int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to withdraw?");
                    if (confirmed == JOptionPane.YES_OPTION) {
                        // Withdraw the amount
                        JOptionPane.showMessageDialog(null, "₹" + amountTextField.getText() + " withdrawn");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new FastCash();
    }
}