package FileProgramsDoneByMe;

import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\BufferedIOStream\\BufferedInputStreamDemo.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\BufferedIOStream\\BufferedOutputStreamDemo.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i;
        while((i = bis.read()) != -1)
            bos.write(i);
        bos.flush();
        fis.close();
        fos.close();
    }
}
