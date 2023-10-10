class Throw_ExpT1
{
	static void fun()
	{
		try
		{
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException exp)
		{
			System.out.print("Catch inside function()");
			throw exp;
		}
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(NullPointerException exp)
		{
			System.out.print("Catch in main");
		}
	}
}