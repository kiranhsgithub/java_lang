/**
 * 
 */
package edu.uc.msis16.gecasecomp;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 * @author hskir
 *
 */
public class TextExtractByArea {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		PDDocument document = null;
		try
		{
		    document = PDDocument.load(new File("D:/Google Drive/GE_Case_Comp/SV Report 906370.pdf"));
		    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		    stripper.setSortByPosition( true );
		    Rectangle rect = new Rectangle( 4, 130, 600, 600);
		    stripper.addRegion( "class1", rect );
		    
		    
		    for (int i = 0; i < document.getNumberOfPages(); i++) {
		    	PrintWriter out = new PrintWriter(new FileOutputStream("D:/Google Drive/GE_Case_Comp/text/SV Report 906370 - page " + i + ".txt"));
		    	try {
		    		PDPage firstPage = document.getPage(i);
				    stripper.extractRegions( firstPage );
				    String text = stripper.getTextForRegion("class1");
				    if(text != null && text.trim().length() > 0) {
			            out.println(text);	
				    }
		    	} catch(Exception e) {
		    		System.out.println("Error Reading page : " + i + e.getMessage());
		    	} finally {
		    		out.close();
		    	}		    	
	        }
		}
		finally
		{
		    if( document != null )
		    {
		        document.close();
		    }
		}
	}
}
