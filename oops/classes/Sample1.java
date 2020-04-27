class Sample1
{
    int a1 = 1234;
    static double z1 = 2.34;

    public void display()
    {
    	System.out.println("this is display() of Sample1 class");
    	System.out.println(a1);
    	System.out.println(z1);
    }

	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");

       System.out.println(new Sample1().a1);
       new Sample1().display();

       System.out.println(z1);

	   System.out.println("Program ends...");	
	}
}