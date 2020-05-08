class Prime100{
	public static void Test(int n)
	{
		int flag=0;
		
			System.out.println("2");
		
		for (int i=3; i<=n ;i++ ) 
		{
			for (int j=2; j<i; j++ )
			 {
				if (i%j==0) {
				flag=1;
				break;
				}
					else
					{
					 flag=0;
					}
			
			}
			if (flag==0) 
				{
					System.out.println(i);
				}
			
		
		}
	}
	public static void main(String[] args) {
		Test(100);
	}
}