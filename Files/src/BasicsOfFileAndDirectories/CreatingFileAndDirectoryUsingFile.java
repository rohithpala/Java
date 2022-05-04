package BasicsOfFileAndDirectories;

import java.io.File;
import java.io.IOException;

public class CreatingFileAndDirectoryUsingFile {
    public static void main(String[] args) throws IOException {
        // Creating File
        File f = new File("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\FileAndDirectories\\IamCreatedByProgramUsingFile.txt");
        System.out.println("File" + (f.exists() ? " " : " doesn't ") + "exist");
        System.out.println("File " + (f.createNewFile() ? "created successfully" : "not created"));
        System.out.println("File" + (f.exists() ? " " : " doesn't ") + "exist");
        //Creating Directory
        File dir = new File("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\FileAndDirectories\\IamCreatedByProgramUsingFile");
        System.out.println("Directory" + (dir.exists() ? " " : " doesn't ") + "exist");
        System.out.println("Directory " + (dir.mkdir() ? "created successfully" : "not created"));
        System.out.println("Directory" + (dir.exists() ? " " : " doesn't ") + "exist");

    }
}
