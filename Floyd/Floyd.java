package lab_program9;

public class Floyd {
	public void shortestPath(int adj[][],int n) {
		for(int k=0;k<n;k++){
		    for(int j=0;j<n;j++){
		        for(int i=0;i<n;i++){
		            adj[i][j]=Math.min(adj[i][j],adj[i][k]+adj[k][j]);
		        }
		    }
		}
	}
}
