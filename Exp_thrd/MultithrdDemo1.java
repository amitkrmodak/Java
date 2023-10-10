class Dev extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
public class MultithrdDemo1
{
	public static void main(String args[])
	{
		for(int i=0;i<8;i++)
		{
			Dev obj=new Dev();
			obj.start();
		}
	}
}