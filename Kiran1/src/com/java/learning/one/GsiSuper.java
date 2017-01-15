/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 *
 */
public class GsiSuper implements Cloneable {

	private int number;
	
	protected GsiSuper(int i)
	{
		number = i;
		System.out.println("Inside protected GsiSuper");
	}
	
	private GsiSuper(GsiSuper g)
	{
		this.number = g.number;
	}
	public GsiSuper clone()
	{
		return new GsiSuper(this);
	}
	
	public void someMethod() throws IllegalAccessException
	{
		
	}
	
//	public String toString()
//	{
//		return "GsiSuper" + number;
//	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
