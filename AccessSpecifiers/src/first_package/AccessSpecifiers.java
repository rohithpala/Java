package first_package;

class AS{
    private int pri = 1;
    int def = 2;
    protected int pro = 3;
    public int pub = 4;
    AS(){
        System.out.println("Private Variable: " + pri);
        System.out.println("Default Variable: " + def);
        System.out.println("Protected Variable: " + pro);
        System.out.println("Public Variable: " + pub);
        System.out.println();
    }
}

public class AccessSpecifiers{
    public static void main(String[] args) {
    //  As pri is a private Variable it can't be accessed out of the class it is declared
    //  System.out.println("Private Variable: " + new InheritsAS().pri);
        System.out.println("Default Variable: " + new InheritsAS().def);
        System.out.println("Protected Variable: " + new InheritsAS().pro);
        System.out.println("Public Variable: " + new InheritsAS().pub);
        System.out.println();
    }
}