package Week7_Files;
import java.io.*;
public class ByteArrayIOStream {
    public static void main(String[] args) throws IOException {
        byte[] byteArray = {73, 32, 97, 109, 32, 82, 111, 104, 105, 116, 104};
        FileOutputStream f = new FileOutputStream("R:\\IO\\JavaByteArrayIOStreamSampleFile.txt");
        ByteArrayInputStream baIS = new ByteArrayInputStream(byteArray);
        ByteArrayOutputStream baOS = new ByteArrayOutputStream();
        baOS.write(byteArray);
        baOS.writeTo(f);
        for (int ch = 0; (ch = baIS.read()) != -1 ; ch++) {
            System.out.print((char) ch);
        }
    }
}
