package threads;

public class Mainclass3 
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts...");

		Runnable r1 = () -> 
		{
			for (int i = 1; i <= 3; i++) 
			{
				System.out.println("task one");
			}
		};

		Runnable r2 = () ->
		{
			for (int j = 1; j <= 3; j++) 
			{
				System.out.println("task two");
			}
		};

		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);

		th1.start();
		th2.start();

		System.out.println("Main Ends...");
	}
}
