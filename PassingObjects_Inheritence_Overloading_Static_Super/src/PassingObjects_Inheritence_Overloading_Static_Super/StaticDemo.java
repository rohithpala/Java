package PassingObjects_Inheritence_Overloading_Static_Super;

import java.util.Scanner;

class StaticClass{
    static int i = 1;
    static void staticMethod(int element){
        i = element;
        System.out.println("i = " + i);
    }
    static{ // Executes only one time
        int i = 10;
        System.out.println("i = " + i);
    }
}

public class StaticDemo{
    public static void main(String[] args) {
        System.out.println("Enter an Element:");
        int element = (new Scanner(System.in)).nextInt();
        StaticClass.staticMethod(element);
        StaticClass.staticMethod(element);
    }
}