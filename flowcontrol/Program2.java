class Program2{

	public static void test(int n1)
	{
		System.out.println(n1);
		if(n1 > 50)
		{
			System.out.println(n1+ " is greater than 50");
		}
		else{
			System.out.println(n1+ " is less than 50");
		}
		return;
	}

	public static void main(String[] args) {
		test(10);

	}
}