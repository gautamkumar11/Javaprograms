class Mainclass4
{
    static int v1;//global var.

    public static void test(int a1)
    {
    	System.out.println("this is test()");
    	System.out.println("v1 = "+v1);
    	int z1 = 10;//local
    	System.out.println("z1 = "+z1);
    }
 
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");

	   System.out.println("v1 = "+v1);
	   test(5);

	   double k1 = 23.13;//local

	   System.out.println("Program ends...");	
	}
}