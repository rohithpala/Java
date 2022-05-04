import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

@FunctionalInterface
interface LoopingArrayList{
    void loopMe(ArrayList<Integer> a);
}

public class LoopingThroughArrayListUsingLambda {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int inp;
        while((inp = input.nextInt()) != -1) {
            arrayList.add(inp);
        }

        LoopingArrayList loopArrayList = (al) ->{
            for(Integer i : al) {
                System.out.println(i);
            }
        };
        loopArrayList.loopMe(arrayList);
    }
}
