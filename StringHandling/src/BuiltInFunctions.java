public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("charAt():");
        System.out.println("abc".charAt(1) + "\n");    //b
        //System.out.println("abc".charAt(3)); //StringIndexOutOfBoundsException

        //void getChars(int sourceStart, int sourceEnd, char target[], int targetStart)
        String str = "Hi! I am RohithP";
        char[] buf = new char[5];
        str.getChars(9, 14, buf, 0);
        System.out.println(buf);
        System.out.println("Rohith".getBytes());    //Gives Byte Array
        System.out.println("hello".equals("hello")); //true
        System.out.println("hello".equalsIgnoreCase("HeLlO"));//true  //Returns Boolean: Checks Content ignoring case

        System.out.println("\nregionMatches():");
        System.out.println(str.regionMatches(9, "Rohith", 0, 6) + "\n");  //true

        String s1 = "Java".concat(" Program");
        String s2 = "Java Program";
        System.out.println(s1 == s2 + "\n");

        System.out.println("compareTo():");
        System.out.println("Hey".compareTo("Hoy")); // negative value
        System.out.println("Hoy".compareTo("Hey")); //positive value
        System.out.println("".compareTo("") + "\n");//0

        System.out.println("indexOf() and lastIndexOf():");
        System.out.println("abcd abc".indexOf("abc"));          //0
        System.out.println("abcd abc".lastIndexOf("abc") + "\n");  //5

        System.out.println("substring():");
        System.out.println("abcdefghi".substring(3) + "\n");   //defghi

        s1 += s2;   //Concatenates s2 to s1 and puts in s1
        System.out.println(s1 + "\n");  //Java ProgramJava Program

        System.out.println("replace():");
        System.out.println(s1.replace('a', 'b') + "\n");    //Jbvb ProgrbmJbvb Progrbm

        /*
public boolean regionMatches(boolean ignoreCase,
        int toffset,
        String other,
        int ooffset,
        int len)
Tests if two string regions are equal.
A substring of this String object is compared to a substring of the argument other. The result is true if these substrings represent character
sequences that are the same, ignoring case if and only if ignoreCase is true. The substring of this String object to be compared begins at index
toffset and has length len. The substring of other to be compared begins at index ooffset and has length len. The result is false if and only if
at least one of the following is true:
 */
        str = "I am Rohith";
        System.out.println(str.regionMatches(5, "Rohith", 0, 6));
//        System.out.println("trim():");
//        String s3 = s1.trim();
//        System.out.println(s3);
//        System.out.println(s1);
    }
}
