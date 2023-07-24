package tower.of.hannoi;

public class TowerOfHanoi {
	public void TOH(int n,char src,char temp,char dest)
	{
		if(n==0)
			return;
		TOH(n-1,src,dest,temp);
		//System.out.println("Move disc from "+src+" to "+dest);
		TOH(n-1,temp,src,dest);
	}
}
