package Week7_Files;
import java.io.File;
public class FileOrDirectory {
    public static void main(String[] args) {
        File file1 = new File("R:\\0_Sem 3\\Notes\\OOP\\OOP Programs Done in Class");
        File file2 = new File("R:\\0_Sem 3\\Notes\\OOP\\OOP Programs Done in Class\\SingletonDemo.java");
        System.out.println("file1 exists: " + file1.exists());
        System.out.println("file1 is file: " + file1.isFile());
        System.out.println("file1 is directory: " + file1.isDirectory());
        System.out.println("file2 exists: " + file2.exists());
        System.out.println("file2 is file: " + file2.isFile());
        System.out.println("file2 is directory: " + file2.isDirectory());
    }
}
