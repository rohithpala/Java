package ArrayList;

import java.util.ArrayList;

public class ArrayListAndMethods {
    public static void main(String[] args) {
        ArrayList[] arr = new ArrayList[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (ArrayList) i + 1;
        }
        System.out.println(arr);
    }
}
