class String_indexOfDemo
{
	public static void main(String args[])
	{
		String str="I am Amit the Modak and I like the java Programming";
		System.out.println("indexOf(t)="+str.indexOf('t'));
		System.out.println("lastIndexOf(t)="+str.lastIndexOf('t'));
		System.out.println("lastIndexOf(t)="+str.lastIndexOf('t'));
		System.out.println("indexOf(the)="+str.indexOf("the"));
		System.out.println("lastIndexOf(the)="+str.lastIndexOf("the"));
		System.out.println("indexOf(t,5)="+str.indexOf('t',5));
		System.out.println("indexOf(the)="+str.indexOf("the",5));
		System.out.println("lastIndexOf(the)="+str.lastIndexOf("the",18));
	}
}