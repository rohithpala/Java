package Week8_Serialization_UTIL;

import java.util.HashSet;

public class HashSetAndMethods {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("Rohith");
        set.add("Me");
        set.add("Rohith");// HashSet only takes unique elements
        System.out.println(set); // O/P: [Rohith, Me]
        // HashSet order isn't maintained
        set.add("Pala");
        for (String s : set) {
            System.out.println(s);
        }
        /*
          Pala
          Rohith
          Me
        */
        set.remove("Pala");
        System.out.println(set); //[Rohith, Me]
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Pala");
        set.addAll(set1);
        System.out.println(set);//[Pala, Rohith, Me]
    }
}
