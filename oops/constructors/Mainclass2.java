class Customer
{
	int    cust_id;
    String name;
    String addrs;
    long   phn; 

    public Customer(int cust_id,String name,String addrs,long phn)
    {
      this.cust_id = cust_id;
      this.name    = name;
      this.addrs   = addrs;
      this.phn     = phn;
    }

    public void showCustDetails()
    {
       System.out.println("cust_id : "+cust_id);
       System.out.println("Name    : "+name);
       System.out.println("Addrs   : "+addrs);
       System.out.println("Phn     : "+phn);
    }
}

class Mainclass2
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");

      Customer c1 = new Customer(12345,"Sachin","Blr",9898767654l);
      c1.showCustDetails();

      Customer c2 = new Customer(65432,"Virat","Delhi",78778980989l);
      c2.showCustDetails();

	  System.out.println("Program ends...");	
	}
}






