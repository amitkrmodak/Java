import java.util.Scanner;
class Perfect_number
{
	public static void main(String argc[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number=");
		a=sc.nextInt();
		Derived obj=new Derived();
		obj.cal(a);
	}
}
class Derived
{
	void cal(int n)
	{
		while(n>9)
		{
			n=sum(n);
		}
		if(n==1)
			System.out.print("It is a perfect number");
		else
			System.out.print("It is not a perfect number");
	}
	int sum(int a)
	{
		int r=0;
		while(a!=0)
		{
			r=r+a%10;
			a=a/10;
		}
		return r;
	}
}