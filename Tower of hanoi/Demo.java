package tower.of.hannoi;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi ob = new TowerOfHanoi();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of disc");
		int n=sc.nextInt();
		long start=System.nanoTime();
		ob.TOH(n, 'A', 'B', 'C');
		long stop=System.nanoTime();
		System.out.println("Time :"+(stop-start));
	}

}
