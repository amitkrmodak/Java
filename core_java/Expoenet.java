import java.util.*;
class Exponent
{
	static int show(int x,int y,int r)
	{
		if(y==0)
			return 1;
		else
		{
			r=r*x;
			return show(x,y--,r);
		}
	}
	public static void main(String []args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Power obj=new Power();
		int res=obj.show(a,b,1);
		System.out.print("Power="+res);
	}
}