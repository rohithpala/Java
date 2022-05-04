package Week7_Files;
import java.io.*;
public class DataIOStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("R:\\IO\\DataIOStreamInputFile.txt");
        FileOutputStream fo = new FileOutputStream("R:\\IO\\DataIOStreamOutputFile.txt");
        DataInputStream dis = new DataInputStream(fi);
        DataOutputStream dos = new DataOutputStream(fo);
        byte[] byteArray = new byte[5];
        dis.read(byteArray);
        dis.close();
        byte temp;
        for(int i = 0 ; i < 5 ; i++) {
            for(int j = i + 1 ; j < 5 ; j++) {
                if(byteArray[i]>byteArray[j]) {
                    temp = byteArray[i];
                    byteArray[i] = byteArray[j];
                    byteArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++)
            dos.write(byteArray[i]);
        dos.close();
    }
}
