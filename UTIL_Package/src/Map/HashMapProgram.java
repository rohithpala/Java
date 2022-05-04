package Map;

import java.util.HashMap;

public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<String , Integer> ascii = new HashMap<String, Integer>();
        System.out.println("Initial Size of HashMap ascii: " + ascii.size());   // Initial Size of TreeMap ascii: 0
        ascii.put("A", 97);
        ascii.put("Banana", 200);
        ascii.put("D", 100);
        ascii.put("B", 98);
        ascii.put("E", 101);
        ascii.put("Byte", 201);
        ascii.put("C", 99);
        ascii.put("E", 101); // Duplicate Keys are not considered
        ascii.put("G", 103);
        ascii.put("F", 102);
        System.out.println("Contents of HashMap ascii: " + ascii);  // Contents of HashMap ascii: {A=97, B=98, C=99, D=100, E=101, F=102, Byte=201, G=103, Banana=200}
        System.out.println("Size of HashMap ascii: " + ascii.size());   // Size of HashMap ascii: 9
        System.out.println(ascii.containsKey("F")); // true
        System.out.println(ascii.containsValue(101));   // true
        System.out.print("Keys: ");
        for (String s : ascii.keySet()) {
            System.out.print(s + " ");
        }   // Keys: A B C D E F Byte G Banana
        System.out.println();
        System.out.print("Values: ");
        for (int value : ascii.values()) {
            System.out.print(value + " ");
        }   // Values: 97 98 99 100 101 102 201 103 200
        System.out.println();
        System.out.println("\nValues by iterating: ");
        for (String i : ascii.keySet()) {
            System.out.println(i + " : " + ascii.get(i));
        }
        /*
        Values by iterating:
        A : 97
        B : 98
        C : 99
        D : 100
        E : 101
        F : 102
        Byte : 201
        G : 103
        Banana : 200
        */
        ascii.remove("G");
        System.out.println(ascii);  // {A=97, B=98, C=99, D=100, E=101, F=102, Byte=201, Banana=200}
        ascii.remove("F", 100);
        System.out.println(ascii);  // {A=97, B=98, C=99, D=100, E=101, F=102, Byte=201, Banana=200}
        ascii.remove("F", 102);
        System.out.println(ascii);  // {A=97, B=98, C=99, D=100, E=101, Byte=201, Banana=200}
        System.out.println("Is Empty: " + ascii.isEmpty());
        System.out.println("Is Empty: " + ascii.isEmpty());
    }
}
