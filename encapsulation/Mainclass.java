package encapsulation;

class Account
{
	private double bal;	
	
	public double getBal()//returns current value of bal
	{
		return bal;
	}
	
	public void setBal(double bal)//update value of bal
	{
		if(bal > 0)
		{
		 this.bal = bal;
		}
		
	}
}

class Transaction
{
	public static void deposit(Account acnt,double amt)
	{
		double b1 = acnt.getBal();//get current bal
		b1 = b1 + amt;//cal new bal
		acnt.setBal(b1); //update new bal
	}
	
	public static void withdraw(Account acnt,double amt)
	{
		double b1= acnt.getBal();
		b1 = b1-amt;
		acnt.setBal(b1);

	}
	
	public static void showBal(Account acnt)
	{
		System.out.println("bal = "+acnt.getBal());
	}
}


public class Mainclass 
{
	public static void main(String[] args) 
	{
	   
       Account a1 = new Account();
       Account a2 = new Account();

       Transaction.showBal(a1);
       Transaction.deposit(a1,300);
       Transaction.showBal(a1);
       
       
       Transaction.showBal(a2);
       
     
	}
}









