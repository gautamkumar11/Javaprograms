class Demo
{
	public Demo()
	{
	  System.out.println("this Demo() const..");
	}

	public Demo(int a1)
	{
	  System.out.println("this Demo(int a1) const..");
	}

	public Demo(double a1)
	{
	  System.out.println("this Demo(double a1) const..");
	}

	public Demo(double a1,int b1)
	{
	  System.out.println("this Demo(double a1,int a1) const..");
	}

	public Demo(int a1,double b1)
	{
	  System.out.println("this Demo(int a1,double a1) const..");
	}
}

class Mainclass3
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
      
      new Demo();//call
      new Demo(10);
      new Demo(2.5);
      new Demo(3.25,100);
      new Demo(25,9.23);

	  System.out.println("Program ends...");	
	}
}




