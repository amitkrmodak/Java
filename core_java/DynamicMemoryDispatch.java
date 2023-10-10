class A
{
	void dis()
	{
		System.out.print("Hi");
	}
}
class B extends A
{
	void dis()
	{
		System.out.print("Hello");
	}
}
class DynamicMemoryDispatch
{
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
		obj1.dis();
		obj2.dis();
		obj1=obj2;
		obj1.dis();
		A obj3=new C();
			obj3.dis();	
	}
}