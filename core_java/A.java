import java.io.*;
class A
{
	public static void main(String args[])
	{
		System.out.println("Using BufferedReader");
		B obb=new B();
		obb.display();
		System.out.println("Using DataInputStream");
		D obd=new D();
		obd.setdata();
	}
}
class B
{
	int a;
	InputStreamReader ip=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ip);
	void setdata()
	{
		System.out.print("Enter a value=");
		try
		{
			a=Integer.parseInt(br.readLine());
		}
		catch(Exception exp)
		{
			System.out.print("Io exception occured in B");
			System.out.print("Io exception occured in B");
		}
		display();
	}
	void display()
	{
		System.out.println("A="+a);
	}
}
class D
{
	int b;
	
	void setdata()
	{
		System.out.print("Enter a vaqlue=");
		try
		{
			DataInputStream d=new DataInputStream(System.in);
			b=Integer.parseInt(d.readLine());
		}
		catch(Exception exp)
		{
			System.out.print("Io exception occured in D");
		}
		display();
	}
	void display()
	{
		System.out.println("B="+b);
	}
}