interface Run
{
    int a1 = 198;
    public void count();
}

class Sample implements Run
{
   @Override
   public void count()
   {
   	 System.out.println("Overriding count()");
   }
}

class Mainclass
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
      System.out.println(Run.a1);

      Run r1;

      Sample s1 = new Sample();
      s1.count();      
      
	  System.out.println("Program ends...");	
	}
}


