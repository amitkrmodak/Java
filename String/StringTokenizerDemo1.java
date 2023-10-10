import java.util.*;
class Test
{
	String str=new String("Hello from java");
	StringTokenizer st=new StringTokenizer(str);
	void cal()
	{
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
class StringTokenizerDemo1
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.cal();
	}
}