class A
{
	final int x=20;
}
class B extends A
{
	int x;
	void show()	{
		x=10;
		System.out.print("Base :"+super.x);
		System.out.print("Child :"+x);
	}
}
class Inh1
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}