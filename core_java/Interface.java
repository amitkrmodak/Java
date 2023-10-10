interface printable
{
	void print();
}
interface showable
{
	void show();
}
class Interface implements printable,showable
{
	public void print()
	{
		System.out.print("Hello");
	}
	public void show()
	{
		System.out.print("Welcome");
	}
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.print();
		obj.show();
	}
}