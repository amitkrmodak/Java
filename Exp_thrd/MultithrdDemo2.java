class MultithrdDemo2
{
	public static void main(String args[])
	{
		Gm t1=new Gm();
		Hlw t2=new Hlw();
		Wc t3=new Wc();
		t1.start();
		t2.start();
		t3.start();
	}
}
class Gm extends Thread
{
	synchronized public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Good Morning");
			}
		}
		catch(Exception e)
		{
			System.out.println("In GoodMoring Exception occured");
			System.out.print(e);
		}
	}
}
class Hlw extends Thread
{
	synchronized public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				// sleep(2000);
				System.out.println("Hello");
			}
		}
		catch(Exception e)
		{
			System.out.println("In Hello Exception occured");
			System.out.print(e);
		}
	}
}
class Wc extends Thread
{
	synchronized public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				// sleep(3000);
				System.out.println("Welcome");
			}
		}
		catch(Exception e)
		{
			System.out.println("In Welcome Exception occured");
			System.out.print(e);
		}
	}
}