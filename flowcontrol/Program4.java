class Program4{

	public static void test(char optn)
	{
		System.out.println(optn);
		if(optn == 'A')
		{
			System.out.println( " option A selected");
		}
		else if(optn == 'B')
		{
			System.out.println( "option B selected");
		}
		else if(optn == 'C')
		{
			System.out.println( "option C selected");
		}
		else if(optn == 'D')
		{
			System.out.println(" Option D selected");
		}
		else
		{
			System.out.println(optn+ " invalid option");
		}
		return;
	}

	public static void main(String[] args) {
		test('E');

	}
}