import java.util.regex.*;
/*
regex is a package available in (util) which ha only 3 classes namely Pattern, Matcher, PatternSyntaxException
Metacharacters Supported : <([{\^-=$!|]})?*+.>

1)	* : Match zero or more characters.
2)	? : Match exactly one occurrence of any character.
3)	$ : Match the end of the string. This is useful in or expressions.
4)	[abc] : Match one occurrence of the characters a, b, or c. Within these expressions, the only character that needs to be treated as a special character is ]; all others are not special.
5)	[a-z] : Match one occurrence of a character between a and z.
6)	[^az] : Match any character except a or z.

*/
public class RegEx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Java \\d+");
        Matcher m = p.matcher("Java 108");
        System.out.println(m.find());       // find() is a methods that returns true if the pattern is found else false
        System.out.println(m.matches());    // matches() is a methods that returns true if the pattern is found else false
        // find() returns boolean and location. matches() only gives boolean
        // find() checks also for subsequences i;e if the pattern is present in the input it return true
        System.out.println();
        if(p.matcher("Java 10 Java 20").find())
            System.out.println("Found a Subsequence");
        else
            System.out.println("Not Found");
        System.out.println();
        m = p.matcher("Java 10 Java 20");
        while(m.find()) {
            System.out.println("Subsequence found at " + m.start());
        }
        System.out.println();
    }
}
