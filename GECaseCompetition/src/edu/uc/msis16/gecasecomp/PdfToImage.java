/**
 * 
 */
package edu.uc.msis16.gecasecomp;

/**
 * @author hskir
 *
 */
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
public class PdfToImage {

   public static void main(String args[]) throws Exception {

      //Loading an existing PDF document
      File file = new File("D:/Google Drive/GE_Case_Comp/SV Report 906370.pdf");
      PDDocument document = PDDocument.load(file);
       
      //Instantiating the PDFRenderer class
      PDFRenderer renderer = new PDFRenderer(document);

      //Rendering an image from the PDF document
      BufferedImage image = renderer.renderImage(0);

      //Writing the image to a file
      ImageIO.write(image, "JPEG", new File("D:/Google Drive/GE_Case_Comp/myimage.jpg"));
       
      System.out.println("Image created");
       
      //Closing the document
      document.close();

   }
}