import java.util.*;
class Derived
{
	int n;
	int cal()
	{
		int a,s=0;
		while(n!=0)
		{
			a=n%10;
			s=s+(int)(Math.pow(a,3));
			n=n/10;
		}
		System.out.println("Sum="+s);
		return s;
	}
}
class Amstrong 
{
	public static void main(String []argc)
	{
		int b;
		Derived obj=new Derived();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number=");
		obj.n=sc.nextInt();
		int res=obj.cal();
		b=obj.n;
		System.out.println("B="+b);
		if(res==b)
			System.out.print("The number is an amstrong number");
		else
			System.out.print("The number is not an amstrong number");
	}
}
