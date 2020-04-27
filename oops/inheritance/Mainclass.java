class Superclass
{
	final  int v1 = 123;
	static String str = "hello";

	public void count()
	{
	  System.out.println("count() of Superclass");
	}
}

class Subclass extends Superclass
{
	double z1 = 3.47;

	public void display()
	{
	  System.out.println("display() of Subclass");
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       
       Superclass ref1 = new Superclass();
       System.out.println(ref1.v1);
       ref1.count();
       
       System.out.println("------------------------------");
       
       Subclass ref2 = new Subclass();
       System.out.println(ref2.z1);
       ref2.display();

       System.out.println(ref2.v1);
       ref2.count();

       System.out.println(ref2.str);

	   System.out.println("Program ends...");
	}
}






