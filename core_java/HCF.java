import java.util.*;
class HCF
{
	public static int cal(int a,int b)
	{
		if(a%b==0)
			return b;
		else
			return cal(b,a%b);
	}
	public static void main(String argc[])
	{
		int num1,num2,res;
		System.out.print("Enter the 2 numbers=");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=cal(num1,num2);
		System.out.print("The HCF of the 2 number is=");
		System.out.print(res);
	}
}