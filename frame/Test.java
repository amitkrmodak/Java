class Test
{
	public static void main(String args[])
	{
		StringBuffer s1=new StringBuffer("Amit");
		StringBuffer s2=new StringBuffer("Amit");
		// String s2=new String("Amit");
		// String s2="Amit";
		System.out.print(s1==s2);
		System.out.print(s1.equals(s2));
		
	}
}