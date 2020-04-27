package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add("java");// --upcast Object class
		h1.add(null);
		h1.add("python");
		h1.add("java");
		h1.add("html");
		h1.add(null);
		h1.add("spring");
		h1.add("hibernate");

		Iterator i1 = h1.iterator();

		while (i1.hasNext() == true) {
			String s1 = (String) i1.next();
			if (s1 != null) {
				System.out.println(s1 + ": " + s1.length());
			}
		}

		boolean b1 = h1.contains("hibernate");
		System.out.println(b1);

	}
}
