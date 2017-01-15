/**
 * 
 */
package com.americanexpress.kiran1;

/**
 * @author Kiran
 *
 */
public class StringReverseTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String  a = "malayalam";
		String reversed1 ="";
		for(int i=0;i<a.length();i++)
		{
			reversed1 += a.charAt(a.length() -i -1);
		}
		
		if(a.equals(reversed1))
		{
			System.out.println("Palindrome " + reversed1);
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
