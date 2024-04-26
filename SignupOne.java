import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupOne extends JFrame implements ActionListener {

    long randomNumber;
    JTextField nameTextField, fathersNameTextField, emailTextField, addressTextField, cityTextField, stateTextField,
            pinCodeTextField;
    JButton backBtn, nextBtn;
    JRadioButton maleRadioBtn, femaleRadioBtn, otherGenderRadioBtn, marriedBtn, unmarriedBtn, otherMaritalStatusBtn;

    SignupOne() {
        // Setting Frame Properties
        setTitle("Account Opening Form - Page 01");
        setSize(850, 780);
        setLocation(350, 50);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Generating Random number
        Random random = new Random();
        randomNumber = (Math.abs(random.nextLong() % 9000L + 1000L));

        // Form number Label
        JLabel fromNumber = new JLabel("APPLICATION FORM NO. " + randomNumber);
        fromNumber.setFont(new Font("Raleway", Font.BOLD, 40));
        fromNumber.setBounds(140, 20, 600, 40);
        add(fromNumber);

        // Personal details Label
        JLabel personalDetails = new JLabel("Page 1: Personal details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        // Name Label
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        nameLabel.setBounds(100, 140, 100, 30);
        add(nameLabel);

        // Name Text field
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        // Fathers Name Label
        JLabel fatherNameLabel = new JLabel("Fathers name:");
        fatherNameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherNameLabel.setBounds(100, 190, 200, 30);
        add(fatherNameLabel);

        // Fathers Name Text field
        fathersNameTextField = new JTextField();
        fathersNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fathersNameTextField.setBounds(300, 190, 400, 30);
        add(fathersNameTextField);

        // Gender Label
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        genderLabel.setBounds(100, 240, 200, 30);
        add(genderLabel);

        // Gender Radio Button
        // Male Button
        maleRadioBtn = new JRadioButton("Male");
        maleRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        maleRadioBtn.setBackground(Color.WHITE);
        maleRadioBtn.setBounds(300, 230, 90, 50);
        add(maleRadioBtn);

        // Female Button
        femaleRadioBtn = new JRadioButton("Female");
        femaleRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        femaleRadioBtn.setBackground(Color.WHITE);
        femaleRadioBtn.setBounds(450, 230, 90, 50);
        add(femaleRadioBtn);

        // Others Button
        otherGenderRadioBtn = new JRadioButton("Others");
        otherGenderRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        otherGenderRadioBtn.setBackground(Color.WHITE);
        otherGenderRadioBtn.setBounds(600, 230, 90, 50);
        add(otherGenderRadioBtn);

        // Grouping Gender Radio button to same class
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioBtn);
        genderGroup.add(femaleRadioBtn);
        genderGroup.add(otherGenderRadioBtn);

        // Email Label
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        emailLabel.setBounds(100, 290, 200, 30);
        add(emailLabel);

        // Email Text field
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 290, 400, 30);
        add(emailTextField);

        // Marital Label
        JLabel maritalLabel = new JLabel("Marital status:");
        maritalLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalLabel.setBounds(100, 340, 200, 30);
        add(maritalLabel);

        // Marital Radio Button
        // Married Button
        marriedBtn = new JRadioButton("Married");
        marriedBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        marriedBtn.setBackground(Color.WHITE);
        marriedBtn.setBounds(300, 330, 100, 50);
        add(marriedBtn);

        // Unmarried Button
        unmarriedBtn = new JRadioButton("Unmarried");
        unmarriedBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        unmarriedBtn.setBackground(Color.WHITE);
        unmarriedBtn.setBounds(450, 330, 120, 50);
        add(unmarriedBtn);

        // Others Button
        otherMaritalStatusBtn = new JRadioButton("Others");
        otherMaritalStatusBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        otherMaritalStatusBtn.setBackground(Color.WHITE);
        otherMaritalStatusBtn.setBounds(600, 330, 120, 50);
        add(otherMaritalStatusBtn);

        // Grouping Marital Radio Button to same class
        ButtonGroup maritalGroupBtn = new ButtonGroup();
        maritalGroupBtn.add(marriedBtn);
        maritalGroupBtn.add(unmarriedBtn);
        maritalGroupBtn.add(otherMaritalStatusBtn);

        // Address Label
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        addressLabel.setBounds(100, 390, 200, 30);
        add(addressLabel);

        // Address Text field
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 390, 400, 30);
        add(addressTextField);

        // City Label
        JLabel cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        cityLabel.setBounds(100, 440, 200, 30);
        add(cityLabel);

        // City Text field
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 440, 400, 30);
        add(cityTextField);

        // State Label
        JLabel stateLabel = new JLabel("State:");
        stateLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        stateLabel.setBounds(100, 490, 200, 30);
        add(stateLabel);

        // State Text field
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 490, 400, 30);
        add(stateTextField);

        // Pin code Label
        JLabel pinCodeLabel = new JLabel("Pin Code:");
        pinCodeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCodeLabel.setBounds(100, 540, 200, 30);
        add(pinCodeLabel);

        // Pin Code Text field
        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinCodeTextField.setBounds(300, 540, 400, 30);
        add(pinCodeTextField);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Raleway", Font.BOLD, 12));
        backBtn.setBackground(Color.BLACK);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBounds(300, 620, 80, 40);
        backBtn.addActionListener(this);
        add(backBtn);

        // Next Button
        nextBtn = new JButton("Next");
        nextBtn.setFont(new Font("Raleway", Font.BOLD, 12));
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.WHITE);
        nextBtn.setBounds(450, 620, 80, 40);
        nextBtn.addActionListener(this);
        add(nextBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String name = nameTextField.getText();

        String fatherName = fathersNameTextField.getText();

        String gender = "null";
        if (maleRadioBtn.isSelected()) {
            gender = "Male";
        } else if (femaleRadioBtn.isSelected()) {
            gender = "Female";
        } else if (otherGenderRadioBtn.isSelected()) {
            gender = "Others";
        }

        String email = emailTextField.getText();

        String maritalStatus = "null";
        if (marriedBtn.isSelected()) {
            maritalStatus = "Married";
        } else if (unmarriedBtn.isSelected()) {
            maritalStatus = "Not Married";
        } else if (otherMaritalStatusBtn.isSelected()) {
            maritalStatus = "Others";
        }

        String address = addressTextField.getText();

        String city = cityTextField.getText();

        String state = stateTextField.getText();

        String pinCode = pinCodeTextField.getText();

        try {
            if (ae.getSource() == backBtn) {
                System.out.println("Already have an account?");
                this.dispose();
                LogIn login = new LogIn();
                login.setVisible(true);
            } else if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else if (fatherName.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's name is required");
            } else if (gender.equals("null")) {
                JOptionPane.showMessageDialog(null, "Please select your gender");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email is required");
            } else if (maritalStatus.equals("null")) {
                JOptionPane.showMessageDialog(null, "Please select your marital status");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you Address");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you City");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you State");
            } else if (pinCode.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you Pin Code");
            } else if (ae.getSource() == nextBtn) {
                this.dispose();
                // Open the new SignupTwo frame
                SignupTwo signupTwoFrame = new SignupTwo();
                signupTwoFrame.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}