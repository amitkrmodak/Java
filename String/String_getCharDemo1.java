class String_getCharDemo1
{
	public static void main(String args[])
	{
		String str="I am Amit Modak";
		int s=5;
		int e=9;
		char ch[]=new char[e-s];
		str.getChars(s,e,ch,0);
		System.out.print(ch);
	}
}