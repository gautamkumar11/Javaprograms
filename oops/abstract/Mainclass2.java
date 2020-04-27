abstract class Account
{
   int accNo;
   double bal;
   String dateOfOpening;

   abstract public void addCustomer();
   abstract public void removeCustomer();

   public void debit(double amt)
   {
      bal = bal - amt;
   }

   public void credit(double amt)
   {
      bal = bal + amt;
   }

   public void getBal()
   {
      System.out.println("bal : "+bal);
   }

}
class Savings extends Account
{
   int  min_bal = 1000;

   @Override
   public void addCustomer()
   {
      System.out.println("Customer added to Savings accnt DB");
   }

   @Override
   public void removeCustomer()
   {
      System.out.println("Customer removed from Savings accnt DB");
   }  
}

class Current extends Account
{
    double roi;

   @Override
   public void addCustomer()
   {
      System.out.println("Customer added to Current accnt DB");
   }

   @Override
   public void removeCustomer()
   {
      System.out.println("Customer removed from Current accnt DB");
   }
}

class Mainclass2
{
   public static void main(String[] args) 
   {
      System.out.println("Program starts...");

      Savings s1 = new Savings();

      s1.addCustomer();
      s1.getBal();

      Current c1 = new Current();

      c1.addCustomer();
      c1.getBal();

      System.out.println("Program ends...");	
   }
}





