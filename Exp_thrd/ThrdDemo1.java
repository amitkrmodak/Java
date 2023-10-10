public class ThrdDemo1 implements Runnable
{
	public void run()
	{
		System.out.print("GFG ");
		System.out.print("Greeks");
	}
	public static void main(String args[])
	{
		ThrdDemo1 obj=new ThrdDemo1();
		Thread th =new Thread(obj);
		th.start();
		System.out.print("Greeks");
		try{
			th.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("For");
	}
}