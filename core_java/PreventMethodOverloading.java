class A
{
	void show()
	{
		System.out.print("in A");
	}
	}
class B extends A
{
	void show()
	{
		System.out.println("in B");
		super.show();
	}
}
class PreventMethodOverloading
{
	public static void main(String args[])
	{
		B objB=new B();
		objB.show();
	}
}
