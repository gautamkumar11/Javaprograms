package wrapper;

public class Mainclass2 
{
    public static void test(Object obj)//Object obj = "hello";
                                      //Object obj = 123;
    {
      System.out.println(obj.toString());	
    }
  
	public static void main(String[] args) 
	{
      System.out.println("Program starts...");
      
      Integer v1 = 123;
      test(v1);
      
      Double d1 = 2.45;
      test(d1);
      
      String s1 = "hello";
      test(s1);
      
      StringBuffer s2 = new StringBuffer("hello");
      test(s2);
      
      Object obj1 = 100; //Object obj1 = new Integer(100);
      System.out.println(obj1);
      
      System.out.println("Program ends...");
	}

}





