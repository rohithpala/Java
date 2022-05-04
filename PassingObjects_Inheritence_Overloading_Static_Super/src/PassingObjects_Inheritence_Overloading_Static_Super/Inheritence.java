package PassingObjects_Inheritence_Overloading_Static_Super;

class GrandParent {
    GrandParent() {
        System.out.println("I am Grand Parent\n");
    }
}
class Parent extends GrandParent{
    Parent(){
        System.out.println("I am Parent\n");
    }
}
class Son extends Parent{
    Son(){
        System.out.println("I am Son\n");
    }
}
class Inheritence {
    public static void main(String[] args) {
        Son rohith = new Son();
    }
}
