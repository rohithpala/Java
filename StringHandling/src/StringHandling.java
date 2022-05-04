public class StringHandling {
    static void stringComparing(String str, String str1) {
        if (str == str1)    // '==' compares the references not values
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void main(String[] args) {
        //Strings: String is by default a class also can behave as it's a variable
        // Literals get created in String Pool. String Objeects get created in Heap
        String str = "Rohith"; // Here Rohith is known as literal
        String str1 = new String("Rohith"); // This is an Object so str and str1 are not equal
        String str2 = "Java"; // Java Intelligently creates only one "Java" and makes str and str2 to point to it.
        stringComparing(str, str1);
        String str3 = str + " Pala";
        System.out.println(str);
        System.out.println(str3);

        //IMMUTABILITY: Cannot be changed
        str = "Pala"; // Here str reference is changed from "Rohith" to "Pala" and the literal "Rohith" will be present in String Pool forever
        System.out.println(str);

        //String Buffer: MUTABLE, THREAD SAFE
        StringBuffer newStr = new StringBuffer("Java");
        newStr.append(" Programming");
        System.out.println(newStr);

        //String Builder: MUTABLE, THREAD UNSAFE

        //Talking Abt Thread Safe and Unsafe
        //Thread Safe:
        StringBuffer strThread = new StringBuffer("Java");
        Thread t = new Thread() {
            public void run() {
                System.out.println(strThread);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                }
                strThread.append(" Programming");
                System.out.println(strThread);
            }
        };
        t.start();
        Thread t1 = new Thread() {
            public void run() {
                System.out.println(strThread);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException exception) {
                }
                strThread.append(" by");
                System.out.println(strThread);
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                System.out.println(strThread);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                }
                strThread.append(" Rohith");
                System.out.println(strThread);
            }
        };
        t2.start();
        Thread t3 = new Thread() {
            public void run() {
                System.out.println(strThread);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                }
                strThread.append(" Pala");
                System.out.println(strThread);
            }
        };
        t3.start();
    }
}