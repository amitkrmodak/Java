interface I1
{
	class Abc
	{
		void show()
		{
			System.out.print("Hello");
		}
	}
}
class A implements I1
{
	void Mno()
	{
		Abc obj=new Abc();
		obj.show();
	}
}
class NestingClassInInterface2
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.Mno();
	}
}
		