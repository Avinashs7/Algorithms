package lab_program5;
import java.util.*;
public class spanning {
	public int min_span_tree(int adj[][],boolean vis[],int v)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source vertex");
		int src=sc.nextInt();
		vis[src-1]=true;
		int source=0,cost=0,target=0;
		System.out.println("The nodes to be travelled to reach the destination is:");
		for(int i=1; i<v; i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=0; j<v; j++)
			{
				if(vis[j])
				{
					for(int k=0; k<v; k++)
					{
						if(!vis[k] && min>adj[j][k])
						{
							min=adj[j][k];
							source=j;
							target=k;
						}
					}
				}
			}
			vis[target]=true;
			System.out.println("("+(source+1)+","+(target+1)+")");
			cost=cost+min;
		}
		return cost;
	}
}
