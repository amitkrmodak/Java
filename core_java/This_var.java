class A
{
	int a;
	void show(int a)
	{
		int b=10;
		this.a=b;
		System.out.print(this.a);
	}
}
class This_var
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.show(5);
	}
}