package dijkstra;

public class Dijkstra {
	public void shortestPath(int n,int adj[][],int src,int dist[])
	{
		boolean vis[]=new boolean[n];
		int unvis=-1,min=Integer.MAX_VALUE;
		for(int i=0; i<n; i++)
		{
			dist[i]=adj[src][i];
			vis[i]=false;
		}
		vis[src]=true;
		for(int i=0; i<n; i++)
		{
			min=Integer.MAX_VALUE;
			for(int j=1; j<n; j++)
			{
				if(!vis[j] && min>dist[j])
				{
					min=dist[j];
					unvis=j;
				}
			}
			vis[unvis]=true;
			for(int v =0; v <n; v++)
			{
				if(!vis[v] && (dist[unvis] + adj[unvis][v]) < dist[v])
					dist[v] = dist[unvis] + adj[unvis][v];

			}
		}
	}
}
