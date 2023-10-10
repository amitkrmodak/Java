class Bike
{
	//int i,j;
	void dis1()
	{
		System.out.println("In Bike class");
	}
}
class Honda extends Bike
{
	//int k;
	void dis2()
	{
		System.out.println("In Honda class");
		//System.out.println("i="+i+" j="+j);
	}
}
class Extend1
{
	public static void main(String[] args)
	{
		Bike objb=new Bike();
		Honda objh=new Honda();
		System.out.println("Using honda class object");
		objh.dis1();
		objh.dis2();
		System.out.println("Using bike class object");
		objb.dis1();
		//objb.dis2();
		
	}
}