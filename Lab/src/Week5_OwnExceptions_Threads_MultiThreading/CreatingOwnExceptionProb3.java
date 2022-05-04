package Week5_OwnExceptions_Threads_MultiThreading;

import java.util.Scanner;

class ItemNotFoundException extends Exception {
}

public class CreatingOwnExceptionProb3{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short ID[] = {120, 145, 100, 156, 12};
        byte found = 0;
        String cmd = "";
        try {
            System.out.print("Enter the Item Id: ");
            short id = input.nextShort();
            for (short i = 0;i< ID.length;i++) {
                if (ID[i] != id)
                    found = 0;
                else
                    found = 1;
            }
            if(found == 1)
                System.out.println("Item Found");
            else
                throw new ItemNotFoundException();
        } catch (ItemNotFoundException exception) {
            System.out.println("The Item with the entered ID is not found: " + exception);
        } finally {
            System.out.println("Completed Execution");
        }
    }
}