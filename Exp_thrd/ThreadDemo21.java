class ThreadDemo21
{
	public static void main(String args[])
	{
		new Dev("one",1);
		new Dev("two",4);
	}
}
class Dev implements Runnable
{
	Thread t;
	String s;
	Dev(String str,int n)
	{
		t=new Thread(this,str);
		s=str;
		t.setPriority(n);
		t.start();
		System.out.println("Thread="+t+" Prority="+t.getPriority());
	}
	public void run()
	{
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println(s+" = "+i);
				//Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}