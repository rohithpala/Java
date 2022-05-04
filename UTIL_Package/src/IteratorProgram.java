import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorProgram{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        Iterator<String> ref = al.iterator();
        System.out.print("Contents of al: ");
        while (ref.hasNext()){
            System.out.print(ref.next() + " ");
        }
        System.out.println();
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ListIterator<String> ref1 = ll.listIterator();
        System.out.print("Contents of ll: ");
        while (ref1.hasNext()){
            System.out.print(ref1.next() + " ");
        }
        System.out.println("\nPointer is at C");
        System.out.print("Contents of ll in reverse order: ");
        while (ref1.hasPrevious()){
            System.out.print(ref1.previous() + " ");
        }
        System.out.println("\nPointer is at A");
    }
}
