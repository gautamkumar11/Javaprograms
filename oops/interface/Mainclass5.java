interface Run5
{
   public static void count() //static
   {
     System.out.println("count() of Run5");
   }

   public default void click() //non-static
   {
     System.out.println("click() of Run5");
   }
}

interface Run6
{
   public static void count() //static
   {
     System.out.println("count() of Run6");
   }

   public default void click() //non-static
   {
     System.out.println("click() of Run6");
   }
}


class Sample5 extends Object implements Run5,Run6
{
   @Override
   public void click() //non-static
   {
     Run5.super.click();
     Run6.super.click();
   }
}

class Mainclass5
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
    
    Run5.count();
    Run6.count();

    Sample5 ref5 = new Sample5();
  
    ref5.click();  
	  System.out.println("Program ends...");	
	}
}







