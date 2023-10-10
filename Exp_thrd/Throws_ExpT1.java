class Throws_ExpT1
{
	public static void main(String args[])throws InterruptedException;
	{
		thread sleep(10);
		System.out.print("My Name");
	}
}
class Test
{
	static void fun()throws IllegalAccessException
	{
		System.out.print("Inside fun");
		throw new IllegalAccessException("Demo");
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessException exp)
		{
			System.out.print("CAtch in main");
		}
	}
}