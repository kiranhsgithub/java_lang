/**
 * 
 */
package com.americanexpress.kiran1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Account 
{

	Integer number;
	public Account(Integer number)
	{
		this.number = number;
	}
	
	public String toString()
	{
		return "Account : " + number;
	}
	
	@Override
	public boolean equals(Object o)
	{
		return (this.number.equals(((Account)o).number));
	}
	
	@Override
	public int hashCode()
	{
		//return 12;
		//System.out.println("super().hashCode()" + super.hashCode());
		return number.hashCode();
		
	} 
	
	public static void printLong(Long l)
	{
		System.out.println("Long" + l);
	}
	
	public static void printInt(int i)
	{
		System.out.println("int i=" + i);
	}
	
	public static void printPrimitiveLong(long l)
	{
		System.out.println("long primitive" );
	}

	public static void printInteger(Integer i)
	{
		System.out.println("Integer" );
	}
	
	public static void printPrimitiveDouble(double d)
	{
		System.out.println("double ");
	}
	
	public static void printFloat(float f)
	{
		
	}
	
	
	public static void main(String[] args)
	{
		Account a1 = new Account(8);
		Account a2 = new Account(9);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("cond: " + (a1 == a2 ) + a1.equals(a2) + a2.hashCode());
		
		List<Account> list = new ArrayList<Account>();
		list.add(a1);
		list.add(a2);
		list.add(a1);
//		list.add(a1);
		
		Set<Account> set = new HashSet<Account>(list);
		Map<Account,String> map = new HashMap<Account,String>();
		
		map.put(a1,"a1");
		map.put(a2,"a2");
		System.out.println("Original List" + list);
		System.out.println("Original set" + set);
		System.out.println("Original map" + map);
		
		
		
		a1.number = 90;
		System.out.println("Modified List" + list);
		System.out.println("Modified set" + set);
		System.out.println("Modified map" + map);
		
		System.out.println(" boolean " + a1.equals(new Account(90)));
		
		System.out.println("map key set" + map.keySet());
		System.out.println("map entry set" + map); 
	
		list.remove(new Account(8));
		System.out.println(" list 1" + list);
		list.remove(new Account(90));
		System.out.println(" list 2" + list);
		
		set.remove(new Account(90));
		System.out.println(" set 1: " + set + set.contains(new Account(90)));
		set.remove(new Account(8));
		System.out.println(" set 2: " + set + set.contains(new Account(8)) );
		set.remove(a1);
		System.out.println(" set 3: " + set + set.contains(a1) );
		map.remove(new Account(90));
		System.out.println(" map 1: " + map + map.containsKey(new Account(90)));
		map.remove(a1);
		System.out.println(" map 2: " + map + map.containsKey(a1));
		map.remove(new Account(8));
		System.out.println(" map 3: " + map + map.containsKey(new Account(8)));		
		
		list.remove(a1);
		set.remove(a1);
		map.remove(a1);
		System.out.println(list);
		System.out.println("Modified List " + list.remove(new Account(90))+ " " +  list +  list.remove(a1) + list);
		System.out.println("Modified set " + set.remove(new Account(8)) + " " + set + set.remove(a2) +set);
		System.out.println("Modified map " + map.get(new Account(8)) + " " + map.remove(new Account(8))+ " " + map + map.remove(a1) + map);
		
		
		
//		printLong(new Integer(4));
//		printLong(4);
//		printInt(new Long(4));
		
//		
//		printInt((int)3l);
//		
//		printPrimitiveLong(new Integer(4));
//		printPrimitiveLong(4l);
//		printPrimitiveLong(new Long(4));
//		printPrimitiveLong(8);
//		printPrimitiveLong(8);
//		
//		printPrimitiveDouble(new Integer(4));
//		printPrimitiveDouble(4l);
//		printPrimitiveDouble(new Long(4));
//		printPrimitiveDouble(8.4f);
//		printPrimitiveDouble(8);
//		printPrimitiveDouble(8.4);
//		printPrimitiveDouble(new Double(3));
//		printPrimitiveDouble('c');
//		short var = 3;
//		printPrimitiveDouble((double)var); 
		
//		
//		printInteger(new Long(4));
//		printInteger();
		
		
		
	}
}