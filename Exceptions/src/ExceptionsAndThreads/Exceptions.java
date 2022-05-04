package ExceptionsAndThreads;

class NoClassException{
    private class InnerClass {
        private int n = 0;
    }
}

public class Exceptions {
    public static void main(String[] args) {
        int a = 0;
/*
        Unchecked Exceptions
        System.out.println(1/a); // ArithmeticException
        System.out.println(args[0]); // ArrayIndexOutOfBoundsException

        Checked Exceptions
        new NoClassException().new InnerClass().n = 0; // IllegalAccessException
        show ref = new show(); // ClassNotFoundException
*/
    }
}
