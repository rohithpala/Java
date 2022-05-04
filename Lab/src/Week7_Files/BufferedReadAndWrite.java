package Week7_Files;
import java.io.*;
public class BufferedReadAndWrite {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("R:\\IO\\BufferedReader.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("R:\\IO\\BufferedWriter.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        int i;
        while((i = br.read()) != -1)
            bw.write(i);
        br.close();
        bw.close();
    }
}
