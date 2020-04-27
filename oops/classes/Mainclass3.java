class Account
{
	long   acno = 1234567890;
	double bal = 0.0;           // data members 
    String owner = "smith";
    String branch = "BTR";
    static String bankName = "ICICI";

    public void debit(double amt)
    {
      bal = bal - amt;
    }

    public void credit(double amt)
    {
      bal = bal + amt;
    }

    public void showBal()
    {
      System.out.println("Avl. Bal = "+bal);
    }

    public static void showBankName()
    {
    	System.out.println("Bank : "+bankName);
    }

    public void showAccntDetails()
    {
    	System.out.println("acno   : "+acno);
    	System.out.println("bal    : "+bal);
    	System.out.println("owner  : "+owner);
    	System.out.println("branch : "+branch);
    	System.out.println("Bank   : "+bankName);
    }
}

class Mainclass3
{
  public static void main(String[] args) 
  {
    System.out.println("Program starts...");
    Account a1;
    a1 = new Account();

    Account a2 = new Account();
    Account a3 = a1;

    System.out.println("a1 = "+a1);
    System.out.println("a2 = "+a2);
    System.out.println("a3 = "+a3);

    a1.showBal();
    a1.credit(1000);
    a1.showBal();

    a2.showBal();

    a3.debit(500);

    a1.showBal();

    a3.showBal();

    System.out.println("Program ends..."); 	
  }
}







