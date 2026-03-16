import javax.swing.JOptionPane;

public class SimpleInterestQ4 {
    public static void main(String[] args) {
        // Input using dialog boxes
        String pStr = JOptionPane.showInputDialog("Enter Principal Amount:");
        String rStr = JOptionPane.showInputDialog("Enter Rate of Interest (%):");
        String tStr = JOptionPane.showInputDialog("Enter Time (years):");
        
        try {
            double principal = Double.parseDouble(pStr);
            double rate = Double.parseDouble(rStr);
            double time = Double.parseDouble(tStr);
            
            // Simple Interest formula: SI = (P * R * T) / 100
            double si = (principal * rate * time) / 100;
            
            // Output result in dialog box
            JOptionPane.showMessageDialog(null, 
                "Principal: " + principal + 
                "\nRate: " + rate + "%" +
                "\nTime: " + time + " years" +
                "\nSimple Interest: " + si);
                
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
        }
    }
}
