import java.util.Scanner;
class Strong_number
{
	public static void main(String args[])
	{
		int a;
		System.out.print("Enter a number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		Derived obj=new Derived();
		int res=obj.cal(a);
		if(res==a)
			System.out.print("Strong number");
		else
			System.out.print("Not Strong numbrer");
	}
}
class Derived
{
	int cal(int x)
	{
		int r,f=0;
		while(x>0)
		{
			r=x%10;
			f=f+fact(1,r);
			x=x/10;
		}
		System.out.println("Sum of factorial of all Digits="+f);
		return f;
	}
	int fact(int b,int a)
	{
		if(a==1)
			return b;
		else
			return fact(b*a,--a);
	}
}