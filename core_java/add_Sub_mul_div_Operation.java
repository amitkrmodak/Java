import java.util.*;
public class add_Sub_mul_div_Operation
{
	public int sum(int x,int y)
	{
		int res=x+y;
		return (res);
	}
	public int mul(int x,int y)
	{
		int res=x*y;
		return (res);
	}
	public int sub(int x,int y)
	{
		int res=x-y;
		return (res);
	}
	public float div(int x,int y)
	{
		float res=(float)x/y;
		return (res);
	}
	public static void main(String argc[])
	{
		int a,b,c;
		System.out.print("Enter two number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		add_Sub_mul_div_Operation obj=new add_Sub_mul_div_Operation();
		c=obj.sum(a,b);
		System.out.print("Summation of the two numbers is=");
		System.out.println(c);
		c=obj.sub(a,b);
		System.out.print("Subtruction of the two numbers is=");
		System.out.println(c);
		c=obj.mul(a,b);
		System.out.print("Multiplication of the two numbers is=");
		System.out.println(c);
		float d=obj.div(a,b);
		System.out.print("The division of the two number is=");
		System.out.println(d);
	}
}