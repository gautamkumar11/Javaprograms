class Prime{
	public static void Test(int n)
	{
		int flag=0;
		if(n==0 || n== 1)
		{
			System.out.println(n+" is not a prime number......");
		}
		for (int i=2; i<n ;i++ ) {
			if (n%i==0) {
				System.out.println(n+ "is not prime numberrrrrr");
				flag=1;
				break;
			}
			
			
		}
		if (flag==0) {
			
				System.out.println(n+ "is a prime number");
		}
	}
	public static void main(String[] args) {
		Test(7);
	}
}