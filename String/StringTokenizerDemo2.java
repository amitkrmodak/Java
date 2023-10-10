import java.util.*;
class Test
{
	String str1=new String("Welcome to java from java");
	String str2=new String("java");
	StringTokenizer st=new StringTokenizer(str1);
	void cal()
	{
		int count=0;
		while(st.hasMoreTokens()!=false)
		{
			if(st.nextToken().equals(str2))
			{
				count++;
			}
		}
		System.out.print("Count="+count);
	}
}
class StringTokenizerDemo2
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.cal();
	}
}