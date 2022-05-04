package FileProgramsDoneByMe;

import java.io.*;

public class ByteArrayOutputStreamDemoFromString {
    public static void main(String[] args) throws IOException {
        String thisIsConvertedToBytes = "This Content is written from ByteArrayInputStreamDemoFromString.java program to ByteArrayIOStreamDemo.txt";
        byte[] b;
        b = thisIsConvertedToBytes.getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream fos = new FileOutputStream("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\ByteArrayIOStream\\ByteArrayOutputStreamDemo.txt");
        for (byte value : b) {
            baos.write(value);
        }
        baos.writeTo(fos);
    }
}
