package insetion.sort;

public class InsertionSort {
	public void sort(int arr[])
	{
		int n= arr.length,j;
		for(int i=1; i<n; i++)
		{
			int temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
