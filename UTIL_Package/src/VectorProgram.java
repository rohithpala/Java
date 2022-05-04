import java.util.Vector;

public class VectorProgram {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>(3);    // If Initial Capacity not mentioned by default it takes 10. If 2nd argument not given then the size gets doubled
        System.out.println("Initial Capacity of Vector vector: " + vector.capacity());  // Initial Capacity of Vector vector: 3
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);
        System.out.println("Capacity after adding elements to Vector vector: " + vector.capacity());  // Doubles it's size
        // Capacity after adding elements to Vector vector: 6
        vector.remove(2);
        System.out.println("Capacity after removing elements from Vector vector: " + vector.capacity());  // Same Size
        // Capacity after removing elements from Vector vector: 6
        System.out.println("First Element: " + vector.firstElement());  // First Element: 2
        System.out.println("Last Element: " + vector.lastElement());    // Last Element: 5
        System.out.println(vector.contains(4)); // false
        System.out.println(vector.elementAt(0));    // 2
        System.out.print("Values by iterating: ");
        for(int i : vector) {
            System.out.print(i + " ");
        }   // Values by iterating: 2 3 5
    }
}
