class Power
{
	int show(int x,int y,int r)
	{
		if(y==0)
			return r;
		else
		{
			r=r*x;
			return show(x,--y,r);
		}
	}
	public static void main(String []args)
	{
		Power obj=new Power();
		int c=obj.show(2,3,1);
		System.out.print("Power="+c);
	}
}