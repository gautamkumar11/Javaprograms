package collections;

import java.util.LinkedList;

public class Mainclass10 
{
	public static void main(String[] args) 
	{
		LinkedList pq = new LinkedList();

		pq.add("hi");
		pq.add("hello");
		pq.add(null);
		pq.add("gm");
		pq.add(null);
		pq.add("hi");

		System.out.println("size = " + pq.size());
		
		for (int i = 0; i < pq.size(); i++) 
		{
			System.out.println(pq.get(i));
		}
		System.out.println("size = " + pq.size());

		while (pq.isEmpty() != true) 
		{
			System.out.println(pq.poll());
		}
		System.out.println("size = " + pq.size());

	}
}
