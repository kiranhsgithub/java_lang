/**
 * 
 */
package com.americanexpress.kiran1;

/**
 * @author Kiran
 *
 */
public class StringReverseTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String  a = "malayalam";
		StringBuilder reversed1 = new StringBuilder(a.length());
		for(int i=0;i<a.length();i++)
		{
			reversed1.append(a.charAt(i));
		}
		
		if(a.equals(reversed1.toString()))
		{
			System.out.println("Palindrome " + reversed1);
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
