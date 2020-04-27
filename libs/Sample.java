package libs;

public class Sample 
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
	  
	  Object obj1 = new Object();
	  Object obj2 = new Object();
	  
	  int h1 = obj1.hashCode();
	  System.out.println("h1 = "+h1);
	  
	  int h2 = obj2.hashCode();
	  System.out.println("h2 = "+h2);
	  
	  String str =  obj1.toString();
	  System.out.println(str);
	  
	  boolean b1 = obj1.equals(obj2);
	  System.out.println("b1 = "+b1);
	  
	  System.out.println("Program ends...");
	}
}




