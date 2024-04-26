import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton savingsAccRadio, reccurringAccRadio, currentAccRadio, fdAccRadio;
    JCheckBox atmCardServiceCheckBox, internetBankingCheckBox, mobileBankingCheckBox, emailAndSmsAlertsCheckBox,
            checkBookServicesCheckBox, eStatementCheckBox, declarationCheckBox;

    JButton submitBtn, backBtn;

    SignupThree() {
        // Setting Frame properties
        setTitle("Account Opening Form - Page 03");
        setVisible(true);
        setLayout(null);
        setSize(850, 820);
        setLocation(350, 30);
        getContentPane().setBackground(Color.WHITE);

        // Page 3 Label
        JLabel pageLabel = new JLabel("Page 3: Account Details");
        pageLabel.setBounds(280, 40, 400, 40);
        pageLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        add(pageLabel);

        // Account type Label
        JLabel accountTypeLabel = new JLabel("Account type:");
        accountTypeLabel.setBounds(100, 140, 200, 30);
        accountTypeLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        add(accountTypeLabel);

        // Account type Radio Buttons
        // Savings Account
        savingsAccRadio = new JRadioButton("Savings Account");
        savingsAccRadio.setFont(new Font("raleway", Font.BOLD, 14));
        savingsAccRadio.setBackground(Color.WHITE);
        savingsAccRadio.setBounds(100, 180, 250, 20);
        add(savingsAccRadio);

        // Fixed Deposit
        currentAccRadio = new JRadioButton("Current Account");
        currentAccRadio.setFont(new Font("raleway", Font.BOLD, 14));
        currentAccRadio.setBackground(Color.WHITE);
        currentAccRadio.setBounds(350, 180, 250, 20);
        add(currentAccRadio);

        // Fixed Deposit
        fdAccRadio = new JRadioButton("Fixed deposit Account");
        fdAccRadio.setFont(new Font("raleway", Font.BOLD, 14));
        fdAccRadio.setBackground(Color.WHITE);
        fdAccRadio.setBounds(100, 220, 250, 20);
        add(fdAccRadio);

        // Fixed Deposit
        reccurringAccRadio = new JRadioButton("Recurring Account");
        reccurringAccRadio.setFont(new Font("raleway", Font.BOLD, 14));
        reccurringAccRadio.setBackground(Color.WHITE);
        reccurringAccRadio.setBounds(350, 220, 250, 20);
        add(reccurringAccRadio);

        // Grouping Account Radio Buttong
        ButtonGroup accountTypeButtonGroup = new ButtonGroup();
        accountTypeButtonGroup.add(currentAccRadio);
        accountTypeButtonGroup.add(savingsAccRadio);
        accountTypeButtonGroup.add(fdAccRadio);
        accountTypeButtonGroup.add(reccurringAccRadio);

        // Card Number Label
        JLabel cardNumberLabel = new JLabel("CARD No.:");
        cardNumberLabel.setBounds(100, 300, 200, 30);
        cardNumberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        add(cardNumberLabel);

        // Card Number Value Label
        JLabel cardNumberValueLabel = new JLabel("XXXX-XXXX-XXXX-4187");
        cardNumberValueLabel.setBounds(330, 300, 300, 30);
        cardNumberValueLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        add(cardNumberValueLabel);

        // Card Number Info Label
        JLabel cardNumberInfoLabel = new JLabel("This is your 16 digits card number");
        cardNumberInfoLabel.setBounds(100, 330, 300, 15);
        cardNumberInfoLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        add(cardNumberInfoLabel);

        // Pin Number Label
        JLabel pinNumberLabel = new JLabel("PIN No.:");
        pinNumberLabel.setBounds(100, 370, 200, 30);
        pinNumberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        add(pinNumberLabel);

        // Pin Number Value Label
        JLabel pinNumberValueLabel = new JLabel("XXXX");
        pinNumberValueLabel.setBounds(330, 370, 300, 30);
        pinNumberValueLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        add(pinNumberValueLabel);

        // Pin Number Info Label
        JLabel pinNumberInfoLabel = new JLabel("This is your 4 digits ATM pin");
        pinNumberInfoLabel.setBounds(100, 400, 300, 15);
        pinNumberInfoLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        add(pinNumberInfoLabel);

        // Services Required Label
        JLabel servicesRequiredLabel = new JLabel("Services Reqired:");
        servicesRequiredLabel.setBounds(100, 450, 200, 30);
        servicesRequiredLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        add(servicesRequiredLabel);

        // ATM Card CheckBox
        atmCardServiceCheckBox = new JCheckBox("ATM Card");
        atmCardServiceCheckBox.setBackground(Color.WHITE);
        atmCardServiceCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        atmCardServiceCheckBox.setBounds(100, 480, 200, 30);
        add(atmCardServiceCheckBox);

        // ATM Card CheckBox
        internetBankingCheckBox = new JCheckBox("Internet Banking");
        internetBankingCheckBox.setBackground(Color.WHITE);
        internetBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBankingCheckBox.setBounds(100, 510, 200, 30);
        add(internetBankingCheckBox);

        // ATM Card CheckBox
        mobileBankingCheckBox = new JCheckBox("Mobile Banking");
        mobileBankingCheckBox.setBackground(Color.WHITE);
        mobileBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBankingCheckBox.setBounds(100, 540, 200, 30);
        add(mobileBankingCheckBox);

        // ATM Card CheckBox
        emailAndSmsAlertsCheckBox = new JCheckBox("Email and SMS");
        emailAndSmsAlertsCheckBox.setBackground(Color.WHITE);
        emailAndSmsAlertsCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        emailAndSmsAlertsCheckBox.setBounds(420, 480, 200, 30);
        add(emailAndSmsAlertsCheckBox);

        // ATM Card CheckBox
        checkBookServicesCheckBox = new JCheckBox("Check Book");
        checkBookServicesCheckBox.setBackground(Color.WHITE);
        checkBookServicesCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBookServicesCheckBox.setBounds(420, 510, 200, 30);
        add(checkBookServicesCheckBox);

        // ATM Card CheckBox
        eStatementCheckBox = new JCheckBox("E-Statement");
        eStatementCheckBox.setBackground(Color.WHITE);
        eStatementCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        eStatementCheckBox.setBounds(420, 540, 200, 30);
        add(eStatementCheckBox);

        // ATM Card CheckBox
        declarationCheckBox = new JCheckBox(
                "I hereby declare that the information stated above is true to the best of my knowledge.");
        declarationCheckBox.setBackground(Color.WHITE);
        declarationCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        declarationCheckBox.setBounds(100, 620, 700, 30);
        add(declarationCheckBox);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        backBtn.setBounds(250, 680, 100, 30);
        backBtn.setBackground(Color.BLACK);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(this);
        add(backBtn);

        // Submit Button
        submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        submitBtn.setBounds(420, 680, 100, 30);
        submitBtn.setBackground(Color.BLACK);
        submitBtn.setForeground(Color.WHITE);
        submitBtn.addActionListener(this);
        add(submitBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backBtn) {
            SignupTwo signupTwoFrame = new SignupTwo();
            signupTwoFrame.setVisible(true);
            this.dispose();
        } else if (e.getSource() == submitBtn) {
            // Generate random 16-digit card number
            Random random = new Random();
            StringBuilder cardNumberBuilder = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                int digit = random.nextInt(10);
                cardNumberBuilder.append(digit);
            }
            String cardNumber = cardNumberBuilder.toString();

            // Generate random 4-digit PIN
            StringBuilder pinBuilder = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                int digit = random.nextInt(10);
                pinBuilder.append(digit);
            }
            String pin = pinBuilder.toString();

            if (!declarationCheckBox.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please agree to the declaration.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String message = "Your Card number is " + cardNumber + "\nYour ATM Pin is " + pin;
                JOptionPane.showMessageDialog(this, message, "Card Information", JOptionPane.INFORMATION_MESSAGE);
                // Your existing code for disposing the frame and showing the LogIn frame
                dispose();
                LogIn login = new LogIn();
                login.setVisible(true);
            }

            // Modification start

            // Modification ends

            // // Dispose SignupThree Frame
            // this.dispose();
            // // Turn on LOG IN Frame
            // LogIn login = new LogIn();
            // login.setVisible(true);
        }

    }

    public static void main(String[] args) {
        new SignupThree();
    }
}