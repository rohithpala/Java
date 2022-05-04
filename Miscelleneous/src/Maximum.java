public class Maximum {
    public static void main(String[] maximum) {
        int max = Integer.parseInt(maximum[0]);
        System.out.print("Passed Arguments: ");
        for (int iter = 0; iter < maximum.length; iter++) {
            System.out.print(maximum[iter] + " ");
            if (Integer.parseInt(maximum[iter]) > max)
                max = Integer.parseInt(maximum[iter]);
        }
        System.out.println("\n" + max);
    }
}