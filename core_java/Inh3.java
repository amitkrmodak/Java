class A
{
	double a;
	A (int y)
	{
		int x=y;
		a=3.14*x*x;
	}
}
class B extends A
{
	B(int x)
	{
		super (x);
		double res=a*a;
		System.out.print(res);
	}
}
class Inh3
{
	public static void main(String args[])
	{
		B obj=new B(4);
	}
}