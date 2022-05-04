package PassingObjects_Inheritence_Overloading_Static_Super;

class RunTimePolymorphism {
    int i = 1;

    // Implementing a method
    public void method() {
        System.out.println("Method 1" + i);
    }
}

// Defining a child class
class GFG extends RunTimePolymorphism {
    int i = 10;

    // Overriding the parent method
    public void method() {
        System.out.println("Method 2 " + i);
    }

    // Driver code
    public static void main(String args[]) {
        RunTimePolymorphism test = new GFG();
        System.out.println("\n" + test.i);
        test.method();
    }
}
