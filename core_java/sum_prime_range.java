import java.util.Scanner;
class Derived
{
	int m,f,i,sum=0;
	int cal(int max,int min)
	{
		while(max>=min)
		{
			m=min;f=0;i=2;
			while(i<=m/2)
			{
				if(m%i==0)
				{
					f=1;
					break;
				}
				i++;
			}
			if(f==0)
			{
				System.out.println(m+" ");
				sum=sum+m;
			}
			min++;
		}
		return sum;
	}
}
class sum_prime_range
{
	public static void main(String []argc)
	{
		int res,a,b;
		System.out.print("Enter the range=");
		Scanner sc=new Scanner(System.in);
		Derived obj=new Derived();
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The prime numbers are--");
		if(a>b)
			res=obj.cal(a,b);
		else
			res=obj.cal(b,a);
		System.out.print("The sum of the prime number between "+a+" and "+b+" is="+res);
	}
}