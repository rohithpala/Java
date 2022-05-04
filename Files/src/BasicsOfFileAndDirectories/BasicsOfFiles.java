package BasicsOfFileAndDirectories;

import java.io.File;

public class BasicsOfFiles {
    public static void main(String[] args) {
        String dirname = "R:\\Java";
        File f1 = new File(dirname);
        File f2 = new File("R:\\Java\\Main.java");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        // File or Directory
        System.out.println("f1 " + (f1.isFile() ? "is" : "is not") + " a file");
        System.out.println("f1 " + (f1.isDirectory() ? "is" : "is not") + " a directory");
        System.out.println("f2 " + (f2.isFile() ? "is" : "is not") + " a file");
        System.out.println("f2 " + (f2.isDirectory() ? "is" : "is not") + " a directory");
        //Getting Paths
        System.out.println("f1's path: " + f1.getPath());   // Prints the path given
        System.out.println("f2's path: " + f2.getPath());
        //Getting Absolute Paths
        System.out.println("f1's absolute path: " + f1.getAbsolutePath());   // Prints the path from base
        System.out.println("f2's absolute path: " + f2.getAbsolutePath());
        if(f1.isDirectory()) {
            String[] s = f1.list();
            for (String value : s) {
                File f = new File(dirname + "\\" + value);
                if (f.isDirectory())
                    System.out.println("\"" + value + "\"" + " is a Directory");
                else
                    System.out.println("\"" + value + "\"" + " is a File");
                if(value.endsWith(".java"))
                    System.out.println(value);
            }
        }
    }
}
