//package project1;
import java.util.Scanner;
public class Out2InnerClass
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		Derived objd=new Derived();
		Derived res=objd.connect(a);
		System.out.print("Result="+res.b);
	}
}
class Derived
{
	int b;
	class Mno
	{
		int y;
		Mno cal(int x)
		{
			Mno temp=new Mno();
			temp.y=x+5;
			return (temp);
		}
	}
	Derived connect(int n)
	{
		Derived objd=new Derived();
		Mno objm=new Mno();
		Mno res=objm.cal(n);
		objd.b=res.y;
		return objd;
	}
}