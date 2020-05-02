class Superclass
{
	int v1 = 123;

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

class Mainclass4
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       
       Subclass ref1 = new Subclass();

       Superclass ref2 = ref1;//upcasting

       System.out.println(ref2.v1);
       ref2.count();

       Subclass ref3 = (Subclass) ref2;//downcasting
       
       System.out.println(ref3.v1);
       ref3.count();

       System.out.println(ref3.z1);
       ref3.display();

	   System.out.println("Program ends...");
	}
}






