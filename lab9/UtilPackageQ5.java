import java.util.*;

public class UtilPackageQ5 {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Vector Class Demo ===\n");
        
        Vector<String> vector = new Vector<>();
        
        // Adding elements
        vector.add("Nepal");
        vector.add("India");
        vector.add("China");
        vector.addElement("Bhutan");           // legacy method
        
        System.out.println("Vector elements: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());  // usually grows by doubling
        
        // Accessing
        System.out.println("Element at index 2: " + vector.get(2));
        System.out.println("Contains 'India'? " + vector.contains("India"));
        
        System.out.println("\n=== 2. Stack Class Demo ===\n");
        
        Stack<Integer> stack = new Stack<>();
        
        // Push elements (LIFO)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println("Stack (top to bottom): " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        
        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pops: " + stack);
        System.out.println("Is empty? " + stack.isEmpty());
        
        System.out.println("\n=== 3. Hashtable Class Demo ===\n");
        
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        
        // Adding key-value pairs (keys & values cannot be null)
        hashtable.put(101, "Ram");
        hashtable.put(102, "Sita");
        hashtable.put(103, "Hari");
        hashtable.put(104, "Gita");
        
        System.out.println("Hashtable: " + hashtable);
        System.out.println("Value for roll 102: " + hashtable.get(102));
        
        // Check & remove
        System.out.println("Contains key 103? " + hashtable.containsKey(103));
        hashtable.remove(104);
        System.out.println("After removing 104: " + hashtable);
        
        System.out.println("\n=== 4. Random Class Demo ===\n");
        
        Random random = new Random();
        
        // Generate different types of random values
        System.out.println("Random integer            : " + random.nextInt());
        System.out.println("Random int (0 to 99)      : " + random.nextInt(100));
        System.out.println("Random double (0.0–1.0)   : " + random.nextDouble());
        System.out.println("Random boolean            : " + random.nextBoolean());
        
        // Generate 6 dice rolls (1 to 6)
        System.out.print("Simulating 6 dice rolls   : ");
        for (int i = 0; i < 6; i++) {
            int dice = random.nextInt(6) + 1;
            System.out.print(dice + " ");
        }
        System.out.println();
        
        // Using seed for reproducible results (useful in testing)
        Random seeded = new Random(12345);   // same seed → same sequence
        System.out.println("Seeded random (first)     : " + seeded.nextInt(100));
        System.out.println("Seeded random (second)    : " + seeded.nextInt(100));
    }
}