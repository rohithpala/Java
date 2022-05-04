package Week8_Serialization_UTIL;

import java.util.LinkedList;

public class LinkedListAndMethods {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        LinkedList<Integer> l1;
        l.add(0);
        l.add(0,1);
        l.add(1,2);
        l.addFirst(-1);
        l.addLast(3);
        System.out.println(l);
        l.remove(0);
        for (Integer integer : l) {
            System.out.print(integer + " ");
        }
        System.out.println();
        l1 = (LinkedList<Integer>) l.clone();
        System.out.println(l1);
        l.addAll(l1);
        System.out.println(l);
        System.out.println(l.element());
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getClass());
        System.out.println(l.poll());
        System.out.println(l.pollFirst());
        System.out.println(l.pollLast());
        System.out.println(l);
        l.addLast(10);
        System.out.println(l.pop());
        l.add(55);
        System.out.println(l.get(1));
        System.out.println(l);
        l.clear();
        System.out.println("After Clearing: " + l);
    }
}
