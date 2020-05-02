package collections;

import java.util.HashMap;

class Contact
{
	String name;
	long   phn;
	String email;
	
	public Contact(String name, long phn, String email) 
	{
		super();
		this.name = name;
		this.phn = phn;
		this.email = email;
	}
	
	@Override
	public String toString() 
	{
		return name + " "+phn+" "+ email;
	}
}


public class Mainclass11 
{
	public static void main(String[] args) 
	{
        HashMap h1 = new HashMap();
        
        System.out.println("size : "+h1.size());
        h1.put("ajay",new Contact("ajay",999121221,"ajay@gmail.com"));
        System.out.println(h1.get("ajay"));
        
        h1.put("ajay",new Contact("ajay",999121221,"ajay@gmail.com")); 
        System.out.println(h1.get("ajay"));
        
        h1.put("vijay",new Contact("ajay",999121221,"ajay@gmail.com")); 
        System.out.println(h1.get("vijay"));
        
        h1.put("ajay",new Contact("sachin",889897671,"sachin@gmail.com")); 
        System.out.println(h1.get("ajay"));
        
        h1.put(null,new Contact("virat",809867966,"virat@gmail.com")); 
        System.out.println(h1.get(null));
        
        h1.put("rahul",null); 
        System.out.println(h1.get("rahul"));
        
        h1.put("rohith",null); 
        System.out.println(h1.get("rohith"));
        
        System.out.println("size : "+h1.size());

	}
}









