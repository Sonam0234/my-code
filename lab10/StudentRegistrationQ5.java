import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationQ5 extends JFrame implements ActionListener {
    JTextField nameField, addressField, emailField;
    JPasswordField passwordField;
    JTextArea opinionArea;
    JRadioButton male, female;
    JCheckBox reading, gaming, sports;
    JComboBox<String> country;
    JButton submit;

    public StudentRegistrationQ5() {
        setTitle("Student Registration Q5");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(13, 1));

        // Name
        add(new JLabel("Name:")); nameField = new JTextField(15); add(nameField);
        
        // Address  
        add(new JLabel("Address:")); addressField = new JTextField(15); add(addressField);
        
        // Email
        add(new JLabel("Email:")); emailField = new JTextField(15); add(emailField);
        
        // Password
        add(new JLabel("Password:")); passwordField = new JPasswordField(15); add(passwordField);
        
        // Gender
        JPanel gender = new JPanel();
        male = new JRadioButton("Male"); female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup(); bg.add(male); bg.add(female);
        gender.add(new JLabel("Gender: ")); gender.add(male); gender.add(female);
        add(gender);
        
        // Hobbies
        JPanel hobbies = new JPanel();
        reading = new JCheckBox("Reading"); gaming = new JCheckBox("Gaming"); sports = new JCheckBox("Sports");
        hobbies.add(new JLabel("Hobbies: ")); hobbies.add(reading); hobbies.add(gaming); hobbies.add(sports);
        add(hobbies);
        
        // Country
        add(new JLabel("Country:")); 
        String[] countries = {"India", "USA", "UK", "Canada"};
        country = new JComboBox<>(countries); 
        add(country);
        
        // Opinion
        add(new JLabel("Opinion:")); 
        opinionArea = new JTextArea(3, 15); 
        add(new JScrollPane(opinionArea));
        
        // Submit button
        submit = new JButton("Submit");
        submit.addActionListener(this);
        add(submit);
    }

    public void actionPerformed(ActionEvent e) {
        String info = "Student Details:\n\n";
        info += "Name: " + nameField.getText() + "\n";
        info += "Address: " + addressField.getText() + "\n";
        info += "Email: " + emailField.getText() + "\n";
        info += "Password: " + new String(passwordField.getPassword()) + "\n";
        info += "Gender: " + (male.isSelected() ? "Male" : "Female") + "\n";
        info += "Hobbies: ";
        if(reading.isSelected()) info += "Reading ";
        if(gaming.isSelected()) info += "Gaming ";
        if(sports.isSelected()) info += "Sports\n";
        info += "Country: " + country.getSelectedItem() + "\n";
        info += "Opinion: " + opinionArea.getText();
        
        JOptionPane.showMessageDialog(this, info);
    }

    public static void main(String[] args) {
        new StudentRegistrationQ5().setVisible(true);
    }
}
