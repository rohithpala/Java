import java.util.stream.IntStream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        int[] a = {2, 10, 5, 6, 3, 7, 11, 9, 1};
        // Printing the 4 smallest numbers
        System.out.println("Smallest distinct 4 numbers:");
        IntStream.of(a)
                .distinct()
                .sorted()
                .limit(4)
                .forEach(System.out::println);
        System.out.println("Sum: " + IntStream.of(a).sum());
        System.out.println("Count: " + IntStream.of(a).count());
        System.out.println("Average: " + IntStream.of(a).average());

        IntStream.rangeClosed(1, 5) // Includes 5
                .filter(num -> num%2 == 0)
                .map(num -> num*2)
                .forEach(System.out::println);
    }
}
