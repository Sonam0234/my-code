import java.io.*;

public class VowelCountQ1 {
    public static void main(String[] args) {
        String text = "Java is object oriented programming";
        String file = "data.txt";
        int count = 0;

        // Write
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write(text.getBytes());
            out.close();
        } catch (IOException e) {
            System.out.println("Cannot write file");
        }

        // Read + count
        try {
            FileInputStream in = new FileInputStream(file);
            int b;
            while ((b = in.read()) != -1) {
                char c = Character.toLowerCase((char) b);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }

        System.out.println("Total vowels: " + count);
    }
}