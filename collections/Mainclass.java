package collections;

import java.util.Iterator;
import java.util.Vector;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		Vector a1 = new Vector();
		a1.add(10); // X a1[0] = 78;
		a1.add(true);
		a1.add(null);
		a1.add(30);
		a1.add("hello");
		a1.add(10);
		a1.add(2.5);
		a1.add(null);

		System.out.println(a1);
		Iterator i1 = a1.iterator();

		while (i1.hasNext() == true) 
		{
			System.out.println(i1.next());
		}
	}

}
