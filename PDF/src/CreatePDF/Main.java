package CreatePDF;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class CreatingEmptyPdf {
    public static void main(String args[]) throws IOException {
        PDDocument document = new PDDocument();
        document.addPage(new PDPage());
        document.save("C:/pdfBox/BlankPdf.pdf");

        System.out.println("PDF created");
        document.close();
    }
}
