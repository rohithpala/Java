package Week6_StringHandling_Synchronized_IPC_Deadlock.StringHandling;
public class Comparing_Replacing_Reversing {
    public static void main(String[] args) {
        char ch;
        boolean palindrome = true;
        String revString = "";
        String str = "Rohith";
        String str1 = new String("Rohith");
        if(str == str1){
            System.out.println("In \"==\" block");
        }else{
            System.out.println("Didn't go into \"==\" block");
        }
        if(str.equals(str1)){
            System.out.println("In equals() block");
        }else{
            System.out.println("Not Equal");
        }
        int len = str.length();
        for (int iter = 0; iter < len; iter++) {
            revString += str.charAt(len - iter - 1);
        }
        System.out.println("Reverse of " + str + " is " + revString);
    }
}
