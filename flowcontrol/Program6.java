class Program6
{
	public static Boolean test(int n1, int n2)
	{
		if(n1 == n1)
		{						// boolean n3= n1 ==n2 return n3;
			return true;  		// or
								 //return n1==n2 ;
		}
		else
		{
			return false;
		}
	}

	public static void main(String args[]){
		boolean b1=test(2,2);
		System.out.println(b1);
	}
}