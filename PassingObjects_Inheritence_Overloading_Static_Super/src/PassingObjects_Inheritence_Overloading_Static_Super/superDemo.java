package PassingObjects_Inheritence_Overloading_Static_Super;

class ParentClass {
    int a;
    ParentClass(int a){
        this.a = a;
        System.out.println("I am Parent Class\n" + "a of Parent Class: " + a);
        ParentDisplay();
    }
    void ParentDisplay(){
        System.out.println("I am Parent Class\n" + "a of Parent Class: " + a);
    }
}

class Child extends ParentClass{
    Child(){
        super(1);
    }
    void ParentDisplay(){
        System.out.println("I am Child Class\n" + "a of Child class: " + a);
    }
}

public class superDemo{
    public static void main(String[] args) {
        new Child();
    }
}