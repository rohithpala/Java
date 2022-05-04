import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTokenizerProgram {
    static String in = "title=Java: The Complete Reference;" +
            "author=Schildt;" +
            "publisher=Osborne/McGraw-Hill;" +
            "copyright=2014";
    public static void main(String[] args) throws IOException {
//        StringTokenizer st = new StringTokenizer(in, "=;");
//        while (st.hasMoreTokens()){
//            String key = st.nextToken();
//            String value = st.nextToken();
//            System.out.println(key + "\t" + value);
//            /*
//            title	Java: The Complete Reference
//            author	Schildt
//            publisher	Osborne/McGraw-Hill
//            copyright	2014
//            */
//        }

        //Using Files
        FileWriter fw = new FileWriter("R:\\JavaFolders\\IO\\StringTokenizerFile.txt");
        fw.write(in);
        FileReader fr = new FileReader("R:\\JavaFolders\\IO\\StringTokenizerFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String str = "";
        StringBuilder lineFromFile = new StringBuilder();
        while((str = br.readLine()) != null)
            lineFromFile.append(str);
        StringTokenizer st1 = new StringTokenizer(lineFromFile.toString(), "=;");
        while (st1.hasMoreTokens()){
            String key = st1.nextToken();
            String value = st1.nextToken();
            System.out.println(key + "\t" + value);
            /*
            title	Java: The Complete Reference
            author	Schildt
            publisher	Osborne/McGraw-Hill
            copyright	2014
            */
        }
        fw.close();
        fr.close();
    }
}
