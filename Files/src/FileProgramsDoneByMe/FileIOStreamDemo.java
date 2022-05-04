package FileProgramsDoneByMe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {
    public static void main(String[] args) throws IOException {
        String mainPath = "R:\\JavaFolders\\IO\\ProgramsDoneByMe\\FileIOStream";
        FileInputStream fis = new FileInputStream(mainPath + "\\FileIOStream(ReadFromMe).txt");
        FileOutputStream fos = new FileOutputStream(mainPath + "\\FileIOStream(WriteToMe).txt");
        int i;
        while((i = fis.read()) != -1){
            fos.write(i);
        }
    }
}
