package PassingObjects_Inheritence_Overloading_Static_Super;

class Box{
    private static int a,b,c;
    public static void setVariables() {
        a = 1;
        b = 2;
        c = 3;
    }
    public static void getVariables(){
        System.out.println("a: " + a + "," + "b: " + b + "," + "c: " + c);
    }
}

public class HideInstanceVariables{
    public static void main(String[] args) {
        Box.setVariables();
        Box.getVariables();
    }
}