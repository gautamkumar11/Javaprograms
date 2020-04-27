
class Program1
{
    public static boolean search(int[] a1,int ele)
    {

      for (int i=0;i<a1.length;i++) 
      {
      	 if(a1[i] == ele)
         {
      	   return true;
         }
      }
     
      return false;

    }

	public static void main(String[] args) 
	{
		System.out.println("Program starts...");

		int[] a1 = {20,10,30,50,40};
		boolean res = search(a1,500);
		System.out.println(res);

		System.out.println("Program ends...");
	}
}