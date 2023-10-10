class MyException extends Exception
{
	String str1;
	MyException(String str2)
	{
		str1=str2;
	}
	public String to_string()
	{
		return ("my exception occured="+str1);
	}
}
class ExpT1
{
	public static void maian (String agrs[])
	{
		try
		{
			System.out.println("Starting the try block");
			throw new MyException("This is my error");
		}
		catch(MyException exp)
		{
			System.out.print("Catch block");
			System.out.print(exp);
		}
	}
}