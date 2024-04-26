import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniStatement extends JFrame implements ActionListener {

    JButton okBtn;

    MiniStatement() {
        setTitle("Mini Statement");
        setLayout(null);
        setSize(400, 500);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);

        // Bank name label
        JLabel bankLabel = new JLabel("INDIAN BANK, DEHRADUN - 248009");
        bankLabel.setForeground(Color.BLACK);
        bankLabel.setFont(new Font("Pacifico", Font.BOLD, 16));
        bankLabel.setBounds(60, 20, 300, 20);
        add(bankLabel);

        // Dummy transactions
        String[] transactions = {
                "2024-03-26 10:10:00 - Deposit - ₹50XX.XX",
                "2024-03-25 15:39:48 - Deposit - ₹50XX.XX",
                "2024-03-24 09:43:50 - Withdrawal - ₹15XX.XX",
                "2024-03-23 12:26:03 - Withdrawal - ₹8XX.XX",
                "2024-03-22 08:54:59 - Deposit - ₹20XX.XX",
                "2024-03-25 19:39:48 - Withdrawal - ₹50XX.XX",
                "2024-03-21 14:45:09 - Withdrawal - ₹12XX.XX"
        };

        int startY = 90; // Starting Y position for the transactions
        int gap = 30; // Gap between transactions
        for (int i = 0; i < transactions.length; i++) {
            JLabel transactionLabel = new JLabel(transactions[i]);
            transactionLabel.setForeground(Color.BLACK);
            transactionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            transactionLabel.setBounds(20, startY + i * gap, 450, 20);
            add(transactionLabel);

            // Add a black horizontal line between transactions
            JLabel lineLabel = new JLabel(
                    "-------------------------------------------------------------------------------");
            lineLabel.setForeground(Color.BLACK);
            lineLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            lineLabel.setBounds(20, startY + i * gap + 20, 450, 20);
            add(lineLabel);
        }

        okBtn = new JButton("OK");
        okBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        okBtn.setForeground(Color.WHITE);
        okBtn.setBounds(160, 400, 60, 30);
        okBtn.addActionListener(this);
        okBtn.setBackground(Color.BLACK);
        add(okBtn);

        // Set the button to be visible
        okBtn.setVisible(true);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.dispose();
    }

    public static void main(String[] args) {
        new MiniStatement();
    }
}
