class CreatingMainThread
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("Current Thread="+t);
		t.setName("Thread of PS");
		System.out.print("After change="+t);
		for(int i=5;i<0;i++)
			System.out.println(i);
		Thread.sleep(1000);
	}
}