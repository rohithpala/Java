import java.util.HashSet;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        System.out.println("Initial Size of hs = " + hs.size());
        hs.add("D");
        hs.add("B");
        hs.add("E");
        hs.add("C");
        hs.add("Banana");
        hs.add("Byte");
        hs.add("A");
        hs.add("E");    // Doesn't take into hs as it is duplicate
        // Order is Unknown
        System.out.println("Contents of hs after adding: " + hs); // O/P: Contents of hs after adding: [A, B, C, D, E, Byte, Banana]
        System.out.println("Size of hs = " + hs.size());
        hs.remove("Byte");
        System.out.println("Contents of hs after removing: " + hs); // O/P: Contents of hs after removing: [A, B, C, D, E, Banana]
        System.out.println(hs.contains("E"));   // true
        System.out.println(hs.contains("G"));   // false
        System.out.print("Contents of hs: ");
        for (String s : hs){
            System.out.print(s + " ");
        }   // Contents of hs: A B C D E Banana
    }
}
