class OwnExp1
{
	public static void main(String args[])
	{
		try
		{
			Sum obj=new Sum();
			System.out.println(obj.sum(-3,4));
		}
		catch(ExSum e)
		{
			System.out.println("Due to "+e.setMsg()+" "+"Number can't add");
		}
	}
}
class ExSum extends Exception
{
	int a;
	ExSum(int x)
	{
		a=x;
	}
	int setMsg()
	{
		return a;
	}

}
class Sum
{
	int sum(int a,int b) throws ExSum
	{
		if(a<0)
			throw new ExSum(a);
		if(b<0)
			throw new ExSum(b);
		else
			return (a+b);
	}
}