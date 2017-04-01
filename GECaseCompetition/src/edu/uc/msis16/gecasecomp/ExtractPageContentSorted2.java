/**
 * 
 */
package edu.uc.msis16.gecasecomp;

/**
 * @author hskir
 *
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
 
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
 
public class ExtractPageContentSorted2 {
 
    /** The original PDF that will be parsed. */
    public static final String PREFACE = "D:/Google Drive/GE_Case_Comp/SV Report 906370.pdf";
    /** The resulting text file. */
    public static final String RESULT = "D:/Google Drive/GE_Case_Comp/SV Report 906370.txt";
 
    /**
     * Parses a specific area of a PDF to a plain text file.
     * @param pdf the original PDF
     * @param txt the resulting text
     * @throws IOException
     */
    public void parsePdf(String pdf, String txt) throws IOException {
        PdfReader reader = new PdfReader(pdf);
        PrintWriter out = new PrintWriter(new FileOutputStream(txt));
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            out.println(PdfTextExtractor.getTextFromPage(reader, i));
        }
        out.flush();
        out.close();
        reader.close();
    }
 
    /**
     * Main method.
     * @param    args    no arguments needed
     * @throws DocumentException 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, DocumentException {
        new ExtractPageContentSorted2().parsePdf(PREFACE, RESULT);
    }
}
