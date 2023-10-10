import java.util.*;
class Test
{
	String str=new String("Hello from java");
	StringTokenizer st=new StringTokenizer(str,"ov");
	void cal()
	{
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
class StringTokenizerDemo3
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.cal();
	}
}