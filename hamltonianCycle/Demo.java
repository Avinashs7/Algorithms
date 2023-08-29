package hamltonianCycle;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente number of vertices");
		int n=sc.nextInt();
		int adj[][]=new int[n+1][n+1];
		int x[]=new int[n+1];
		System.out.println("Ente adjacency matrix");
		for(int i=1; i<=n; i++)
			for(int j=1; j<=n; j++)
				adj[i][j]=sc.nextInt();
		x[1]=1;
		Hamiltonian ob=new Hamiltonian();
		int vertex=2;
		ob.cycle(vertex,x,n,adj);
	}

}
