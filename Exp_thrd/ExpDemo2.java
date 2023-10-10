class ExpDemo2
{
	public static void main(String args[])
	{
		int a[]={1,2,3};
		try
		{
			try
			{
				a[5]=10;
			}
			catch(ArrayIndexOutOfBoundsException exp)
			{
				System.out.println("In the inner block="+exp);
			}
			int b=10/0;
		}
		catch(ArithmeticException exp)
		{
			System.out.println("In outer block="+exp);
		}
	}
}