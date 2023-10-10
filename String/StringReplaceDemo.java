import java.util.*;
class StringReplaceDemo
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("I was Amit");
		sb.replace(2,4,"am");
		System.out.print(sb);
	}
}