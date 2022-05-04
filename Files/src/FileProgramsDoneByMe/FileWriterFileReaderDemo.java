package FileProgramsDoneByMe;

import java.io.*;

public class FileWriterFileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\FileWriterFileReader\\FileWriterDemo.txt");
        FileReader fr = new FileReader("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\FileWriterFileReader\\FileReader(ReadFromMe).txt");
        int readFromfr;
        while((readFromfr = fr.read()) != -1){
            fw.write(readFromfr);
        }
        fw.flush();
    }
}
