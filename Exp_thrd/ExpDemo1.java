class ExpDemo1
{
	public static void main(String args[])
	{
		Dev obj=new Dev();
		try{
			obj.cal();
		}
		catch(Exception e)
		{
			System.out.println("In main method="+e);
		}
	}
}
class Dev
{
	 void cal() //throws ArithmeticException
	{
		try{
			int b=10/0;
			throw new ArithmeticException("Demo");
		}
		catch(ArithmeticException e)
		{
			System.out.println("In cal method="+e);
			throw(e);
		}
	}
}