import java.util.Scanner;
class Exponent
{
	public static void main(String []args)
	{
		System.out.print("Enter two number=");
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>0&&b>0)
		{
		Derived obj=new Derived();
		int res=obj.cal(a,b);
		System.out.print("Result="+res);
		}
		else
			System.out.print("You enter wrong number");
	}
}
class Derived
{
	int cal(int a,int b)
	{
		int res=1;
		for(int i=1;i<=b;i++)
			res=res*a;
		return res;
	}
}