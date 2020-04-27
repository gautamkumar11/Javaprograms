package collections;

import java.util.TreeSet;

class Student implements Comparable<Student>
{
	String name;
	int id;
	double agg;

	public Student(String name, int id, double agg) 
	{
		super();
		this.name = name;
		this.id = id;
		this.agg = agg;
	}
	
	@Override
	public String toString()
	{
		return name+" "+id +" "+agg;
	}

	@Override
	public int compareTo(Student othr) 
	{
		int res = id - othr.id;
		return res;
	}
}

public class Mainclass7 
{
	public static void main(String[] args) 
	{
       TreeSet t1 = new TreeSet();
       
       t1.add(new Student("Smith",341,76.12));
       t1.add(new Student("Allen",152,61.32));
       t1.add(new Student("Miler",268,56.89));
       t1.add(new Student("Martin",512,66.92));
       t1.add(new Student("Blake",487,53.62));
       
       System.out.println(t1);
	}
}










