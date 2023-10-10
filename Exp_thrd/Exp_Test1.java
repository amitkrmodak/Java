class Exp_Test1
{
	public static void main(String args[])
	{
		try
		{
			int a,b;
			a=args.length;
			System.out.println("try 1.1 block");
			System.out.println("a1="+a);
			b=42/a;
			System.out.println("a2="+a);
			System.out.println("try 1.2 block");
			try{
				if(a==1)
				{
					System.out.println("try 2 if 1.1 block");
					a=a/(a-a);
					System.out.println("try 2 if 1.2 block");
				}
				e
				{
					System.out.println("try 2 if 2.1 block");
					int c[]= {1};
					c[42]=99;
					System.out.println("try 2 if 2.2 block");

				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("1st exception caught---"+e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("2nd exception caught--"+e);
		}
	}
}