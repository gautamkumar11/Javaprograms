package threads;

class Sample 
{
	
}

class ThreadThree extends Sample implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("task three");
	}
}

public class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
        
		ThreadThree th3 = new ThreadThree();
		
		Thread t1 = new Thread(th3);
		t1.start();
		
		
		System.out.println("Main Ends...");
	}
}







