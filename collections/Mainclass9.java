package collections;

import java.util.PriorityQueue;

public class Mainclass9 
{
	public static void main(String[] args) 
	{
       PriorityQueue pq = new PriorityQueue();
       
       pq.add(new Student("Smith",341,76.12));
       pq.add(new Student("Allen",152,61.32));
       pq.add(new Student("Miler",268,56.89));
       pq.add(new Student("Martin",512,66.92));
       pq.add(new Student("Blake",487,53.62));
       pq.add(new Student("Smith",341,76.12));
       pq.add(new Student("Allen",100,61.32));

       System.out.println(pq);
        while(pq.isEmpty() != true)
		{
		 System.out.println(pq.poll());
		}
	}
}











