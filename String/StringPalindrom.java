class StringPalindrom
{
	public static void main(String args[])
	{
		String str="ABCCBA";
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String str1=new String(sb);
		if(str.equals(str1))
			System.out.print("Palindrom");
		else
			System.out.print("Not Palindrom");
	}
}