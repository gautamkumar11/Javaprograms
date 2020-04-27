package libs;

class Sample1 extends Object
{

}

public class Mainclass
{
  public static void main(String[] args) 
  {
     System.out.println("Program starts...");
     
     Sample1 s1 = new Sample1();
     Sample1 s2 = new Sample1();
    
     int i1 = s1.hashCode();
     System.out.println("i1 = "+i1);
     
     System.out.println(s2.hashCode());
     
     System.out.println(s1.toString());
     System.out.println(s1);//impl. toString() called by println()
     
     System.out.println(s1.equals(s2));
     
     System.out.println("Program ends...");	
  }
}



