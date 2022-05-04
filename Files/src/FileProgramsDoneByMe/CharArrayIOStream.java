package FileProgramsDoneByMe;

import java.io.*;

public class CharArrayIOStream {
    public static void main(String[] args) throws IOException {
        String str = "This Content is written from CharArrayIOStream Program to CharArrayDemo.txt file";
        char[] charArray = new char[str.length()];
        str.getChars(0, str.length(), charArray, 0);
        FileWriter f = new FileWriter("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\CharArrayDemo\\CharArrayDemo.txt");
//        CharArrayReader car = new CharArrayReader(charArray);
        CharArrayWriter caw = new CharArrayWriter();
//        int i;
//        while((i = car.read()) != -1) {
//            caw.write(i);
//        }
        caw.writeTo(f);
        caw.write(charArray);
    }
}
