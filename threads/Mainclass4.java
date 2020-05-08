package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class App
{
	public void login()
	{
		System.out.println("login() executed");
	}
}

public class Mainclass4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		App a1 = new App();
		
		Runnable r1 = () -> 
		{
			a1.login();
		};
		
		ExecutorService ref = Executors.newFixedThreadPool(3);
		
        
		for(int i=1; i<=5; i++)
		{
			ref.submit(r1);	
		}
		
		ref.shutdown();
	
		System.out.println("Main Ends...");
	}
}




