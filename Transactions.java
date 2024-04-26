import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {

    JButton depositBtn, cashWithdrawBtn, exitBtn, fastCashBtn, miniStatementBtn, balanceEnquiryBtn, pinChangeBtn;

    Transactions() {
        // Setting Frame Properties
        setLayout(null);
        setTitle("Transactions");
        setSize(900, 830);
        setLocation(350, 15);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

        // ATM Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); // Add image
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(00, -30, 900, 900);
        add(imageLabel);

        // Select Transaction Label
        JLabel text = new JLabel("Please select yout Transaction type");
        text.setBounds(190, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(text);

        // Deposit Button
        depositBtn = new JButton("Deposit");
        depositBtn.setBounds(170, 415, 150, 30);
        depositBtn.addActionListener(this);
        imageLabel.add(depositBtn);

        // Cash witdrawal Button
        cashWithdrawBtn = new JButton("Cash Withdrawal");
        cashWithdrawBtn.setBounds(355, 415, 150, 30);
        cashWithdrawBtn.addActionListener(this);
        imageLabel.add(cashWithdrawBtn);

        // Fast Cash Button
        fastCashBtn = new JButton("Fast Cash");
        fastCashBtn.setBounds(170, 450, 150, 30);
        fastCashBtn.addActionListener(this);
        imageLabel.add(fastCashBtn);

        // Mini Statement Button
        miniStatementBtn = new JButton("Mini Statement");
        miniStatementBtn.setBounds(355, 450, 150, 30);
        miniStatementBtn.addActionListener(this);
        imageLabel.add(miniStatementBtn);

        // Pin Change Button
        pinChangeBtn = new JButton("Pin Change");
        pinChangeBtn.setBounds(170, 485, 150, 30);
        pinChangeBtn.addActionListener(this);
        imageLabel.add(pinChangeBtn);

        // Balance Enquiry Button
        balanceEnquiryBtn = new JButton("Balance Enquiry");
        balanceEnquiryBtn.setBounds(355, 485, 150, 30);
        balanceEnquiryBtn.addActionListener(this);
        imageLabel.add(balanceEnquiryBtn);

        // Exit Button
        exitBtn = new JButton("Exit");
        exitBtn.setBounds(355, 520, 150, 30);
        exitBtn.addActionListener(this);
        imageLabel.add(exitBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == depositBtn) {
            this.dispose();
            Deposits deposit = new Deposits();
            deposit.setVisible(true);
        } else if (ae.getSource() == cashWithdrawBtn) {
            this.dispose();
            Withdrawal withdrawal = new Withdrawal();
            withdrawal.setVisible(true);
        } else if (ae.getSource() == fastCashBtn) {
            this.dispose();
            FastCash fastcash = new FastCash();
            fastcash.setVisible(true);
        } else if (ae.getSource() == miniStatementBtn) {
            MiniStatement ministatement = new MiniStatement();
            ministatement.setVisible(true);
        } else if (ae.getSource() == pinChangeBtn) {
            this.dispose();
            PinChange pinchange = new PinChange();
            pinchange.setVisible(true);
        } else if (ae.getSource() == balanceEnquiryBtn) {
            this.dispose();
            BalanceEnquiry balanceEnquiry = new BalanceEnquiry();
            balanceEnquiry.setVisible(true);
        } else if (ae.getSource() == exitBtn) {
            this.dispose();
            LogIn login = new LogIn();
            login.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Transactions();
    }
}