package pkg2;

import pkg1.Sample;

public class Demo extends Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");

		Sample s1 = new Sample();

		System.out.println(s1.v1);
		s1.test1();

		Demo d1 = new Demo();
		System.out.println(d1.v2);
		d1.test2();

		System.out.println("Program ends...");
	}
}