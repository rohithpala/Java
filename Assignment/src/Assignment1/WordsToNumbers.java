/*
Write a Java Program to print a given number in Indian Number
        System and also in Large Number System. Assuming the given
        number is not more than 9 digit.
        Input:
        Twelve crore thirty four lakh fifty six thousand seven hundred and eighty nine
        Output:12,34,56,789
        Input:
        One hundred twenty three million four hundred fifty six thousand seven hundred and eighty nine
        Output: 123,456,789
*/

package Assignment1;

import java.util.Scanner;

public class WordsToNumbers {
    static int Number(String number) {
        if (number.equalsIgnoreCase("one")) {
            return 1;
        } else if (number.equalsIgnoreCase("two")) {
            return 2;
        } else if (number.equalsIgnoreCase("three")) {
            return 3;
        } else if (number.equalsIgnoreCase("four")) {
            return 4;
        } else if (number.equalsIgnoreCase("five")) {
            return 5;
        } else if (number.equalsIgnoreCase("six")) {
            return 6;
        } else if (number.equalsIgnoreCase("seven")) {
            return 7;
        } else if (number.equalsIgnoreCase("eight")) {
            return 8;
        } else if (number.equalsIgnoreCase("nine")) {
            return 9;
        } else if (number.equalsIgnoreCase("eleven")) {
            return 11;
        } else if (number.equalsIgnoreCase("twelve")) {
            return 12;
        } else if (number.equalsIgnoreCase("thirteen")) {
            return 13;
        } else if (number.equalsIgnoreCase("fourteen")) {
            return 14;
        } else if (number.equalsIgnoreCase("fifteen")) {
            return 15;
        } else if (number.equalsIgnoreCase("sixteen")) {
            return 16;
        } else if (number.equalsIgnoreCase("seventeen")) {
            return 17;
        } else if (number.equalsIgnoreCase("eighteen")) {
            return 18;
        } else if (number.equalsIgnoreCase("nineteen")) {
            return 19;
        } else if (number.equalsIgnoreCase("ten")) {
            return 10;
        } else if (number.equalsIgnoreCase("twenty")) {
            return 20;
        } else if (number.equalsIgnoreCase("thirty")) {
            return 30;
        } else if (number.equalsIgnoreCase("fourty")) {
            return 40;
        } else if (number.equalsIgnoreCase("fifty")) {
            return 50;
        } else if (number.equalsIgnoreCase("sixty")) {
            return 60;
        } else if (number.equalsIgnoreCase("seventy")) {
            return 70;
        } else if (number.equalsIgnoreCase("eighty")) {
            return 80;
        } else if (number.equalsIgnoreCase("ninety")) {
            return 90;
        } else if (number.equalsIgnoreCase("hundred")) {
            return 100;
        } else if (number.equalsIgnoreCase("thousand")) {
            return 1000;
        } else if (number.equalsIgnoreCase("lakh")) {
            return 100000;
        } else if (number.equalsIgnoreCase("million")) {
            return 1000000;
        } else if (number.equalsIgnoreCase("crore")) {
            return 10000000;
        }
        return 0;
    }

    static String formatNumber(int num, byte indianSystem) {
        String number = String.valueOf(num);
        String[] numberSplit = number.split("");
        String resString = "";
        byte len = (byte) numberSplit.length;
        if (len <= 3)
            return number;
        else {
            resString = "," + numberSplit[len - 3] + numberSplit[len - 2] + numberSplit[len - 1];
            int k = 0;
            for (int i = len - 4; i >= 0; i--) {
                resString = numberSplit[i] + resString;
                k++;
                if (k % 2 == 0 && i != 0 && indianSystem == 1)
                    resString = "," + resString;
                if (k % 3 == 0 && i != 0 && indianSystem == 0)
                    resString = "," + resString;
            }
            return resString;
        }
    }

    public static void main(String[] args) {
        byte indianSystem = 1;
        int sum = 0, tempSum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number in Words: ");
        String number = input.nextLine();
        String[] numbersInWords = number.split(" ");
        for (String numbersInWord : numbersInWords) {
            if (numbersInWord.equalsIgnoreCase("thousand") || numbersInWord.equalsIgnoreCase("lakh") || numbersInWord.equalsIgnoreCase("crore")) {
                tempSum *= Number(numbersInWord);
                sum += tempSum;
                tempSum = 0;
            } else if (numbersInWord.equalsIgnoreCase("hundred")) {
                tempSum *= Number(numbersInWord);
            } else if (numbersInWord.equalsIgnoreCase("million")) {
                tempSum *= 1000000;
                sum += tempSum;
                tempSum = 0;
                indianSystem = 0;
            } else if (numbersInWord.equalsIgnoreCase("and")) {
                continue;
            } else {
                tempSum += Number(numbersInWord);
            }
        }
        sum += tempSum;
        System.out.println(formatNumber(sum, indianSystem));
    }
}
