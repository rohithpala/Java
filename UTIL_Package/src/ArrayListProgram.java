import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Initial Size of a: " + al.size());
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(0,1);
        al.add(0, 5);
        System.out.println(al);
        System.out.println("Size of al: " + al.size());
        al.remove(2);
        System.out.println(al);
        al.removeAll(al);
        System.out.println(al);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(0,1);
        System.out.println(al.get(0));
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
    }
}
