package ExceptionsAndThreads;

import java.util.Scanner;

class ItemNotFoundException extends Exception {
}

public class CreatingOwnException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short[] ID = {120, 145, 100, 156, 12};
        byte found = 0;
        try {
            System.out.print("Enter the Item Id: ");
            short id = input.nextShort();
            for (short value : ID) {
                if (value != id)
                    found = 0;
                else
                    found = 1;
            }
            if (found == 1)
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