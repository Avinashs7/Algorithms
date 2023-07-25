package insetion.sort;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n;
		System.out.println("Enter size of array");
		n= sc.nextInt();
		int arr[]=new int[n];
		long start,stop;
		InsertionSort ob = new InsertionSort();	
		System.out.println("Choose an opton");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
			for(int i=0; i<n; i++)
				arr[i]=i;
			start=System.nanoTime();
			ob.sort(arr);
			stop=System.nanoTime();
			System.out.println("Best case:"+(stop-start));

			break;
		case 2:
			for(int i=0; i<n; i++)
				arr[i]=r.nextInt(0,1000);
//			System.out.println("The array is:");
//			for(int i=0; i<n; i++)
//				System.out.print(arr[i]+" ");
//				System.out.println();
			start=System.nanoTime();
			ob.sort(arr);
			stop=System.nanoTime();
			System.out.println("Average case:"+(stop-start));
//			System.out.println("The sorted array is:");
//			for(int i=0; i<n; i++)
//				System.out.print(arr[i]+" ");
//				System.out.println();
			break;
		case 3:
			for(int i=0; i<n; i++)
				arr[i]=n-i;
			start=System.nanoTime();
			ob.sort(arr);
			stop=System.nanoTime();
			System.out.println("Worst case:"+(stop-start));

			break;
		default:
				System.exit(0);
		}
	}

}
