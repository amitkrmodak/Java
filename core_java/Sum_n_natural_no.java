import java.util.*;
class Sum
{
	int cal(int a,int r)
	{
		int c=a;
		if(a==0)
			return r;
		else
			return cal(--a,r+c);
	}
}
class Sum_n_natural_no
{
	public static void main(String argss[])
	{
		int a;
		System.out.print("Enter the number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		Sum obj=new Sum();
		int res=obj.cal(a,0);
		System.out.print("Sum="+res);
	}
}