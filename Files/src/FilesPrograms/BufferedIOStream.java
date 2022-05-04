package FilesPrograms;
import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fi = new FileInputStream(new File("R:\\JavaFolders\\IO\\BufferedIOStreamInputFile.txt"));
        BufferedInputStream fibi = new BufferedInputStream(fi);
        FileOutputStream fo = new FileOutputStream(new File("R:\\JavaFolders\\IO\\BufferedIOStreamOutputFile.txt"));
        BufferedOutputStream fobo = new BufferedOutputStream(fo);
        int i;
        while((i = fibi.read()) != -1)
            fobo.write(i);
        fibi.close();
        fobo.close();
    }
}
