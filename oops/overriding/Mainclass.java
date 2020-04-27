class Superclass 
{
	public void count(int n)
	{
      System.out.println("count() of Superclass");

      for(int i=1; i<=n; i++)
      {
      	System.out.println(i);
      }
	}
}

class Subclass extends Superclass
{
	@Override
	public void count(int n)
	{
      System.out.println("count() of Subclass");

      for(int i=n; i>=1; i--)
      {
      	System.out.println(i);
      }
	}
}
//9686114422
class Mainclass extends Object
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");

	   Superclass ref1 = new Superclass();
	   ref1.count(5);

	   Subclass ref2 = new Subclass();
	   ref2.count(5);
       
	   System.out.println("Program ends...");
	}
}






