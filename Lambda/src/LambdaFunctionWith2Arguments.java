import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@FunctionalInterface
interface LambdaWith2Arguments {
    String printName(String name, String surname);
}

public class LambdaFunctionWith2Arguments {
    public static void main(String[] args) throws IOException {
        LambdaWith2Arguments ref = (name, surname) -> {
            return (name + " " + surname);
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your First name: ");
        String surname = br.readLine();
        System.out.print("Enter Your Second name: ");
        String name = br.readLine();
        System.out.println("Your Full Name: " + ref.printName(surname, name));
    }
}
