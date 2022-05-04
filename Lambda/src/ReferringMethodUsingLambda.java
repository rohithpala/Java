@FunctionalInterface
interface SecondLambdaFunctionalInterface{
    void concatenate(String str1, String str2);
}

@FunctionalInterface
interface LambdaCharToIntConverter{
    int CharToInt(char s);
}

class Test{
    public static void concatenate1(String s, String s1) {
        System.out.println(s + " " + s1);
    }

    public static int CharToIntInFunction(char number){
        return (int)number;
    }
}

public class ReferringMethodUsingLambda {
    public static void main(String[] args) {
        SecondLambdaFunctionalInterface ref = Test::concatenate1;
        ref.concatenate("Pala", "Rohith");

        LambdaCharToIntConverter ref1 = Test::CharToIntInFunction;
        System.out.println(ref1.CharToInt('A'));
    }
}
