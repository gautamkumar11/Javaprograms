package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Mainclass12 
{
	public static void main(String[] args) 
	{
		LinkedHashMap h1 = new LinkedHashMap();
		
		h1.put(1234,"City A");
		h1.put(6152,"City B");
		h1.put(9172,"City C");
		h1.put(1751,"City D");
		h1.put(9.34,"City E");
		h1.put("hello","City F");
		
		Set keySet = h1.keySet();
		
		Iterator i1 = keySet.iterator();
		
		while(i1.hasNext())
		{
		    Object k1 = i1.next();//1234//6152
			System.out.println("key : "+k1+" value : "+h1.get(k1));
		}
		
		
		
		
	}
}
