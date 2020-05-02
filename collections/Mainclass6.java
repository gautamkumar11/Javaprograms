package collections;

import java.util.Comparator;
import java.util.TreeSet;

class OrderZtoA implements Comparator<String>
{
	@Override
	public int compare(String gvn, String othr) 
	{
		int res = othr.compareTo(gvn);
		return res;
	}
}

public class Mainclass6 
{
	public static void main(String[] args) 
	{
		OrderZtoA o1 = new OrderZtoA();
		
		TreeSet<String> t1 = new TreeSet<String>(o1);

		t1.add(new String("Bat"));//---> compare() of OrderZtoA
		t1.add(new String("Camel"));
		t1.add(new String("Apple"));
		t1.add(new String("Eye"));
		t1.add(new String("Ant"));
		t1.add(new String("Desk"));
		
		System.out.println(t1);
	}

}
