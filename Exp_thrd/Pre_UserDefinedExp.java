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
	int cal(int a,int b) throws ExSum
	{
		if(a<0)
			throw new ExSum(a);
		if(b<0)
			throw new ExSum(b);
		else
			return (a*b);
	}
}
class Pre_UserDefinedExp
{
	public static void main(String args[])
	{
		int a,b,c;
		try
		{
			Cal obj=new Cal();
			System.out.print("Enter any 2 number=");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			c=obj.(a,b);
			System.out.print("Result="+(10/c));
		}
		catch(ArithmeticException exp)
		{
			System.out.print("Cant devided by 0");
		}
		catch(ExSum exp)
		{
			System.out.print(exp.setMsg()+" is a negetive number");
		}
	}
}