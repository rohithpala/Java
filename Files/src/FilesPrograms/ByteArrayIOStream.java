package FilesPrograms;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayIOStream {
    public static void main(String[] args) throws IOException {
        byte[] byteArray = {73, 32, 97, 109, 32, 82, 111, 104, 105, 116, 104};
        FileOutputStream f = new FileOutputStream("R:\\JavaFolders\\IO\\JavaByteArrayIOStreamSampleFile.txt");
        ByteArrayInputStream baIS = new ByteArrayInputStream(byteArray);
        ByteArrayOutputStream baOS = new ByteArrayOutputStream();
        baOS.write(byteArray);
        baOS.writeTo(f);
        int ch;
        while ((ch = baIS.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
