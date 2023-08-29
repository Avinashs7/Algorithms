package hamltonianCycle;

public class Hamiltonian {
	int flag=0;
	public void cycle(int vertex,int x[],int n,int adj[][])
	{
		do {
			next(vertex,x,adj,n);
			if(x[vertex] == 0)
                return;
            if(vertex == n)
            {
                flag = 1;
                System.out.println("The Hamiltonian cycle is:");
                for(int i = 1; i <= n; i++)
                    System.out.print(x[i]+" ");
                System.out.print("1\n");
            }
            else
                cycle(vertex+1,x,n,adj);
        }while(true);
	}
	public void next(int vertex,int x[],int adj[][],int n) {
		int j;
        do
        {
            x[vertex] = (x[vertex] + 1) % (n + 1);
            if(x[vertex] == 0)
                return;
            if(adj[x[vertex-1]][x[vertex]] == 1)
            {
                for(j = 1; j <= vertex - 1; j++)
                    if(x[j] == x[vertex])
                        break;
                if(j == vertex)
                    if((vertex < n) || ((vertex == n) && adj[x[n]][x[1]] == 1))
                        return;
            }
        }while(true);
	}
}
