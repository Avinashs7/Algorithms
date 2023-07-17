package com.linear.search;

public class linearSearch {
	public boolean search(int arr[],int key)
	{
		for(int a:arr)
		{
			if(a==key)
				return true;
		}
		return false; 
	}
}
