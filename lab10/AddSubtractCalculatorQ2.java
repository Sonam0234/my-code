import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubtractCalculatorQ2 extends JFrame implements ActionListener {

    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;
    private JButton addButton;
    private JButton subButton;

    public AddSubtractCalculatorQ2() {
        setTitle("Add and Subtract Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel num1Label = new JLabel("Number 1:");
        JLabel num2Label = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Result:");

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);

        resultField.setEditable(false);

        addButton = new JButton("Add");
        subButton = new JButton("Subtract");

        addButton.addActionListener(this);
        subButton.addActionListener(this);

        // Layout
        setLayout(new GridLayout(4, 2, 5, 5));

        add(num1Label);
        add(num1Field);

        add(num2Label);
        add(num2Field);

        add(resultLabel);
        add(resultField);

        add(addButton);
        add(subButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = n1 + n2;
            } else if (e.getSource() == subButton) {
                result = n1 - n2;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Please enter valid numeric values.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddSubtractCalculatorQ2 calc = new AddSubtractCalculatorQ2();
            calc.setVisible(true);
        });
    }
}
