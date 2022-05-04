package FileProgramsDoneByMe;

import java.io.*;

public class BufferedReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\BufferedReaderWriter\\BufferedReaderDemo.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\BufferedReaderWriter\\BufferedWriterDemo.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String str;
        while ((str = br.readLine()) != null)
            bw.write(str);
        bw.flush();
        fr.close();
        fw.close();
    }
}
