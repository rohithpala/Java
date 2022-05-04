import java.util.TreeSet;

public class TreeSetProgram {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        System.out.println("Initial Size of TreeSet = " + ts.size());   // Initial Size of TreeSet = 0
        ts.add("D");
        ts.add("B");
        ts.add("E");
        ts.add("C");
        ts.add("Banana");
        ts.add("Byte");
        ts.add("A");
        ts.add("E");    // Doesn't take into ts as it is duplicate
        System.out.println(ts); // [A, B, Banana, Byte, C, D, E]
        System.out.println("Size of TreeSet After Adding Elements = " + ts.size()); // Size of TreeSet After Adding Elements = 7
        ts.remove("E");
        System.out.println(ts.contains("D"));   // true
        System.out.println(ts.contains("G"));   // false
        System.out.print("Contents of ts: ");
        for (String s : ts) {
            System.out.print(s + " ");
        }   // Contents of ts: A B Banana Byte C D
    }
}
