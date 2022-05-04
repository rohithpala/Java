package Week5_OwnExceptions_Threads_MultiThreading;

import java.util.Scanner;

public class ExceptionProb2And4 {
    static byte val = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println((float)(1 / val));
            System.out.println(args[5]);
        } catch (ArithmeticException exception) {
            System.out.println("Program Execution paused due to " + exception + " exception");
            System.out.print("Enter a Value: ");
            val = input.nextByte();
            main(null);
        } catch (NullPointerException exception) {
            System.out.println("You Have To Pass Arguements to main but you didn't , so program stopped due to the exception: " + exception);
        }/*finally {
            System.out.println("I'm in Finally");
        }*/
    }
}