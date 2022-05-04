public class Immutability {
    public static void main(String[] args) {
        String str = "Rohith"; // Here only the reference of str is changed, but the literal "Rohith" is not changed in the string pool.
        String str1 = str; // str1 points to str i;e to literal "Rohith".
        str = "Pala";    // By using this command we are making str to point to literal "Pala", not changing "Rohith"
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);
    }
}
