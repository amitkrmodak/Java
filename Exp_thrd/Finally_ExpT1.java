class Finally_ExpT1
{
	public static void main(String args[])
	{
		try
		{
			int num=121/0;
			System.out.println(num);
		}
		catch(ArithmeticException exp)
		{
			System.out.println("Number should by devided by 0");
		}
		finally
		{
			System.out.println("In Finally block");
		}
		System.out.println("Out of catch block");
	}
}
	