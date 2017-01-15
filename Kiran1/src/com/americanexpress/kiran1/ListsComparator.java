/**
 * 
 */
package com.americanexpress.kiran1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Kiran
 *
 */
public class ListsComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<String> arList = new ArrayList<String>();
		
		List<String> lnkList = new LinkedList<String>();
		
		long time1 = System.currentTimeMillis();
		System.out.println("Time 1 : " + time1);
		
		for(int i=0;i< 10000;i++)
		{
			arList.add("Kiran " + i);
		}
		
		long time2 = System.currentTimeMillis();
		System.out.println("Time 2 : " + (time2 - time1));
		

		
		long time3 = System.currentTimeMillis();
		System.out.println("Time 3 : " + time3);
		
		for(int i=0;i< 10000;i++)
		{
			lnkList.add("Kiran " + i);
		}
		
		long time4 = System.currentTimeMillis();
		System.out.println("Time 4 : " +( time4 - time3));
		

		
		
		
		
		long time5 = System.currentTimeMillis();
		System.out.println("Time 5 : " + time5);
		
		for(int i=0;i< 10000;i++)
		{
			arList.get(i);
		}
		
		long time6 = System.currentTimeMillis();
		System.out.println("Time 6 : " + (time6 - time5));
		

		
		long time7 = System.currentTimeMillis();
		System.out.println("Time 7 : " + time7);
		
		for(int i=0;i< 10000;i++)
		{
			lnkList.get(i);
		}
		
		long time8 = System.currentTimeMillis();
		System.out.println("Time 8 : " +( time8 - time7));
		
		
		
		long time9 = System.currentTimeMillis();
		System.out.println("Time 9 : " + time9);
		
		for(int i=0;i< 10000;i++)
		{
			Random r = new Random();
			int rn = r.nextInt(10000);
			arList.add(10000/2-i+rn,"Hello" + i);
		}
		
		long time10 = System.currentTimeMillis();
		System.out.println("Time 10 : " + (time10 - time9));
		

		
		long time11 = System.currentTimeMillis();
		System.out.println("Time 11 : " + time11);
		
		for(int i=0;i< 10000;i++)
		{
			Random r = new Random();
			int rn = r.nextInt(10000);
			arList.add(10000/2-i+rn,"Hello" + i);
		}
		
		long time12 = System.currentTimeMillis();
		System.out.println("Time 12 : " +( time12 - time11));
		
		
	}

}
