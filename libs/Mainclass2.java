package libs;

class Student extends Object
{
	int id;
	String name;
	double agg;
	
	public Student(int id, String name, double agg) 
	{
		this.id = id;
		this.name = name;
		this.agg = agg;
	}
	
	@Override
	public String toString()
	{
	  return id+" "+name+" "+agg;
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
	    return id == obj.hashCode(); // id--> id of given student object
	                                //obj.hashCode--> id of another student object
	}
}
public class Mainclass2 
{
	public static void main(String[] args) 
	{
       System.out.println("Program starts...");
       
       Student s1 = new Student(123,"Smith",78.24);
       Student s2 = new Student(315,"Allen",64.42);
       Student s3 = new Student(123,"Smith",78.24);

       System.out.println(s1.toString());
       System.out.println(s2);
       
       System.out.println(s1.equals(s2));
       System.out.println(s3.equals(s1));
       
       System.out.println("Program ends...");
	}
}







