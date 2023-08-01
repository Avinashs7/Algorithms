package lab_program5;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v=sc.nextInt();
		int adj[][]=new int[v][v];
		System.out.println("Enter the cost adjacency matrix");
		for(int i=0; i<v; i++)
		{
			for(int j=0; j<v; j++)
				adj[i][j]=sc.nextInt();
		}
		boolean vis[]=new boolean[v];
		for(int i=0; i<v; i++)
		{
			vis[i]=false;
		}
		spanning ob=new spanning();
		int cost=ob.min_span_tree(adj,vis,v);
		System.out.println("The cost is: "+cost);
		sc.close();
	}

}
