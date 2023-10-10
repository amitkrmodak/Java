import java.util.Scanner;
class Fact_fun
{
	int cal(int a,int r)
	{
		if(a==1)
			return r;
		else
		{
			r=r*a;
			return cal(--a,r);
		}
	}
	public static void main(String args[])
	{
		int res,a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		Fact_fun obj=new Fact_fun();
		res=obj.cal(a,1);
		System.out.print("The factorial of the number="+res);
	}
}