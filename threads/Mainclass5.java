package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Mainclass5 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		
		Runnable r1 = () -> 
		{
		   System.out.println("task executed");  
		};
		
		ExecutorService ref = Executors.newCachedThreadPool();
		
		for(int i=1; i<=5; i++)
		{
			ref.submit(r1);	
		}
		
		ref.shutdown();
	
		System.out.println("Main Ends...");
	}
}




