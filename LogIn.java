import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame implements ActionListener {
    static String cardNumberOne = "1234567891234567";
    static String cardNumberTwo = "4372156890327415";
    static String cardNumberThree = "4829310674581093";

    static String pinNumberOne = "1234";
    static String pinNumberTwo = "5678";
    static String pinNumberThree = "8520";

    JTextField cardTextField;
    JButton loginBtn, signupBtn, clearBtn;
    JPasswordField pinTextField;

    LogIn() {

        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Log In");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(90, 10, 100, 100);
        add(label);

        // Welcome Label
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 42));
        text.setBounds(260, 40, 400, 40);
        add(text);

        // Card Number Label
        JLabel cardno = new JLabel("Card no.");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);

        // Card Number Text Field
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        // PIN Label
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        // Pin Text Field
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));

        add(pinTextField);

        // Log in Button
        loginBtn = new JButton("LOG IN");
        loginBtn.setBounds(300, 300, 116, 30);
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setForeground(Color.WHITE);
        loginBtn.addActionListener(this);
        add(loginBtn);

        // Clear Button
        clearBtn = new JButton("CLEAR");
        clearBtn.setBounds(430, 300, 117, 30);
        clearBtn.setBackground(Color.BLACK);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.addActionListener(this);
        add(clearBtn);

        // Sign UP Button
        signupBtn = new JButton("SIGN UP");
        signupBtn.setBounds(300, 350, 250, 30);
        signupBtn.setBackground(Color.BLACK);
        signupBtn.setForeground(Color.WHITE);
        signupBtn.addActionListener(this);
        add(signupBtn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == loginBtn) {
                String cardNumber = cardTextField.getText();
                char[] pinChars = pinTextField.getPassword();
                String pinNumber = new String(pinChars);

                if (cardNumber.isEmpty() || pinNumber.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter both, Card number and PIN.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!(cardNumberOne.equals(cardNumber) && pinNumberOne.equals(pinNumber))
                        && !(cardNumberTwo.equals(cardNumber) && pinNumberTwo.equals(pinNumber))
                        && !(cardNumberThree.equals(cardNumber) && pinNumberThree.equals(pinNumber))) {
                    JOptionPane.showMessageDialog(this, "You entered wrong Card or PIN Number.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    this.dispose();
                    Transactions transaction = new Transactions();
                    transaction.setVisible(true);
                }
            } else if (e.getSource() == clearBtn) {
                // Clear all entry
                cardTextField.setText("");
                pinTextField.setText("");
            } else if (e.getSource() == signupBtn) {
                this.dispose();
                SignupOne signupOneObj = new SignupOne();
                signupOneObj.setVisible(true);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void main(String[] arg) {
        LogIn login = new LogIn();
    }
}