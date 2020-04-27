package stringbuffer;

public class Mainclass 
{
	public static String test(String str)
	{
		String res = "";
		
		for(int i=0; i<=(str.length()-1)/2; i++)
		{
			res = res + str.charAt(i);
			System.out.println(res);
		}
		
		return res;		
	}
	
	public static String test2(String str)
	{
		String res = "";//empty string
		StringBuilder sb1 = new StringBuilder();//empty SB
		
		for(int i=0; i<=(str.length()-1)/2; i++)
		{
			sb1 = sb1.append(str.charAt(i));
			System.out.println(sb1);
		}
		
		res = sb1.toString();
		return res;		
	}
	
	
	public static void main(String[] args) 
	{
      String s1 = "aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccc";
      System.out.println(test(s1));
      System.out.println(test2(s1));
	}
}







