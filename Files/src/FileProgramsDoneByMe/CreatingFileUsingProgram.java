package FileProgramsDoneByMe;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFileUsingProgram {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("R:\\JavaFolders\\CreatedByProgram.txt");
        fos.write(1);
        fos.close();
    }
}
