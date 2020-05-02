class Mainclass3
{
	public static String test(String s1)
	{
		String s2 = "";

		for(int i=0; i<s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			int  i1 = c1;

			if(i1 >= 65 && i1 <= 90)
			{
				i1 = i1 + 32;
				c1 = (char) i1;
			}

			s2 = s2 + c1;
		}
 
        return s2;
	}

	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");

	    String str =  test("HELLO");
	    System.out.println(str);

	   System.out.println("Program ends...");	
	}
}




