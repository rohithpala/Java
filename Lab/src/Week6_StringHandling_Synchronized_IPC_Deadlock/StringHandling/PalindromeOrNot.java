package Week6_StringHandling_Synchronized_IPC_Deadlock.StringHandling;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str = (new Scanner(System.in)).nextLine();
        int len = str.length();
        boolean palindrome = true;
        for (int iter = 0; iter < len / 2; iter++) {
            if(str.charAt(iter) == str.charAt(len - iter - 1))
                palindrome = true;
            else{
                palindrome = false;
                System.out.println("Not a Palindrome");
                break;
            }
        }
        if(palindrome)
            System.out.println("Is Palindrome");
    }
}
