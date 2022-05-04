package Map;

import java.util.TreeMap;

public class TreeMapProgram {
    public static void main(String[] args) {
        TreeMap<Character, Integer> ascii = new TreeMap<Character, Integer>();
        System.out.println("Initial Size of TreeMap ascii: " + ascii.size());   // Initial Size of TreeMap ascii: 0
        ascii.put('A', 97);
        ascii.put('D', 100);
        ascii.put('B', 98);
        ascii.put('E', 101);
        ascii.put('C', 99);
        ascii.put('E', 101); // Duplicate Keys are not considered
        ascii.put('G', 103);
        ascii.put('F', 102);
        System.out.println("Contents of TreeMap ascii: " + ascii);  // Contents of TreeMap ascii: {A=97, B=98, C=99, D=100, E=101, F=102, G=103}
        System.out.println("Size of TreeMap ascii: " + ascii.size());   // Size of TreeMap ascii: 7
        System.out.println(ascii.containsKey('F')); // true
        System.out.println(ascii.containsValue(101));   // true
        System.out.println(ascii.keySet()); // [A, B, C, D, E, F, G]
        System.out.println(ascii.values()); // [97, 98, 99, 100, 101, 102, 103]
        System.out.print("Keys: ");
        for (char ch : ascii.keySet()) {
            System.out.print(ch + " ");
        }   // Keys: A B C D E F G
        System.out.println();
        System.out.print("Values: ");
        for (int value : ascii.values()) {
            System.out.print(value + " ");
        }   // Values: 97 98 99 100 101 102 103
        System.out.println("\nValues by iterating: ");
        for (char i : ascii.keySet()) {
            System.out.println(i + " : " + ascii.get(i));
        }
        /*
        A : 97
        B : 98
        C : 99
        D : 100
        E : 101
        F : 102
        G : 103
        */
        ascii.remove('G');
        System.out.println(ascii);  // {A=97, B=98, C=99, D=100, E=101, F=102}
        ascii.remove('F', 100);
        System.out.println(ascii);  // {A=97, B=98, C=99, D=100, E=101, F=102}
        ascii.remove('F', 102);
        System.out.println(ascii);  // {A=97, B=98, C=99, D=100, E=101}
        System.out.println(ascii.lowerKey('A'));    // null
        System.out.println(ascii.lowerKey('D'));    // C
        System.out.println(ascii.higherKey('E'));   // null
        System.out.println(ascii.higherKey('C'));   // D
        System.out.println(ascii.higherKey('S'));   // null
        System.out.println(ascii.lowerEntry('A'));  // null
        System.out.println(ascii.lowerEntry('B'));  // A=97
        System.out.println(ascii.higherEntry('A')); // B=98
        System.out.println(ascii.headMap('D'));   // {A=97, B=98, C=99}
        System.out.println(ascii.headMap('A'));   // {}
        System.out.println(ascii.entrySet());   // [A=97, B=98, C=99, D=100, E=101]
    }
}
