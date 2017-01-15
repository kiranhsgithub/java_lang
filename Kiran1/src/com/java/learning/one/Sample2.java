/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 */
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				
		System.gc();
		
		Runtime r = Runtime.getRuntime();
		r.gc();
		
		System.out.println(" Free memory 1     " + r.freeMemory());
		
		String[] names = new String[6];
		for(int i=0;i< 10000;i++)
		{
			Sample1 s = new Sample1();
			names[0] = "Kiran" + i + s;
		}
		
		System.out.println(" Free memory 2     " + r.freeMemory());
		
		System.gc();
		
		
		System.out.println(" Free memory 3     " + r.freeMemory());
//		
//		String[] sortedNames = new String[names.length];
//		//create new array of same size ;
//		for(int i=0;i< names.length;i++)
//		{
//			int indexOfThis = getIndexofLargest(i +1);
//			sortedNames[i] = names[indexOfThis];
//		}
		
		System.out.println("sortedNames");

	}

	private static int getIndexofLargest(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
