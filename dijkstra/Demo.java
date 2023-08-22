package dijkstra;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int n=sc.nextInt();
		int adj[][]=new int[n][n];
		System.out.println("Enter the adjacency matrix");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
				adj[i][j]=sc.nextInt();
		}
		Dijkstra ob=new Dijkstra();
		System.out.println("Enter the source vertex");
		int src=sc.nextInt();
		int dist[]=new int[n];
		ob.shortestPath(n,adj,src,dist);
		for(int i=0; i<n; i++)
		{
			if(src==i)
				continue;
			else
				System.out.println("The distance from "+src+" to node "+i+" is "+dist[i]);
		}
	}

}
