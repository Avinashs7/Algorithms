package com.lab_program1;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n,op;
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		int array[]= new int[n];
		for(int i=0; i<n; i++)
			array[i]=r.nextInt(0,1000000);
		SelectionSort ob= new SelectionSort();
		long start,stop;
		
		while(true)
		{
			System.out.println("Enter an option\n 1:Best case\n2:Average case\n3:Worst case\n");
			op=sc.nextInt();
			switch(op)
			{
			case 1:
				start=System.nanoTime();
				ob.sort(array);
				stop = System.nanoTime();
				System.out.println("Best case: "+(stop-start));
				break;
			case 2:
				start=System.nanoTime();
				ob.sort(array);
				stop = System.nanoTime();
				System.out.println("Average case: "+(stop-start));
				break;
			case 3:
				start=System.nanoTime();
				ob.sort(array);
				stop = System.nanoTime();
				System.out.println("Worst case: "+(stop-start));
				break;
			default:
					System.exit(0);
			}
		}
	}

}
