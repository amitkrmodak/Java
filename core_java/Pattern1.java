import java.util.Scanner;
class Pattern1
{
	public static void main(String[] argc)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the last term of the pattern=");
		int a=sc.nextInt();
		Derived obj=new Derived();
		obj.cal(a);
	}
}
class Derived 
{
	void cal(int n)
	{
		int k=0;
		for(int i=0;i<=n;i++)
		{
			for(int j=k+1;j<i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910*/