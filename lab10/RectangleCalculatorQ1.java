import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleCalculatorQ1 extends JFrame implements ActionListener {

    private JTextField lengthField;
    private JTextField widthField;
    private JTextField areaField;
    private JTextField perimeterField;
    private JButton calculateButton;

    public RectangleCalculatorQ1() {
        setTitle("Rectangle Area & Perimeter");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lengthLabel = new JLabel("Length:");
        JLabel widthLabel = new JLabel("Width:");
        JLabel areaLabel = new JLabel("Area:");
        JLabel perimeterLabel = new JLabel("Perimeter:");

        lengthField = new JTextField(10);
        widthField = new JTextField(10);
        areaField = new JTextField(10);
        perimeterField = new JTextField(10);

        areaField.setEditable(false);
        perimeterField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);  // this class handles the click

        setLayout(new GridLayout(5, 2, 5, 5));

        add(lengthLabel);
        add(lengthField);

        add(widthLabel);
        add(widthField);

        add(areaLabel);
        add(areaField);

        add(perimeterLabel);
        add(perimeterField);

        add(new JLabel());          // empty cell
        add(calculateButton);       // button at bottom-right
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());

            double area = length * width;
            double perimeter = 2 * (length + width);

            areaField.setText(String.valueOf(area));
            perimeterField.setText(String.valueOf(perimeter));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Please enter valid numeric values for length and width.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        new RectangleCalculatorQ1().setVisible(true);
    }
}
