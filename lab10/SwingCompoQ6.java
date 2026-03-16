import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCompoQ6 extends JFrame {
    
    public SwingCompoQ6() {
        setTitle("Swing Q6 Compo");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // 1. JMenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        
        // 2. JDesktopPane
        JDesktopPane desktop = new JDesktopPane();
        setContentPane(desktop);
        
        // 3. JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(250, 150);
        internalFrame.setLocation(20, 20);
        internalFrame.add(new JLabel("JInternalFrame Compo", JLabel.CENTER));
        desktop.add(internalFrame);
        internalFrame.setVisible(true);
        
        // 4. JTable
        String[] columns = {"ID", "Name", "Dept"};
        Object[][] data = {
            {1, "Garima", "IT"},
            {2, "Jupina", "HR"},
            {3, "Babydoll", "Sales"}
        };
        
        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(300, 20, 350, 150);
        desktop.add(scrollPane);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingCompoQ6().setVisible(true);
            }
        });
    }
}
