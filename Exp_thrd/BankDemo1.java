import java.util.Scanner;
class Myex extends Exception
{
	int y;
	Myex(int x)
	{
		y=x;
	}
	/*public int setMassage()
	{
		return y;
	}*/
}
class Bank
{
	private int Main_balance;
	private int withdrawl_balance;
	private int b;
	Bank(int Main_balance)
	{
		this.Main_balance=Main_balance;
	}
	public void withdrawl(int withdrawl_balance)throws Myex
	{
		//int a;
		this.withdrawl_balance=withdrawl_balance;
		if (this.Main_balance-this.withdrawl_balance<500)
			throw new Myex(this.Main_balance-this.withdrawl_balance);
		else
		{
			Main_balance=Main_balance-this.withdrawl_balance;
			System.out.println("Your curent balance is "+ Main_balance+" thanks for using atm");
		}
	}
}
class BankDemo1
{
	public static void main(String args[]){
		try
		{
			Bank ob=new Bank(5000);
			System.out.print("Enter the amount you want to withdraw=");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			ob.withdrawl(a);
		}
		catch(Myex e)
		{
			System.out.println("You can not withdraw");
		}
	}
}
		
	