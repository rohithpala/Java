package BasicsOfFileAndDirectories;

import java.io.File;
import java.io.IOException;

public class RenamingFile {
    public static void main(String[] args) throws IOException {
        File f = new File("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\BasicsOfFile\\oldname.txt");
        File f1 = new File("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\BasicsOfFile\\newname.txt");
//        File temp = new File("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\BasicsOfFile\\oldname.txt");
        System.out.println("File " + (f.createNewFile() ? "Created" : "Already Created"));
        System.out.println("File1 " + (f1.createNewFile() ? "Created" : "Already Created"));
        if(f.renameTo(f1))
            System.out.println("File Renamed Successfully");
        else
            System.out.println("Error occurred in naming file");

//        if(f1.renameTo(temp))
//            System.out.println("File1 Renamed Successfully");
//        else
//            System.out.println("Error occurred in renaming file1");
    }
}
