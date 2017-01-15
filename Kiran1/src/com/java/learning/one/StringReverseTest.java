/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 */
public class StringReverseTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Runtime rt = Runtime.getRuntime();
		long memory1 = rt.freeMemory();
		long time1 = System.currentTimeMillis();
		for(int i=0;i < 50000 ; i++)
		{
			reverseStringUsingArray();
		}
		System.out.println(" Time taken using array " + (System.currentTimeMillis() - time1) + " memory:" + (memory1 - rt.freeMemory()) );
		System.out.println(" free memory 1 : " + rt.freeMemory());
		rt.gc();
		System.out.println(" free memory 2 : " + rt.freeMemory());
		Thread.sleep(5000);
		
		long time2 = System.currentTimeMillis();
		long memory2 = rt.freeMemory();
		for(int i=0;i < 50000 ; i++)
		{
			reverseStringUsingString();
		}
		System.out.println(" Time taken using String " + (System.currentTimeMillis() - time2) + " memory:" + (memory2 - rt.freeMemory()));
		System.out.println(" free memory 3 : " + rt.freeMemory());
		rt.gc();
		System.out.println(" free memory 4 : " + rt.freeMemory());
		Thread.sleep(5000);
		
		long time3 = System.currentTimeMillis();
		long memory3 = rt.freeMemory();
		for(int i=0;i < 50000 ; i++)
		{
			reverseStringUsingStringBuilder();
		}
		System.out.println(" Time taken using StringBuilder :" + (System.currentTimeMillis() - time3) + " memory:" + (memory3 - rt.freeMemory()));
		System.out.println(" free memory 5 : " + rt.freeMemory());
		rt.gc();
		System.out.println(" free memory 6 : " + rt.freeMemory());
		Thread.sleep(5000);
		
	}
	
	public static void reverseStringUsingArray()
	{
		String  a = "malayalam";
		char[] carray = new char[a.length()];
		for(int i=0;i<a.length();i++)
		{
			carray[a.length() -i - 1] = a.charAt(i);
		}
		String  reversed = new String(carray);
		if(a.equals(reversed))
		{
			//System.out.println("Palindrome " + reversed);
		}
		else
		{
			//System.out.println("Not a palindrome");
		}

	}
	
	public static void reverseStringUsingStringBuilder()
	{
		String  a = "malayalam";
		StringBuilder reversed1 = new StringBuilder(a.length());
		for(int i=0;i<a.length();i++)
		{
			reversed1.append(a.charAt(i));
		}
		
		if(a.equals(reversed1.toString()))
		{
			//System.out.println("Palindrome " + reversed1);
		}
		else
		{
			//System.out.println("Not a palindrome");
		}

	}
	
	public static void reverseStringUsingString()
	{
		String  a = "malayalam";
		String reversed1 ="";
		for(int i=0;i<a.length();i++)
		{
			reversed1 += a.charAt(a.length() -i -1);
		}
		
		if(a.equals(reversed1))
		{
			//System.out.println("Palindrome " + reversed1);
		}
		else
		{
			//System.out.println("Not a palindrome");
		}

	}

}
