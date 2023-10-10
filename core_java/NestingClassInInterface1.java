interface I1
{
	class Abc
	{
		void show()
		{
			System.out.print("Hii");
		}
	}
}
class NestingClassInInterface1
{
	public static void main(String args[])
	{
		I1.Abc obj=new I1.Abc();
		obj.show();
	}
}