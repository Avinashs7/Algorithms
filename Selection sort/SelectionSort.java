package com.lab_program1;

public class SelectionSort {
	public void sort(int array[])
	{
		int min;
		for(int i=0; i<array.length-1; i++)
		{
			min=i;
			for(int j=i+1; j<array.length-1; j++)
			{
				if(array[min]<array[j])
					min=j;
			}
			if(min!=i)
			{
				int temp=array[i];
				array[i]=array[min];
				array[min]=temp;
			}
		}
	}
}
