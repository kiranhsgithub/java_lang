package edu.uc.msis16.gecasecomp;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.text.PDFTextStripper;

public class AddMultipleLines {
   public static void main(String args[]) throws IOException {

      //Loading an existing document
      File file = new File("D:\\Google Drive\\GE_Case_Comp\\temp\\mydoc.pdf");
      PDDocument doc = PDDocument.load(file);
       
      //Creating a PDF Document
      PDPage page = doc.getPage(0);  
       
      PDPageContentStream contentStream = new PDPageContentStream(doc, page); 
       
      //Begin the Content stream 
      contentStream.beginText(); 
       
      //Setting the font to the Content stream
      contentStream.setFont( PDType1Font.TIMES_ROMAN, 16 );
       
      //Setting the leading
      contentStream.setLeading(14.5f);

      //Setting the position for the line
      contentStream.newLineAtOffset(25, 725);

      String text1 = "This is an example of adding text to a page in the pdf document. we can" +
   		   "add as many lines as we want like this using the showText() method of the" + 
   		   "ContentStream class";
     
     String text2 = "This is an example of adding text to a page in the pdf document. we can" +
   		   "add as many lines as we want like this using the showText() method of the" + 
   		   "ContentStream class";

      //Adding text in the form of string
      contentStream.showText(text1);
      contentStream.newLine();
      contentStream.showText(text2);
      //Ending the content stream
      contentStream.endText();

      System.out.println("Text added");
      
      PDImageXObject pdImage = PDImageXObject.createFromFile("C:/Users/hskir/OneDrive/Pictures/linkedin bakground/eclipse.jpg", doc);
      
      contentStream.drawImage(pdImage, 70, 250);

      System.out.println("Image added");
      //Closing the content stream
      contentStream.close();

      //Saving the document
      doc.save(new File("D:\\Google Drive\\GE_Case_Comp\\temp\\mydoc.pdf"));
      
      PDFTextStripper pdfStripper = new PDFTextStripper();
      String text = pdfStripper.getText(doc);
      System.out.println(text);
      
            
      //Closing the document
      doc.close();
   }
}