import java.io.*;
import java.util.*;

public class StudentRecordQ3 {
    public static void main(String[] args) throws IOException {
        
        String filename = "student.txt";
        
        // Writing
        PrintWriter pw = new PrintWriter(filename);
        pw.println("101 Ram Kirtipur 9841000001");
        pw.println("102 Sita Kathmandu 9851000002");
        pw.println("103 Hari Kirtipur 9841000003");
        pw.close();
        
        System.out.println("Records saved.\n");
        
        // Reading and filtering
        Scanner sc = new Scanner(new File(filename));
        
        System.out.println("Students from Kirtipur:");
        System.out.println("-------------------------------");
        
        while (sc.hasNext()) {
            String roll    = sc.next();
            String name    = sc.next();
            String address = sc.next();
            String phone   = sc.next();
            
            if (address.equalsIgnoreCase("Kirtipur")) {
                System.out.println(roll + "  " + name + "  " + address + "  " + phone);
            }
        }
        
        sc.close();
    }
}