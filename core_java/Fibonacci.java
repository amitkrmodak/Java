class Fibonacci
{
	static int show(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return (show(n-1)+show(n-2));
	}
	public static void main(String []args)
	{
		int n=6,j=0;
		for(int i=0;i<=n;i++)
		{
			System.out.print(" "+show(j));
			j++;
		}
	}
}
		
			