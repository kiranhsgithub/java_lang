/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 */
public class OverrideTest {

	public  <T extends Integer> int getNumber()
	{
		return 2;
	}
	
	public  <T extends Long> long getNumber()
	{
		return this.<Integer>getNumber();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OverrideTest o = new OverrideTest();
		System.out.println(" get()" + o.<Integer>getNumber() );
	}

}
