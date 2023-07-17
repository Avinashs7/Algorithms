package com.binary.search;

import java.util.Scanner;

import com.linear.search.linearSearch;

public class demo {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,key;
		System.out.println("Enter size of array");
		n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search in array");
		key = sc.nextInt();
		binarySearch se = new binarySearch();
		if(se.search(arr,n,key))
		{
			System.out.println("Element is found in array");
		}
		else
		{
			System.out.println("Element is not found in array");
		}
	}
}
