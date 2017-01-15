/**
 * 
 */
package com.java.learning.one;

import java.io.IOException;

/**
 * @author Kiran
 *
 */
public class OverrideExceptionTest {

	class SuperClass
	{
		protected void someMethod()  throws RuntimeException
		{
			
		}
	}
	
	class SubClass extends SuperClass
	{
		public void someMethod() throws NullPointerException
		{
			
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
