import java.util.Scanner;
class ExSum extends Exception
{
	int a;
	ExSum(int x)
	{
		a=x;
	}
	int setMsg()
	{
		return a;
	}
}
class Cal
{
	int sum(int a,int b) throws ExSum
	{
		if(a<0)
			throw new ExSum(a);
		if(b<0)
			throw new ExSum(b);
		else
			return (a+b);
	}
}
class UserDefinedExp
{
	public static void main(String args[])
	{
		int a,b;
		try
		{
			Cal obj=new Cal();
			System.out.print("Enter any 2 number=");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.print("Result="+obj.sum(a,b));
		}
		catch(ExSum exp)
		{
			System.out.print(exp.setMsg()+" is a negetive number, So the number cant add");
		}
	}
}