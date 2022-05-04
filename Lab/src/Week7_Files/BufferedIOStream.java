package Week7_Files;
import java.io.*;
public class BufferedIOStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fi = new FileInputStream("R:\\IO\\BufferedIOStreamInputFile.txt");
        BufferedInputStream fibi = new BufferedInputStream(fi);
        FileOutputStream fo = new FileOutputStream("R:\\IO\\BufferedIOStreamOutputFile.txt");
        BufferedOutputStream fobo = new BufferedOutputStream(fo);
        int i;
        while((i = fibi.read()) != -1)
            fobo.write(i);
        fibi.close();
        fobo.close();
    }
}
