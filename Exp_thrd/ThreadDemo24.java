class ThreadDemo24
{
	public static void main(String args[])
	{
		A obj=new A();
		Dev obj1=new Dev(obj,"Thread1");
		Dev obj2=new Dev(obj,"Thread2");
		Dev obj3=new Dev(obj,"Thread3");
		Dev obj4=new Dev(obj,"Thread4");
		Dev obj5=new Dev(obj,"Thread5");
		Dev obj6=new Dev(obj,"Thread6");
		Dev obj7=new Dev(obj,"Thread7");	
	}
}
class Dev implements Runnable
{
	Thread t;
	A obj=new A();
	String s;
	Dev(A a,String msg)
	{
		obj=a;
		s=msg;
		t=new Thread(this,"Thread1");
		t.start();
	}
	public void run()
	{
		synchronized(obj)
		{
			obj.cal(s);
		}
	}
}
class A
{
	void cal(String s)
	{
		System.out.println("A= "+s);
	}
}