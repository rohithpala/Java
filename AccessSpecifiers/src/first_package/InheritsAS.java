package first_package;

public class InheritsAS extends AS {
    public InheritsAS() {
        // Aspri is a private Variable it can't be accessed in even Inherited class
        //  System.out.println("Private Variable: " + pri);
        System.out.println("Default Variable: " + def);
        System.out.println("Protected Variable: " + pro);
        System.out.println("Public Variable: " + pub);
        System.out.println();
    }
}
