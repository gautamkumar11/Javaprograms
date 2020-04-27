package ds;

class ArrayDs
{
    Object[] a1 = new Object[5];
	int index = 0;
	
	public void add(Object val)
	{
	   a1[index] = val;	
	   index++;
	}
	
	@Override
	public String toString() 
	{
	  String res = "";
	  for (int i = 0; i < a1.length; i++) 
	  {
		res = res +" "+a1[i];
	  }
	  
	  return res;
	}	
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
       ArrayDs ref = new ArrayDs();
       ref.add(10);
       ref.add(true);
       ref.add(30);
       ref.add("hello");
       ref.add(2.5);
       
       System.out.println(ref);
	}
}



