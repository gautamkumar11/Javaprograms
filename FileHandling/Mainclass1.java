interface Superclass1
{
	static final int a=10;
	abstract public void draw();
}
interface Superclass2 extends Superclass1
{
	int b=20;
	public void run();
}
interface Superclass3 
{
	int b=20;
	public void display();
}
class Subclass extends Object implements Superclass2, Superclass3
{	
	@Override
	public void draw()
	{
		System.out.println("draw() method of Superclass1");
	}
	@Override
	public void run()
	{
		System.out.println("run() method of Superclass2");
	}
	@Override
	public void display()
	{
		System.out.println("display() method of Superclass3");
	}
	
}
public class Mainclass1 
{
public static void main(String[] args)
{
	Superclass1 ref1=new Subclass();
	ref1.draw();
	Subclass ref2=new Subclass();
	ref2.run();
	ref2.display();
}
}
