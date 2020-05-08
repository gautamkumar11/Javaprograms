class Program5{

	public static void test(char optn)
	{
		System.out.println("option = "+optn);
		switch(optn)
		{
			case 'A' : System.out.println( " option A selected");
						break;

			case 'B' : System.out.println( "option B selected");
						break;

			case 'C' :	System.out.println( "option C selected");
						break;

			case 'D' :	System.out.println(" Option D selected");
						break;

			default :System.out.println("invalid option");
		}
		return;
	}

	public static void main(String[] args) {
		test('Z');

	}
}