package exception;

public class Mainclass3 
{
	public static void count(int v1)
	{
		if(v1 >=1 && v1 <=5)
		{
		  System.out.println("valid input");	
		}
		else
		{
		  IllegalArgumentException ie = new IllegalArgumentException();
		  throw ie;
		}
	}
	public static void main(String[] args) 
	{
      count(50);
	}
}



