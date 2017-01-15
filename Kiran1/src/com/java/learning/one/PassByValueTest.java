/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 */
public class PassByValueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PassByValueTest pvt = new PassByValueTest();
		System.out.println(" oBject in main " + pvt + " hashCode:" + Integer.toHexString(pvt.hashCode())  );
		valueMethod(pvt);

	}

	public static void valueMethod(PassByValueTest pvtParameter)
	{
		StringReverseTest svt  = new StringReverseTest();
		System.out.println(" oBject in method " + pvtParameter + " hashCode:" + Integer.toHexString(pvtParameter.hashCode()));
	}
}
