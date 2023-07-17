package com.quick.sort;

public class QuickSort {
	public int partition(int arr[],int low,int high)
	{
		int key=arr[low];
		int i=low;
		int j=high;
		while(i<j)
		{
			while(i<high && key>=arr[i]){
				i=i+1;
			}
			while(j>low && key<=arr[j]){
				j=j-1;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	public void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int k=partition(arr,low,high);
			sort(arr,low,k-1);
			sort(arr,k+1,high);
		}
		else
			return;
	}
}
