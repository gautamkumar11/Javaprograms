interface Run4
{
   public void count();

   public static void display() //static
   {
     System.out.println("display() of Run4");
   }

   public default void view() //non-static
   {
     System.out.println("view() of Run4");
   }

}

class Sample4 implements Run4
{
  @Override
  public void count()
  {
    System.out.println("Overriding count()");
  }

}


class Mainclass4
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
  
    Sample4 s1 = new Sample4();
    s1.count();

    Run4.display();
    s1.view();
      
	  System.out.println("Program ends...");	
	}
}




