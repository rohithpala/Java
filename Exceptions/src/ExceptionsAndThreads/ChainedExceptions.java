package ExceptionsAndThreads;

public class ChainedExceptions {
    static byte var = 0;

    public static void main(String[] args) {
        try {
            System.out.println(1 / var);
            System.out.println(args[0]);
        } catch (ArithmeticException exception) {
            System.out.println("0 is invalid. " + "Got An Exception " + exception);
            var = 1;
            main(null);
        } catch (NullPointerException exception) {
            System.out.println("Please Pass Some Arguments Got An Exception ( " + exception + " ) and Terminated");
        } finally {
            System.out.println("Completed Execution");
        }
    }
}
/*
0 is invalid. Got An Exception java.lang.ArithmeticException: / by zero
1
Please Pass Some Arguments Got An Exception java.lang.NullPointerException: Cannot load from object array because "args" is null and Terminated
Completed Execution
Completed Execution
*/
