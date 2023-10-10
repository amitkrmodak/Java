import java.util.*;
class Prime_fact
{
	public static void main(String argc[])
	{
		int a;
		Derived obj=new Derived();
		System.out.print("Enter a number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Prime fact are--");
		obj.fact_cal(a);
	}
}
class Derived
{
	void fact_cal(int n)
	{
		int a=3,i,j,f;
		while(a<=n)
		{
			j=2;
			if(n%a==0)
			{
				i=2;
				f=0;
				while(i<=a/2)
				{
					if(a%i==0)
					{
						f=1;
						break;
					}
					i++;
				}
				if(f==0)
				{
					System.out.print(" "+a);
				}
			}
			a++;
		}
	}
}
		
	