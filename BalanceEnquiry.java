import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton backBtn;

    BalanceEnquiry() {
        setVisible(true);
        setLayout(null);
        setSize(900, 830);
        setLocation(350, 15);
        setTitle("Balance Enquiry");

        // ATM Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); // Add image
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(00, -30, 900, 900);
        add(imageLabel);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setBounds(355, 520, 150, 30);
        backBtn.setFont(new Font("Raleway", Font.BOLD, 22));
        backBtn.addActionListener(this);
        imageLabel.add(backBtn);

        // Display Bank Balance
        JLabel balanceLabel = new JLabel("Your current balance is: ₹XX,999");
        balanceLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        balanceLabel.setForeground(Color.WHITE);
        balanceLabel.setBounds(160, 300, 400, 30);
        imageLabel.add(balanceLabel);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.dispose();
        Transactions transaction = new Transactions();
        transaction.setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry();
    }
}
