class This_use
{
	Test2() 
	{ 
		this(5); 
		System.out.println("The Default constructor"); 
	} 
	Test2(int x) 
	{ 
		 
		this(5, 15); 
		System.out.println(x); 
	} 
	Test2(int x, int y) 
	{ 
		System.out.println(x * y); 
	}
	public static void main(String args[]) 
	{
		Test2 obj=new Test2(); 
	} 
} 