public class PascalPattern {

    public static void main(String[] args) {
        int rows = 6, top = 1;

        for(int i = rows-1; i >=0; i--) {
            for(int space = rows - i; space > 1 ; --space) {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    top = 1;
                else
                    top = top * (i - j + 1) / j;
                System.out.printf("%4d", top);
            }
            System.out.println();
        }
    }
}