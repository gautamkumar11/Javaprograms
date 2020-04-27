import java.util.Scanner;
class Program3
{
     public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

public static void main(String[] args) 
{
    System.out.println("Program starts...");

    Scanner s1 = new Scanner(System.in);
    
    System.out.println("Enter the array size");
    int size = s1.nextInt();
	
    int[] a1 = new int[size];
    
    System.out.println("enter array elements");
   
    for (int i=0;i<a1.length;i++) 
    {
      a1[i] = s1.nextInt();  
    }

	bubbleSort(a1);

    for (int i=0;i<a1.length;i++) 
    {
      System.out.println(a1[i]);
    }

    System.out.println("Program ends...");
}
}