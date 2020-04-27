class Sample
{
	static double x1 = 6.89;

	public static void count()
	{
		System.out.println("this is count() of Sample class");
		System.out.println(x1);
	}
}

class Mainclass 
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       System.out.println(Sample.x1);
       Sample.count();
	   System.out.println("Program ends...");
	}
}