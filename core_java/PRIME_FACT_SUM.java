import java.util.Scanner;
class PRIME_FACT_SUM
{
	public static void main(String argc[])
	{
		int a;
		System.out.print("Enter a number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		Derived obj=new Derived();
		System.out.println("The Prime Factorial of "+a+" are----");
		int res=obj.cal(a);
		System.out.print("\nSum of the prime factorial="+res);
	}
}
class Derived
{
	int cal(int n)
	{
		int f,sum=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				f=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						f=1;
						break;
					}
				}
				if(f==0)
				{
					sum=sum+i;
					System.out.print(" "+i);
				}
			}
		}
		return sum;
	}
}