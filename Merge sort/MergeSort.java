package merge.sort;

public class MergeSort {
	public void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	public void merge(int arr[],int low,int mid,int high)
	{
		int i=low,j=mid+1,k=low;
		int c[]=new int[high+1];
		while(i<=mid && j<=high)
		{
			if(arr[i]<arr[j])
				c[k++]=arr[i++];
			else
				c[k++]=arr[j++];
		}
		while(i<=mid)
			c[k++]=arr[i++];
		while(j<=high)
			c[k++]=arr[j++];
		for(i=low; i<=high; i++)
			arr[i]=c[i];
	}
}
