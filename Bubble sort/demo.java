package com.bubble.sort;
import java.util.Scanner;

public class demo {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of array");
		n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		bubbleSort ob = new bubbleSort();
		ob.sort(arr, n);
		System.out.println("The sorted array is");
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}
}
