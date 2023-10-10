import java.util.Scanner;
class Pattern2
{
	public static void main(String[] argc)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the row of the pattern=");
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
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++,k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
	}
}