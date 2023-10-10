class ThreadDemo25
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
		A obj=new A();
		try{
			for(int i=0;i<5;i++)
			{
				obj.cal1();
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
		A obj=new A();
		try{
			for(int i=0;i<5;i++)
			{
				//System.out.println(s+" = "+i);
				obj.cal2(i);
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
	boolean v=false;
	synchronized int cal1()
	{
		while(!v)
		
			try{
				wait();
			}
			catch(Exception e)
			{
				System.out.print("In cal1() exception caught="+e);
			}
		System.out.print("Cal1="+n);
		v=false;
		notify();
		return n;
	}
	synchronized void cal2(int n)
	{
		while(v)
		
			try{
				wait();
			}
			catch(Exception e)
			{
				System.out.print("In cal1() exception caught="+e);
			}
		this.n=n;
		v=true;
		System.out.print("Cal2="+n);
		notify();
	}
}