class Superclass extends Object
{
	public Superclass()
	{
      super();//call Object() const..
	  System.out.println("this is Superclass() const");
	}

	public Superclass(int v1)
	{
      super();//call Object() const..
	  System.out.println("this is Superclass(int v1) const");
	}
}

class Subclass extends Superclass
{
	public Subclass()
	{
	  //super();//call superclass() const..
	  System.out.println("this is Subclass() const");
	}	
}

class Mainclass4 extends Object
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       
       new Superclass();

	   System.out.println("Program ends...");
	}
}






