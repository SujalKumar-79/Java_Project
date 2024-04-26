import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

    JComboBox<String> religionComboBox, categoryComboBox, incomeComboBox, educationComboBox, occupationComboBox;

    JTextField adharTextField = new JTextField();
    JTextField panTextField = new JTextField();

    JButton nextBtn, backBtn;
    JRadioButton seniorYesRadioBtn, seniorNoRadioBtn, ExistingYes, ExistingNo;

    SignupTwo() {
        // Setting Frame Properties
        setTitle("Account Opening Form - Page 02");
        setSize(850, 780);
        setLocation(350, 50);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Additional details Label
        JLabel additionalDetails = new JLabel("Page 2: Additional details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        // Religion Label
        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);

        // Religion Combo Box
        String[] religions = { "Hindu", "Muslim", "Christian", "Sikh", "Others" };
        religionComboBox = new JComboBox<>(religions);
        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setSelectedIndex(-1); // Set to null by default
        add(religionComboBox);

        // Category Label
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        // Category Combo Box
        String[] categories = { "GENERAL", "OBC", "SC", "ST", "Others" };
        categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setSelectedIndex(-1); // Set to null by default
        add(categoryComboBox);

        // Senior Citizen Label
        JLabel seniorLabel = new JLabel("Senior citizen:");
        seniorLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorLabel.setBounds(100, 240, 200, 30);
        add(seniorLabel);

        // Senior Citizen Radio Button
        // Yes Button
        seniorYesRadioBtn = new JRadioButton("Yes");
        seniorYesRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        seniorYesRadioBtn.setBackground(Color.WHITE);
        seniorYesRadioBtn.setBounds(300, 230, 90, 50);
        add(seniorYesRadioBtn);

        // No Button
        seniorNoRadioBtn = new JRadioButton("No");
        seniorNoRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        seniorNoRadioBtn.setBackground(Color.WHITE);
        seniorNoRadioBtn.setBounds(450, 230, 90, 50);
        add(seniorNoRadioBtn);

        // Grouping Senior Citizen Radio button to same class
        ButtonGroup seniorRadioGroup = new ButtonGroup();
        seniorRadioGroup.add(seniorYesRadioBtn);
        seniorRadioGroup.add(seniorNoRadioBtn);

        // Income Label
        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 290, 200, 30);
        add(incomeLabel);

        // Income Combo Box
        String[] incomes = { "<100000", "100001 - 249999", "250000 - 499999", "500000 - 999999", ">1000000" };
        incomeComboBox = new JComboBox<>(incomes);
        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeComboBox.setBounds(300, 290, 400, 30);
        incomeComboBox.setSelectedIndex(-1); // Set to null by default
        add(incomeComboBox);

        // Exixting Account Label
        JLabel existingAccountLabel = new JLabel("Existing Account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccountLabel.setBounds(100, 340, 200, 30);
        add(existingAccountLabel);

        // Existing Account Radio Button
        // Yes Button
        ExistingYes = new JRadioButton("Yes");
        ExistingYes.setFont(new Font("Raleway", Font.BOLD, 15));
        ExistingYes.setBackground(Color.WHITE);
        ExistingYes.setBounds(300, 330, 100, 50);
        add(ExistingYes);

        // No Button
        ExistingNo = new JRadioButton("No");
        ExistingNo.setFont(new Font("Raleway", Font.BOLD, 15));
        ExistingNo.setBackground(Color.WHITE);
        ExistingNo.setBounds(450, 330, 120, 50);
        add(ExistingNo);

        // Grouping Existing account Radio Button to same class
        ButtonGroup maritalGroupBtn = new ButtonGroup();
        maritalGroupBtn.add(ExistingYes);
        maritalGroupBtn.add(ExistingNo);

        // Educational Qualification Label
        JLabel educationLabel = new JLabel("Education:");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel.setBounds(100, 390, 200, 30);
        add(educationLabel);

        // Address Text field
        String[] education = { "Matriculated", "Intermediate", "Graduate", "Post Graduate", "Doctorate", "Others" };
        educationComboBox = new JComboBox<>(education);
        educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        educationComboBox.setBounds(300, 390, 400, 30);
        educationComboBox.setSelectedIndex(-1); // Set to null by default
        add(educationComboBox);

        // Occupation Label
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 440, 200, 30);
        add(occupationLabel);

        // Occupation Combo Box
        String occupation[] = { "Engineer", "Doctor", "Artist", "Self-Employed", "Others" };
        occupationComboBox = new JComboBox<>(occupation);
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationComboBox.setBounds(300, 440, 400, 30);
        occupationComboBox.setSelectedIndex(-1); // Set to null by default
        add(occupationComboBox);

        // Pan card Label
        JLabel panLabel = new JLabel("Pan no.:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 490, 200, 30);
        add(panLabel);

        // Pan card Text field
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 490, 400, 30);
        add(panTextField);

        // Adhar Label
        JLabel adharLabel = new JLabel("Adhar no.:");
        adharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        adharLabel.setBounds(100, 540, 200, 30);
        add(adharLabel);

        // Adhar card Text field
        adharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adharTextField.setBounds(300, 540, 400, 30);
        add(adharTextField);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        backBtn.setBackground(Color.BLACK);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBounds(330, 620, 80, 40);
        backBtn.addActionListener(this);
        add(backBtn);

        // Next Button
        nextBtn = new JButton("Next");
        nextBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.WHITE);
        nextBtn.setBounds(500, 620, 80, 40);
        nextBtn.addActionListener(this);
        add(nextBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String religion = "";
        religion = (String) religionComboBox.getSelectedItem();

        String seniorValue = "";
        if (seniorYesRadioBtn.isSelected()) {
            seniorValue = "Yes";
        } else if (seniorNoRadioBtn.isSelected()) {
            seniorValue = "No";
        }

        String existingValue = "";
        if (ExistingYes.isSelected()) {
            existingValue = "Yes";
        } else if (ExistingNo.isSelected()) {
            existingValue = "No";
        }

        String category = "";
        category = (String) categoryComboBox.getSelectedItem();

        String income = "";
        income = (String) incomeComboBox.getSelectedItem();

        String education = "";
        education = (String) educationComboBox.getSelectedItem();

        String occupation = "";
        occupation = (String) occupationComboBox.getSelectedItem();

        String pan = "";
        pan = panTextField.getText();

        String adhar = "";
        adhar = adharTextField.getText();

        try {
            if (ae.getSource() == backBtn) {
                this.dispose();
                SignupOne signupone = new SignupOne();
                signupone.setVisible(true);
            } else if (ae.getSource() == nextBtn) {
                if (religion == null || religion.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select your Religion");
                } else if (category == null || category.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select your Category");
                } else if (seniorValue.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select whether you are a Senior Citizen");
                } else if (income == null || income.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select your Annual Income Range");
                } else if (existingValue.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select whether you have an Existing Account with us");
                } else if (education == null || education.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select your Latest Education Degree");
                } else if (occupation == null || occupation.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select your Occupation");
                } else if (pan == null || pan.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter your PAN Number");
                } else if (adhar == null || adhar.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter your AADHAR Number");
                } else {
                    // Code from Below
                    SignupThree signupThreeObj = new SignupThree();
                    signupThreeObj.setVisible(true);
                    this.dispose();
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupTwo();
    }
}

// Add back button in page 2 also
