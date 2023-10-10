class ThreadDemo22
{
	public static void main(String args[])
	{
		A obj=new A();
		new Dev1(obj);
		new Dev2(obj);
	}
}
class Dev1 implements Runnable
{
	Thread t;
	A obj=new A();
	Dev1(A a)
	{
		obj=a;
		t=new Thread(this,"Thread1");
		t.start();
	}
	public void run()
	{
		try{
			for(int i=0;i<5;i++)
			{
				obj.cal1("Thread1",i);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
class Dev2 implements Runnable
{
	Thread t;
	A obj=new A();
	Dev2(A a)
	{
		obj=a;
		t=new Thread(this,"Thread2");
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				obj.cal2("Thread2",i);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
class A
{
	synchronized void cal1(String s,int n)
	{
		System.out.println("A= "+s+" "+n);
	}
	synchronized void cal2(String s,int n)
	{
		System.out.println("A= "+s+" "+n);
	}
}