class User
{
	String name;
	String email;
	long   adhar;

	public User(String name,String email,long adhar)
	{
	  this.name = name;
	  this.email = email;
	  this.adhar = adhar;
	}

	public User(String name,String email)
	{
	  this.name = name;
	  this.email = email;
	}

	 public void showUserDetails()
    {
       System.out.println("Name    : "+name);
       System.out.println("email   : "+email);
       System.out.println("adhar   : "+adhar);
    }
}

class Mainclass4
{
	public static void main(String[] args) 
	{
	  System.out.println("Program starts...");
      
      User u1 = new User("User1","user1@gmail.com",7676755434l);
      u1.showUserDetails();

      User u2 = new User("User2","user2@gmail.com");
      u2.showUserDetails();

	  System.out.println("Program ends...");	
	}
}





