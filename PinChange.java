import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField newPinPasswordField, reEnterPinPasswordField;
    JButton changeBtn, backBtn;

    PinChange() {
        // Setting Frame properties
        setVisible(true);
        setLayout(null);
        setSize(900, 830);
        setLocation(350, 15);
        setTitle("PIN Change");

        // ATM Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); // Add image
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(00, -30, 900, 900);
        add(imageLabel);

        // Pin Chnage Label
        JLabel pinChangeLabel = new JLabel("CHANGE YOUR PIN");
        pinChangeLabel.setForeground(Color.WHITE);
        pinChangeLabel.setBounds(250, 288, 500, 25);
        pinChangeLabel.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(pinChangeLabel);

        // New Pin Label
        JLabel newPinLabel = new JLabel("New PIN:");
        newPinLabel.setForeground(Color.WHITE);
        newPinLabel.setBounds(165, 320, 180, 30);
        newPinLabel.setFont(new Font("System", Font.BOLD, 25));
        imageLabel.add(newPinLabel);

        // New Pin Password Field
        newPinPasswordField = new JPasswordField();
        newPinPasswordField.setBounds(330, 320, 180, 25);
        newPinPasswordField.setFont(new Font("Raleway", Font.BOLD, 23));
        imageLabel.add(newPinPasswordField);

        // Re Enter Pin Label
        JLabel reEnterPinLabel = new JLabel("Re Enter PIN:");
        reEnterPinLabel.setForeground(Color.WHITE);
        reEnterPinLabel.setBounds(165, 360, 180, 30);
        reEnterPinLabel.setFont(new Font("System", Font.BOLD, 23));
        imageLabel.add(reEnterPinLabel);

        // Re Enter pin Password Field
        reEnterPinPasswordField = new JPasswordField();
        reEnterPinPasswordField.setBounds(330, 360, 180, 25);
        reEnterPinPasswordField.setFont(new Font("Raleway", Font.BOLD, 25));
        imageLabel.add(reEnterPinPasswordField);

        // Change Button
        changeBtn = new JButton("CHANGE");
        changeBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        changeBtn.setBounds(355, 485, 150, 30);
        changeBtn.addActionListener(this);
        imageLabel.add(changeBtn);

        // Back Button
        backBtn = new JButton("BACK");
        backBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        backBtn.setBounds(355, 520, 150, 30);
        backBtn.addActionListener(this);
        imageLabel.add(backBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        char[] newPinChar = newPinPasswordField.getPassword();
        String newPin = new String(newPinChar);

        char[] reEnterPinChar = reEnterPinPasswordField.getPassword();
        String reEnterPin = new String(reEnterPinChar);

        try {
            if (ae.getSource() == changeBtn) {
                if (newPin.equals("") || reEnterPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter PIN to continue.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!newPin.equals(reEnterPin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not matched.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pin changed successfully", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (ae.getSource() == backBtn) {
                this.dispose();
                Transactions transaction = new Transactions();
                transaction.setVisible(true);
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        new PinChange();
    }
}