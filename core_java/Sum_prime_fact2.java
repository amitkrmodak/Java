import java.util.Scanner;
class Sum_prime_fact2
{
	public static void main(String argc[])
	{
		int a;
		Derived obj=new Derived();
		System.out.print("Enter a number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Prime fact are--");
		int res=obj.fact_check();
		System.out.print("Sum="+res);
	}
}
class Derived
{
	static int sum=0;
	Sum_prime_fact2 obj2=new Sum_prime_fact2();
	int fact_check()
	{
		int r;
		for(int i=3;i<=obj2.a;i++)
		{
			if(obj2.a%i==0)
				sum=sum+prime_check(i);
		}
		return sum;
	}
	int prime_check(int a)
	{
		int f=1;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				f=0;
				break;
			}
		}
		if(f==1)
		{	
			System.out.print(" "+a);
			return a;
		}
		else
			return 0;
	}
}