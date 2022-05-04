package Week8_Serialization_UTIL;

import java.util.ArrayList;

public class ArrayListAndMethods {
    public static void main(String[] args){
        ArrayList<java.lang.constant.Constable> arrayList=new ArrayList<>();
        arrayList.add("Hi! ");
        arrayList.add("This is ");
        arrayList.add("Rohith. ");
        arrayList.add("My Lucky number is 5");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.add(4,"\n");
        System.out.println(arrayList.isEmpty());
        arrayList.set(4,"I Like Nature");
        for (java.lang.constant.Constable constable : arrayList) {
            System.out.println(constable);
        }
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList.contains("I Like Nature"));
        for (java.lang.constant.Constable constable : arrayList) {
            System.out.println(constable);
        }
    }
}
