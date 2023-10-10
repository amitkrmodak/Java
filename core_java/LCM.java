class LCM
{
	static int t;
	static int cal(int a,int b)
	{
		if(a%b==0)
			return a;
		else
			return cal(a+t,b);
	}
	public static void main(String argc[])
	{
		LCM obj=new LCM();
		obj.t=5;
		int res=cal(5,6);
		System.out.print("The lcm of the 2 numbers :"+res);
	}
}

			