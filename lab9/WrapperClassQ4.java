public class WrapperClassQ4 {
    public static void main(String[] args) {
        
        System.out.println("=== Autoboxing and Auto-unboxing Examples ===\n");
        
        // 1. Autoboxing: primitive → Wrapper object (automatic)
        int primitiveInt = 100;
        Integer wrapperInt = primitiveInt;          // autoboxing (no need to write new Integer())
        
        double primitiveDouble = 3.14;
        Double wrapperDouble = primitiveDouble;     // autoboxing
        
        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar;      // autoboxing
        
        boolean primitiveBool = true;
        Boolean wrapperBool = primitiveBool;        // autoboxing
        
        System.out.println("Autoboxing examples:");
        System.out.println("int → Integer   : " + wrapperInt);
        System.out.println("double → Double : " + wrapperDouble);
        System.out.println("char → Character: " + wrapperChar);
        System.out.println("boolean → Boolean: " + wrapperBool);
        
        System.out.println("\n-----------------------------------\n");
        
        // 2. Auto-unboxing: Wrapper object → primitive (automatic)
        Integer objInt = 500;
        int autoUnboxedInt = objInt;               // auto-unboxing
        
        Double objDouble = 9.75;
        double autoUnboxedDouble = objDouble;      // auto-unboxing
        
        Character objChar = 'Z';
        char autoUnboxedChar = objChar;            // auto-unboxing
        
        Boolean objBool = false;
        boolean autoUnboxedBool = objBool;         // auto-unboxing
        
        System.out.println("Auto-unboxing examples:");
        System.out.println("Integer → int    : " + autoUnboxedInt);
        System.out.println("Double → double  : " + autoUnboxedDouble);
        System.out.println("Character → char : " + autoUnboxedChar);
        System.out.println("Boolean → boolean: " + autoUnboxedBool);
        
        System.out.println("\n-----------------------------------\n");
        
        // 3. Real-world usage example (very common in collections)
        System.out.println("Common real usage - ArrayList (only accepts objects):");
        
        java.util.ArrayList<Integer> marks = new java.util.ArrayList<>();
        
        marks.add(85);          // autoboxing: int → Integer
        marks.add(92);
        marks.add(78);
        
        int total = 0;
        for (Integer m : marks) {
            total += m;         // auto-unboxing: Integer → int
        }
        
        System.out.println("Marks list    : " + marks);
        System.out.println("Total marks   : " + total);
        System.out.println("Average marks : " + (total / marks.size()));
    }
}