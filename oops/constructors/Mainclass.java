class Sample
{
	public Sample()
	{
	  System.out.println("this Sample class Contructor");	
	  return;
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");

	  new Sample();

	  System.out.println("Program ends...");	
	}
}