package lab_program9;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc =new Scanner(System.in); 
		System.out.println("Enter the total number of nodes"); 
		int n=Sc.nextInt();
		System.out.println("Enter the adjacency matrix"); 
		int d[][]= new int[n][n];
		for(int i=0;i<n;i++){ 
		    for(int j=0;j<n;j++){
		        d[i][j]=Sc.nextInt();
		    }
		}
		Floyd ob=new Floyd();
		ob.shortestPath(d, n);
		System.out.println("The matrix is: ");
		for(int i=0;i<n;i++){ 
		    for(int j=0;j<n;j++){
		        System.out.print(d[i][j]+" ");
		    }
		    System.out.println(" ");
		}
	}

}
