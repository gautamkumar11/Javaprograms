package stringbuffer;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
      StringBuilder sb1 = new StringBuilder("hello");
      StringBuilder sb2 = new StringBuilder("hello");
      
      System.out.println(sb1.hashCode());
      System.out.println(sb2.hashCode());
      
      System.out.println(sb1.toString());
      System.out.println(sb2);
      
      System.out.println(sb1.equals(sb2));
    }
}
