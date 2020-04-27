package exception;

public class Mainclass 
{
	public static void test(int num)//called
	{
	  System.out.println("test() starts...");
	 
	   int res = 50 / num; //50 / 0
	   System.out.println("res = "+res);
	    
	  System.out.println("hello world");
	  
	  System.out.println("test() ends...");
	}
	
	public static void main(String[] args)//calling 
	{
      System.out.println("main() starts...");
      
      try
      {
       test(0);
      }
      catch(ArithmeticException ae)
      {
    	 System.out.println("caught ArithmeticException");
      }
      
      System.out.println("main() ends...");
	}
}



