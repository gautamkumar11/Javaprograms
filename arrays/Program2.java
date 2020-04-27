
class Program2
{
    public static boolean search(int[] a1,int ele)
    {
       
      int f = 0;
      int l = a1.length - 1;


    for(int i=0; i<a1.length; i++)
    {

      int mid = (f+l)/2;

      System.out.println("f   = "+f);
      System.out.println("mid = "+mid);
      System.out.println("l   = "+l);

      if(a1[mid] == ele)
      {
        System.out.println("comaparing "+a1[mid]+"=="+ele);
        return true;
      }
      else if(a1[mid] < ele)
      {
        f = mid + 1;
      }
      else
      {
        l = mid - 1;
      }
    }

    return false;

    }

	public static void main(String[] args) 
	{
		System.out.println("Program starts...");

		int[] a1 = {10,20,30,40,50,60,70,80,90,100};
		boolean res = search(a1,10);
		System.out.println(res);

		System.out.println("Program ends...");
	}
}