package lab_program11;
import java.util.*;
public class TSP {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cities");
		int n=sc.nextInt();
		System.out.println("Cost adjacency matrix");
		int adj[][]=new int[n+1][n+1];
		int s[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n; j++)
				adj[i][j]=sc.nextInt();
			s[i]=1;
		}
		int a=tsp(1,n-1,adj,s,n);
		System.out.println("The optimal tour cost is "+a);
	}
	static int tsp(int i,int s,int adj[][],int set[],int n)
	{
		int newset[]=new int[n+1];
		int selected[]=new int[n+1];
		for(int j=1; j<=n; j++)
			newset[j]=set[j];
		newset[i]=0;
		if(s==0)
			return adj[i][1];
		for(int k=0,j=2; k<s; j++)
		{
			if(newset[j]!=0)
			{
				selected[k]=adj[i][j]+tsp(j,s-1,adj,newset,n);
				k++;
			}
		}
		int min=99;
		for(int j=0;j<s; j++)
			if(selected[j]<min)
				min=selected[j];
		return min;
	}
}
