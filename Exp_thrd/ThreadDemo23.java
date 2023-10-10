class ThreadDemo23
{
	public static void main(String args[])
	{
		A obj=new A();
		Dev1 obj1=new Dev1(obj);
		Dev2 obj2=new Dev2(obj);
		System.out.println("Before join---");
		System.out.println("Thread one= "+obj1.t.isAlive());
		System.out.println("Thread two= "+obj2.t.isAlive());
		try{
			System.out.println("Waiting thread to finish----");
			obj1.t.join();
			obj2.t.join();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		System.out.println("After join----");
		System.out.println("Thread one= "+obj1.t.isAlive());
		System.out.println("Thread two= "+obj2.t.isAlive());
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
		A obj=new A();
		try{
			for(int i=0;i<5;i++)
			{
				//System.out.println(s+" = "+i);
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
	void cal1(String s,int n)
	{
		System.out.println("A= "+s+" "+n);
	}
	 void cal2(String s,int n)
	{
		System.out.println("A= "+s+" "+n);
	}
}