package com.binary.search;
import java.util.*;
public class binarySearch {
	public boolean search(int arr[],int size,int key)
	{
		int low=0,high=size-1,mid;
		while(low<=high)
		{
			mid = (low+high)/2;
			if(arr[mid]==key)
				return true;
			else if(arr[mid]>key)
				high = mid-1;
			else
				low=mid+1;
		}
		return false;
	}
}
