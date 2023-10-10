class Sum_prime_fact
{
	public static void main(String argc[])
	{
		Derived obj=new Derived();
		int res=fact_cal(15);
		System.out.println("Sum="+res);
	}
}
class Derived
{
	int static fact_cal(int n)
	{
		int a=3,i,sum=0,j,f;
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
					sum=sum+a;
				}
			}
			a++;
		}
		return sum;
	}
}
		
	