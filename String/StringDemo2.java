class StringDemo2
{
	public static void main(String args[])
	{
		Dev obj=new Dev();
		obj.cal();
	}
}
class Dev
{
	String s="Amit Modak";
	int n=s.length();
	char ch;
	void cal()
	{
		for(int i=0;i<n;i++)
		{
			ch=s.charAt(i);
			if(Character.isLowerCase(ch))
				System.out.print(Character.toUpperCase(ch));
			else
				System.out.print(Character.toLowerCase(ch));
		}
	}
}