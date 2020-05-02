package collections;

import java.util.ArrayList;

public class Mainclass14 
{
	public static void main(String[] args) 
	{
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("hello");
        a1.add(new String("Spring"));
        a1.add("java");
        a1.add(new String("python"));
        a1.add("html");
                
        for(int i=0; i<a1.size();i++)
        {
        	System.out.println(a1.get(i) +" : "+a1.get(i).length());
        }
        
	}
}



