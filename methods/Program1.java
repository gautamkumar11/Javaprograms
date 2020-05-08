class Program1{

	public static double findAvg(int n1, int n2, int n3)
	{
		double avg=0.0;
		avg= (n1+n2+n3)/3;
		return avg;
	}

	public static void main(String[] args) {
		double res, avg;
		avg= findAvg(1,2,3);
		res=avg * 50;
		System.out.println(res);

		avg= findAvg(30,60,90);
		res=avg/.3;
		System.out.println(res);

	}
}