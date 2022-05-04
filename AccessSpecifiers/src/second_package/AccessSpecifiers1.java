package second_package;
import first_package.*;

class AS2 {
    AS2(){
        //  System.out.println("Private Variable: " + new InheritsAS().pri);
        //  System.out.println("Default Variable: " + new InheritsAS().def);
        //  System.out.println("Protected Variable: " + new InheritsAS().pro);
        System.out.println("Public Variable: " + new InheritsAS().pub);
        System.out.println();
    }
}

public class AccessSpecifiers1{
    public static void main(String[] args) {
        new AS2();
    }
}