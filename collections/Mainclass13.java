package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Mainclass13 
{
	public static void main(String[] args) 
	{
		TreeMap h1 = new TreeMap();
		
		h1.put(333,new String("Bangalore"));
		h1.put(111,new StringBuffer("Chennai"));
		h1.put(444,"Mumbai");
		//h1.put(null,"Mumbai");
		h1.put(222,"Kolkata");
		h1.put(777,null);
		h1.put(555,"Chennai");
		h1.put(666,null);
		h1.put(new Integer(888),"Delhi");
		h1.put(999,true);

		
		Set keySet = h1.keySet();
		
		Iterator i1 = keySet.iterator();
		
		while(i1.hasNext())
		{
		    Object k1 = i1.next();//1234//6152
			System.out.println("key : "+k1+" value : "+h1.get(k1));
		}
		
		
		
		
	}
}
