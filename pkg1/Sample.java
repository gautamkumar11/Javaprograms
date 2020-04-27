package pkg1;

public class Sample 
{
   public    int    v1 = 12345;
   protected double v2 = 2.45;
             long   v3 = 122333222111l;
   private   String v4 = "hello";
   
   public void test1()
   {
	  System.out.println("public-test1() of Sample class"); 
   }
   
   protected void test2()
   {
	  System.out.println("protected-test2() of Sample class"); 
   }
   
   void test3()
   {
	  System.out.println("pkg-level-test3() of Sample class"); 
   }
   
   private void test4()
   {
	  System.out.println("private-test4() of Sample class"); 
   }
   
   public static void main(String[] args) 
   {
	  Sample s1 = new Sample();
	  System.out.println(s1.v4);
	  s1.test4();
   }
}



