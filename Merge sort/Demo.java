package merge.sort;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		Scanner sc = new Scanner(System.in);
		MergeSort ob=new MergeSort();
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int op;
		long start,stop;
		
		while(true){
			
			System.out.println("Enter the option");
			op=sc.nextInt();
		switch(op)
		{
		case 1:
			for(int i=0;i<n; i++)
				arr[i]=i;
			start=System.nanoTime();
			ob.sort(arr,0,n-1);
			stop=System.nanoTime();
			System.out.println("*****\nBest case:"+(stop-start)+"\n******");
			break;
		case 2:
			for(int i=0;i<n; i++)
				arr[i]=r.nextInt(0,5000);
//			for(int i=0; i<n; i++)
//				System.out.print(arr[i]+" ");
			start=System.nanoTime();
			ob.sort(arr,0,n-1);
			stop=System.nanoTime();
			System.out.println("*****\nAverage case:"+(stop-start)+"\n******");
//			for(int i=0; i<n; i++)
//				System.out.print(arr[i]+" ");
//			System.out.println(" ");
			break;
		case 3:
			for(int i=0;i<n; i++)
				arr[i]=n-1-i;
			start=System.nanoTime();
			ob.sort(arr,0,n-1);
			stop=System.nanoTime();
			System.out.println("*****\nWorst case:"+(stop-start)+"\n******");
			break;
		default:
			System.exit(0);
		}
	}
}
}
