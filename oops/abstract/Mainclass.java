abstract class Sample
{
	int v1 = 100;
	static double z1 = 2.14;

    abstract public void test();

    public void count()
    {
      System.out.println("count() of Sample");
    }

    public static void view()
    {
      System.out.println("view() of Sample");
    }
}

class Demo extends Sample
{
    @Override
    public void test()
	{
      System.out.println("Overriding test()");
	}

	public void display()
	{
	  System.out.println("display() of Demo");
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");	
      Sample s1;

      Demo d1 = new Demo();

      System.out.println(d1.v1);
      d1.count();

      System.out.println(Demo.z1);
      Demo.view();
     
	  System.out.println("Program ends...");
	}
} 


