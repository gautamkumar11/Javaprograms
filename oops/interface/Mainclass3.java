interface Run1
{
   public void test();
}

interface Run2
{
   public void click();
   public void test();
}

class Demo3 extends Object implements Run1,Run2
{
   @Override
   public void test()
   {
     System.out.println("Overriding test()");
   }

   @Override
   public void click()
   {
     System.out.println("Overriding click()");
   }
}

class Mainclass3
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
    

    Demo3 ref =  new Demo3();
    ref.test();
   
      
	  System.out.println("Program ends...");	
	}
}




