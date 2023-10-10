import java.util.Scanner;
class Perfect_num
{
	public static void main(string []args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number=");
		a=sc.nextInt();
		Test obj=new Test();
		int res=obj.cal(a);
		if(res==a)
			System.out.print("Perfect number");
		else
			system.out.print("Not Perfect number");
	}
}
Class Test 
{
	static int sum;
	int cal(int n)
	{
		while(n>9)
		{
			n=sum_digit(n);
		}
		return n;
	}
	int sum_digit(int x)
	{
		sum=0;
		while(x!=0)
		{
			sum=sum+(x%10);
			x=x/10;
		}
		return x;
	}
}