import java.util.*;
class Convert
{
    static void cal(int a)
    {
        int y,m,d;
        y=a/365;
        //m=a%365;
        d=a%365;
        m=d/30;
		d=d%30; 
        System.out.print("The result is="+y+" Years"+m+" Months"+d+" days");
    }
    public static void main(String argc[])
    {
        int d;
        System.out.print("Enter the days=");
        Scanner sc=new Scanner (System.in);
        d=sc.nextInt();
        cal(d);
    }
}