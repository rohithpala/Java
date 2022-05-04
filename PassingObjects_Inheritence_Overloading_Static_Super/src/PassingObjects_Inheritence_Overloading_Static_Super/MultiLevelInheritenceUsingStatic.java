package PassingObjects_Inheritence_Overloading_Static_Super;

class GrandParent1{
    void Display(){
        System.out.println("I am In GrandParent Class\n");
    }
    static{
        int i = 0;
        System.out.println("i = " + i);
    }
}

class Parent1 extends GrandParent1{
    void Display(){
        System.out.println("I am In Parent Class\n");
    }
    static{
        int i = 1;
        System.out.println("i = " + i);
    }
}

class Son1 extends Parent1{
    void Display(){
        System.out.println("I am In Son Class\n");
    }
    static{
        int i = 2;
        System.out.println("i = " + i);
    }
}

public class MultiLevelInheritenceUsingStatic {
    public static void main(String[] args) {
        new Son1();
        new Son1().Display();
        new Son1();
        new Son1().Display();
    }
}