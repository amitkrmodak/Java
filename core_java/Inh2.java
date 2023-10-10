//parameterized constructor in java
class A
{
	A(int y)
	{
		System.out.println("Hi...Awwwwwwwww"+y);
	}
}
class B extends A
{
	B(int x)
	{
		//super(2000);//intializing 10 in A constructor
		this();
		System.out.print("Helloo"+x);
		//this();
	}
	B()
	{
		System.out.println("Default constructor of B");
	}
}
class Inh2
{
	public static void main(String args[])
	{
		B obj=new B();
		//B obj1=new A(20);
		//obj.show();
	}
}