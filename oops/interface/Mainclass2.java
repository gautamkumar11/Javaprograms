interface Run1
{
   public void view();
}

interface Run2 extends Run1 
{
   public void count();
}

class Demo implements Run2
{
   @Override
   public void count()
   {
     System.out.println("Overriding count()");
   }

   @Override
   public void view()
   {
     System.out.println("Overriding view()");
   }
}

class Mainclass2
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
     
    Demo d1 = new Demo();
    d1.count();
    d1.view();    
      
	  System.out.println("Program ends...");	
	}
}




