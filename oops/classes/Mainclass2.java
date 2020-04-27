class Demo1
{
    long x1 = 3456788765l;

    public void count()
    {
    	System.out.println("this is count() of Demo1 class");
    }
}

class Mainclass2
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
     System.out.println(new Demo1().x1);
     new Demo1().count();
	   System.out.println("Program ends...");	
	}
}