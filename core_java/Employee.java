import java.util.Scanner;
class Employee
{
	public static void main(String argc[])
	{
		int sal,year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter salary of the employee=");
		sal=sc.nextInt();
		System.out.print("Enter the number of year you work in the company=");
		year=sc.nextInt();
		if(year>5)
		{
			int bonous=sal/20;
			Syste  m.out.print("Your bonous is="+bonous);
		}
		else
			System.out.print("Your service is not more than 5 years");
	}
}