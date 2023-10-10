class Super
{
	double area;
	A(int x)
	{
		area=3.14*x*x;
	}
}
class B extends A
{
	B(int y)
	{
		super(y);
		double res=(area*area);
		System.out.print("Res="+res);
	}
}
class Test1
{
	public static void main(String args[])
	{
		B obj=new B(4);
	}
}
	