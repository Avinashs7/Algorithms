package sumOfSubsets;

import java.util.*;

public class Demo {
	static int arr[];
    static int solvector[];
    static int target;
    static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n= sc.nextInt();
        arr=new int[n];
        solvector=new int[n];
        System.out.println("Enter the numbers in ascending order");
        for(int i=0; i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the target sum");
        target=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        if(target>sum)
        {
            System.out.println("Solution doesnt Exist");
            System.exit(0);
        }
        System.out.println("The solutions are");
        Subarray(0,0,sum);
	}
	 public static void Subarray(int subsum, int  index,int remsum)
	    {
	        solvector[index]=1;
	        if(subsum+arr[index]==target)
	        {
	            System.out.println("Solution No: = "+ (++count));
	            for(int i=0; i<=index ;i++)
	            {
	                if(solvector[i]==1)
	                    System.out.println(" "+arr[i]);
	            }
	        }
	        else if(subsum+arr[index]+arr[index+1]<=target)
	        {
	            Subarray(subsum+arr[index], index+1, remsum-arr[index]);
	        }
	        if((subsum+remsum-arr[index]>=target)&& (subsum+arr[index+1]<=target))
	        {
	            solvector[index]=0;
	            Subarray(subsum,index+1,remsum-arr[index]);
	        }
	    }

}
