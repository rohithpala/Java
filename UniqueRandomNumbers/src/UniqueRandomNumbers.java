import java.util.ArrayList;
import java.util.Collections;

public class UniqueRandomNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        for (i = 1; i < 101; i++)
            list.add(i);
        Collections.shuffle(list);
        for (i = 0; i < 100; i++) {
            if (i % 10 == 0)
                System.out.println();
            System.out.print(list.get(i) + " ");
        }
    }
}
