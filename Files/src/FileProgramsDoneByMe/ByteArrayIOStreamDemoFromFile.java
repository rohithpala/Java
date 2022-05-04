package FileProgramsDoneByMe;

import java.io.*;

public class ByteArrayIOStreamDemoFromFile {
    public static void main(String[] args) throws IOException {
        byte[] byteArray = new byte[256];
        for (int i = 0; i < 256; i++) {
            byteArray[i] = (byte) i;
        }
        FileOutputStream f = new FileOutputStream("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\ByteArrayIOStream\\ASCII.txt");
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i;
        while((i = bais.read()) != -1)
            baos.write(i);
        baos.writeTo(f);
    }
}