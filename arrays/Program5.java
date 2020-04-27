class Program5
{
     public static void selectionSort(int arr[])
    {
      int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

public static void main(String[] args) 
{
	int[] a1 = {20,10,30,40};
	selectionSort(a1);

    for (int i=0; i<a1.length;i++)
    {
       System.out.println(a1[i]);    
    }
}
}




