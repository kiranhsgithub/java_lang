/**
 * 
 */
package com.americanexpress.kiran1;

import java.lang.reflect.Constructor;

/**
 * @author Kiran
 *
 */
public class Gsi extends GsiSuper {
	
	private static Gsi instance = new Gsi();
	private static boolean alreadyInstantiated;
	private Gsi()
	{
		super(8);
		System.out.println("Inside private constuctor");
		if(alreadyInstantiated){
			throw new UnsupportedOperationException("Trying to create duplicate instance");
		}
		alreadyInstantiated = true;
		
	}
	
	public static Gsi getInstance()
	{
		return instance;
	}

//	public String toString()
//	{
//		return "Gsi to String: " + super.toString();
//	}
	
	public Gsi clone() 
	{
		return this;
	}
	
	@Override
	public void someMethod()
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gsi gsi = Gsi.getInstance();
		Thread t = new Thread();
		t.yield();
		System.out.println(" gsi in main:" + gsi);
		
		Gsi gsi2 = gsi.clone();
		System.out.println(" gsi2 in main:" + gsi2);
		
		Class classDefinition;
		try {
			classDefinition = Class.forName("com.americanexpress.kiran1.Gsi");
			
			Gsi gsi3 = (Gsi) classDefinition.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
