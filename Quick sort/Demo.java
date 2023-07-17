package com.quick.sort;

import java.util.Random;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		Scanner sc = new Scanner(System.in);
		QuickSort ob = new QuickSort();
			System.out.println("Enter the size");
			int n=sc.nextInt();
			int arr[]=new int[n+1];
			for(int i=0;i<n; i++)
				arr[i]=r.nextInt(0,5000);
		//taking random generated data to an array
			arr[n]=Integer.MAX_VALUE;
			int op;
			long start,stop;
			while(true){
				System.out.println("Enter the option");
				op=sc.nextInt();
				//1:Best case 2:Average case 3:Worst case
			switch(op)
			{
			case 1:
			//Best case in quick sort the pivot element's position will be as middle element or near to it 
			//But here i have considered random data as it also takes O(n log(n)) i.e equivalent to average case
				start=System.nanoTime();
				ob.sort(arr,0,n);
				stop=System.nanoTime();
				System.out.println("*****\nBest case:"+(stop-start)+"\n******");
				break;
			case 2:
			//The case here is randomly generated data itself and it's efficiency class is O(n log(n))
//for(int i=0; i<n; i++)
//System.out.print(arr[i]+" ");
				start=System.nanoTime();
				ob.sort(arr,0,n);
				stop=System.nanoTime();
				System.out.println("*****\nAverage case:"+(stop-start)+"\n******");
//for(int i=0; i<n; i++)
//	System.out.print(arr[i]+" ");
//System.out.println(" ");
				break;
			case 3:
			//The worst case in quick sort is when array is already sorted and while partitioning it will skewed 
			//Basically partiotioning won't help in this case as it's efficiency class is O(n^2)
				for(int i=0; i<n; i++)
					arr[i]=i;
				start=System.nanoTime();
				ob.sort(arr,0,n);
				stop=System.nanoTime();
				System.out.println("*****\nWorst case:"+(stop-start)+"\n******");
				break;
			default:
				System.exit(0);
			}
			}
	}

}
