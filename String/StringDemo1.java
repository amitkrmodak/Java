class StringDemo1
{
	public static void main (String args[])
	{
		String s1="I am Amit Modak, from APC college ";
		int s=10;
		int e=14;
		char ch[]=new char[5];
		s1.getChars(s,e,ch,0);
		System.out.print(ch);
		System.gc();
	}
}