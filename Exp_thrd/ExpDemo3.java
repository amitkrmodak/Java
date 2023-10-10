import java.util.Scanner;
class ExpDemo3
{
	public static void main(String args[])
	{
		try
		{
			int a=10/0;
			int arr[]={1,2,3};
			arr[5]=40;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Exception caught: "+e);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception caught: "+e);
		}
	}
}