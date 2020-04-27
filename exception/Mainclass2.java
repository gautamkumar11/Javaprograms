package exception;

public class Mainclass2 
{
	public static void display(int num)throws InterruptedException
	{
		System.out.println("display() starts...");
		Thread.sleep(num);//suggest
		System.out.println("display() ends...");
	}
	
	public static void main(String[] args) 
	{
      System.out.println("Program starts...");
      try
      {
        display(100);
      }
      catch(InterruptedException e)
      {
    	e.printStackTrace();
      }
      System.out.println("Program ends...");
	}
}
