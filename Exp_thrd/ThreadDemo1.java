class ThreadDemo1
{
	public static void main(String args[])
	{
		new Dev("one");
		// new Dev("two");
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main thread="+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
class Dev implements Runnable
{
	Thread t;
	Dev(String str)
	{
		t=new Thread(this,str);
		t.start();
		System.out.print("Thread="+t);
	}
	public void run()
	{
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println("Chile thread="+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}