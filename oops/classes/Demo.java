class Demo
{
	static int v1 = 124;

	public static void view()
	{
		System.out.println("this is view() of Demo class");
		System.out.println(v1);
	}

	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       
       System.out.println(v1);
       view();

	   System.out.println("Program ends...");
	}
}