/**
 * 
 */
package edu.uc.msis16.gecasecomp;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 * @author hskir
 *
 */
public class MainProcess {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Google Drive\\GE_Case_Comp\\temp\\mydoc.pdf");
		//Creating PDF document object 
	      PDDocument document = PDDocument.load(file);
	      
	      PDPage my_page = document.getPage(0);      
	      //document.addPage(my_page);
	      PDPageContentStream contentStream = new PDPageContentStream(document, my_page);
	      contentStream.beginText(); 
	      
	      contentStream.setFont(PDType1Font.TIMES_ROMAN, 16);
	      contentStream.setLeading(14.5f);
	      
	      contentStream.newLineAtOffset(25, 500);
	      
	      
	      
	      String text1 = "This is an example of adding text to a page in the pdf document. we can" +
	    		   "add as many lines as we want like this using the showText() method of the" + 
	    		   "ContentStream class";
	      
	      String text2 = "This is an example of adding text to a page in the pdf document. we can" +
	    		   "add as many lines as we want like this using the showText() method of the" + 
	    		   "ContentStream class";
	      
	      contentStream.showText(text1); 
	      contentStream.newLine(); 
	      contentStream.showText(text2);
	      
	      
	         
	      
	      contentStream.endText();
	      
	      System.out.println("Content added");
	      
	      contentStream.close();
	      
	       
	      //Saving the document
	      document.save(new File("D:\\Google Drive\\GE_Case_Comp\\temp\\mydoc.pdf"));
	      
	      
	               
	      System.out.println("PDF created");
	      
	    		  
	      //Closing the document  
	      document.close();

	}

}
