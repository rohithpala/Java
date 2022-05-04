import java.util.Scanner;

public class PrimeSum {
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            int sqroot = (int) Math.sqrt(num);
            for (int iter = 2; iter <= sqroot; iter++) {
                if (isPrime(iter) && num % iter == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter Size: ");
        Scanner input = new Scanner(System.in);
        int iter, size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (iter = 0; iter < size; iter++) {
            arr[iter] = input.nextInt();
        }
        for (iter = 0; iter < arr.length; iter++) {
            if (isPrime(arr[iter])) {
                sum = sum + arr[iter];
            }
        }
        System.out.println("Sum of Primes = " + sum);
    }
}
