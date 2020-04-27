class Superclass 
{
	double z1 = 7.13;

	public void display()
	{
		System.out.println("this is display() of Superclass");
	}
}

class Subclass extends Superclass
{
	int z1 = 125;

    @Override
	public void display()
	{
		System.out.println("this is Overriden display() of Subclass");
	}
	public void view()
	{
		System.out.println("this is view() of Subclass");
		System.out.println("z1 = "+z1);
		System.out.println("z1 = "+super.z1);

		display();
		super.display();
	}
}
class Mainclass2 extends Object
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");

	   Subclass ref1 = new Subclass();
	   ref1.view();

	   System.out.println("Program ends...");
	}
}






