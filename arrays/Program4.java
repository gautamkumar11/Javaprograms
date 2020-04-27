class Program4
{
     public static void insertionSort(int arr[])
    {
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    }

public static void main(String[] args) 
{
	int[] a1 = {40,30,20,10};
	insertionSort(a1);

    for(int i=0; i<a1.length; i++)
    {
        System.out.println(a1[i]);
    }
}
}




