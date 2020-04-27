import java.util.Scanner;
class Program6
{
	public static void main(String[] args) 
	{
	   String name;
	   int id;
	   long mob;
	   double agg;

       Scanner scn = new Scanner(System.in);
       
       System.out.println("Enter your name : ");
       name = scn.next();//String inputs

       System.out.println("Enter your id : ");
       id = scn.nextInt();//int inputs

       System.out.println("Enter your mob. num : ");
       mob = scn.nextLong();//long inputs

       System.out.println("Enter your agg. : ");
       agg = scn.nextDouble();//double inputs

       System.out.println("-------User Details--------");
       System.out.println("Name : "+name);
       System.out.println("ID   : "+id);
       System.out.println("Mob  : "+mob);
       System.out.println("Agg  : "+agg);
	}
}


