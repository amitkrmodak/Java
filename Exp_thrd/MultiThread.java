class TA extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==1)
				yield();
			System.out.println("i="+i);
		}
		System.out.println("Exit from TA");
	}
}
class TB extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("j="+j);
			if(j==3)
				stop();
		}
		System.out.println("Exit from Tb");
	}
}
class TC extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.print("k="+k);
			if(k==1)
			{
				try
				{
					sleep(1000);
				}
				catch(Exception exp)
				{}
			}
		}
		System.out.print("Exit from TC");
	}
}
class MultiThread
{
	public static void main(String args[])
	{
		System.out.print("Start main");
		System.out.println("Start TA");
		TA ob1=new TA();
		ob1.start();
		System.out.println("Start TB");
		TB ob2=new TB();
		ob2.start();
		System.out.print("Start TC");
		TC ob3=new TC();
		ob3.start();
		System.out.print("Exit from main");
	}
}