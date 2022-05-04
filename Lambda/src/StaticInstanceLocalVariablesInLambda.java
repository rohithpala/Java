@FunctionalInterface
interface FirstLambdaFunctionalInterface {
    void myFunction(String name);
}

public class StaticInstanceLocalVariablesInLambda {
    static String str2 = "Static String";

    static FirstLambdaFunctionalInterface ref1 = (str1) -> {
        String str3 = "Local String";
        System.out.println(str1 + " " + str2 + " " + str3);
    };
    public static void main(String[] args) {
        String str1 = "Instance Variable";
        FirstLambdaFunctionalInterface ref = (name) -> System.out.println("Hi There " + name);
        ref.myFunction("Rohith");
        ref1.myFunction(str1);
    }
}
