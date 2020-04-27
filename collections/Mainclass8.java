package collections;

import java.util.PriorityQueue;

public class Mainclass8 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();

		pq.add(new String("Bat"));
		pq.add(new String("Camel"));
		pq.add(new String("Apple"));
		pq.add(new String("Eye"));
		pq.add(new String("Ant"));
		pq.add(new String("Apple"));
		pq.add(new String("Desk"));
		
		System.out.println(pq.size());
		         
		while(pq.isEmpty() != true)
		{
		 System.out.println(pq.poll());
		}
		
		System.out.println(pq.size());

	}
}
