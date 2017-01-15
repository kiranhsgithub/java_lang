/**
 * 
 */
package com.java.learning.one;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Kiran
 *
 */
public class TaskExecutor implements Executor{

	Thread t;
	
	@Override
	public void execute(Runnable command)
	{
		ExecutorService exs = Executors.newSingleThreadExecutor();
		exs.execute(command);
		
		
	}
}
