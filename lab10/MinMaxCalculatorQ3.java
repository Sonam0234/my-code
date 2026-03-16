import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MinMaxCalculatorQ3 extends JFrame implements ActionListener {
    
    private JTextField num1Field, num2Field, num3Field;
    private JTextField minField, maxField;
    private JButton calculateButton;

    public MinMaxCalculatorQ3() {
        setTitle("Smallest and Largest of 3 Numbers");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel num1Label = new JLabel("Number 1:");
        JLabel num2Label = new JLabel("Number 2:");
        JLabel num3Label = new JLabel("Number 3:");
        JLabel minLabel = new JLabel("Smallest:");
        JLabel maxLabel = new JLabel("Largest:");

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        num3Field = new JTextField(10);
        minField = new JTextField(10);
        maxField = new JTextField(10);

        minField.setEditable(false);
        maxField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        setLayout(new GridLayout(6, 2, 5, 5));

        add(num1Label); add(num1Field);
        add(num2Label); add(num2Field);
        add(num3Label); add(num3Field);
        add(minLabel);  add(minField);
        add(maxLabel);  add(maxField);
        add(new JLabel()); add(calculateButton);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double n3 = Double.parseDouble(num3Field.getText());

            double min = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
            double max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

            minField.setText(String.valueOf(min));
            maxField.setText(String.valueOf(max));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        MinMaxCalculatorQ3 calc = new MinMaxCalculatorQ3();
        calc.setVisible(true);
    }
}
