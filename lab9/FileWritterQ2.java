import java.io.*;

public class FileWritterQ2 {
    public static void main(String[] args) {
        
        String filename = "note.txt";
        
        // Write
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write("Nepal is beautiful.\n");
            fw.write("I love coding in Java.\n");
            fw.close();
            System.out.println("Written successfully.");
        } catch (IOException e) {
            System.out.println("Write error!");
        }

        // Read
        try {
            FileReader fr = new FileReader(filename);
            int ch;
            System.out.println("\nFile content:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Read error!");
        }
    }
}