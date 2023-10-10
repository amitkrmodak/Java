import java.util.*;
class Exam
{
	static int i;
	public static void main(String[] args)
	{
		Derived obj=new Derived();
		int r=obj.name_in();
		if(r==1)
			obj.cal();
	}
}
class Derived

{
	//static int k=0;
	int i;
	int u_ans[]=new int[20];
	//int c_ans[]=new int [20];
	String c;
	//int u_ans[];
	int c_ans[]={3,2,1,1,4,2,4,1,4,3,2,1,1,3,2,4,4,1,3,3};
	Scanner sc=new Scanner(System.in);
	int name_in()
	{
		int n;
		System.out.print("Enter your name sir=");
		c=sc.nextLine();
		System.out.print("I am AMIT KUMAR MODAK,CEO of MODAK PVT LTD\n\n");
		System.out.println("You will get 4 option of each question");
		System.out.println("Enter your answer and if you want to skip then enter any number except 1,2,3 and 4");
		System.out.println("Now,Mr. "+c+" lets start the exam");
		System.out.print("Are you ready(1/0)");
		n=sc.nextInt();
		return n;
	}
	void cal()
	{
		System.out.println("\t\t\t EXAM START---------------------------");
		int n;
		for(i=0;i<20;i++)
		{
			System.out.println("Here your "+(i+1)+" question---");
			question(i+1);
			System.out.print("Enter your answer=");
			n=sc.nextInt();
			if(n>=1&&n<=4)
				u_ans[i]=n;
			else	
				u_ans[i]=0;
		}
		for(int j=0;j<4;j++)
		{
			System.out.println("Here you can display or upgrade your answer onlu 3 times");
			System.out.println("Enter 1 for display your answer");
			System.out.println("Enter 2 for upgrade your answer");
			System.out.println("Enter any to quit the exam");
			System.out.print("Enter your choice=");
			n=sc.nextInt();
			if(j!=3)
			{
				if(n==1)
					display();
				else if(n==2)
					upgrade();
				else
				{
					ansCheck();
					break;
				}
			}
			else
			{
				System.out.println("Sorry no more chance to UPGRADE or DISPLAY your answer");
				ansCheck();
			}
		}
	}
	void question(int n)
	{
		switch(n)
		{
			case 1:
				System.out.println("When the 1st World war start?");
				System.out.println("1> September 1,1939		2> November 11,1914");
				System.out.println("3> July 28,1914		4> June 26,1914");
				//c_ans[m]=3;
				break;
			case 2:
				System.out.println("In 1860 in which state Petrolium was first discoverd in India?");
				System.out.println("1> Madhya Pradesh		2> Assam");
				System.out.println("3> Jharkhand		4> Bihar");
				//c_ans[m]=2;
				break;
			case 3:
				System.out.println("Which country first introduce constitution?");
				System.out.println("1> USA		2> Japan");
				System.out.println("3> England 		4> China");
				//c_ans[m]=1;
				break;
			case 4:
				System.out.println("Out of total blood capacity,what is persentage of Plasma?");
				System.out.println("1> 60%		2> 40%");
				System.out.println("3> 70%		4> None of these");
				//c_ans[m]=1;
				break;
			case 5:
				System.out.println("Which date is delared as income tax day in India?");
				System.out.println("1> May 12		2> August 29");
				System.out.println("3> March 6		4> July 24");
				//c_ans[m]=4;
				break;
			case 6:
				System.out.println("Which device Douglas Engelbart invent?");
				System.out.println("1> Memory card		2> Computer Mouse");
				System.out.println("3> Joystick		4> None of these");
				//c_ans[m]=2;
				break;
			case 7:
				System.out.println("When Bhoodan Movement was started?");
				System.out.println("1> April 10,1953		2> January 23,1955");
				System.out.println("3> April 27,1953		4> April 18,1951");
				//c_ans[m]=4;
				break;
			case 8:
				System.out.println("After Hindi, which is most used language in india?");
				System.out.println("1> Bengali		2> Tamil");
				System.out.println("3> Telegu		4> Rajasthani");
				//c_ans[m]=1;
				break;
			case 9:
				System.out.println("Which is called the 'Water Tower' of the Ganga River?");	
				System.out.println("1> Uttarakhand		2> Haridwar");
				System.out.println("3> Rishikesh		4> Nepal");
				//c_ans[m]=4;
				break;
			case 10:
				System.out.println("With which game Copa America is associated?");
				System.out.println("1> Tenis		2> Golf");
				System.out.println("3> Football		4> None of these");
				//c_ans[m]=3;
				break;
			case 11:
				System.out.println("Which Mughal king built Jama Masjid?");
				System.out.println("1> Akbar		2> Shah Jahan");
				System.out.println("3> Aurangzeb		4> Jahangir");
				//c_ans[m]=2;
				break;
			case 12:
				System.out.println("In China when Red Revolution took place?");
				System.out.println("1> 1949		2> 1945");
				System.out.println("3> 1946		4> 1950");
				//c_ans[m]=1;
				break;
			case 13:
				System.out.println("What is the normal blood pressure of human?");
				System.out.println("1> 120/80		2> 100/70");
				System.out.println("3> 120/70		4> 100/70");
				//c_ans[m]=1;
				break;
			case 14:
				System.out.println("Which country is not parmanent member of the United Nation Security council?");
				System.out.println("1> France		2> China");
				System.out.println("3> Japan		4> None of these");
				//c_ans[m]=3;
				break;
			case 15:
				System.out.println("Which is in first position for producing milk in the world?");
				System.out.println("1> Austraila		2> India");
				System.out.println("3> Srilanka		4> England");
				//c_ans[m]=2;
				break;
			case 16:
				System.out.println("In which year the freedom fighter Sukhdev Sing was hanged?");
				System.out.println("1> 1934		2> 1932");
				System.out.println("3> 1933		4> 1931");
				//c_ans[m]=4;
				break;
			case 17:
				System.out.println("In which year partition of Bengal was cancelled?");
				System.out.println("1> 1918		2> 1915");
				System.out.println("3> 1910		4> 1911");
				//c_ans[m]=4;
				break;
			case 18:
				System.out.println("Through Radcliffe Line Which country was seperated by India?");
				System.out.println("1> Pakistan		2> Nepal");
				System.out.println("3> China		4> Bhutan");
				//c_ans[m]=1;
				break;
			case 19:
				System.out.println("Where the famouse Sun Temple is situated?");
				System.out.println("1> Nalanda		2> Agra");
				System.out.println("3> Konark	4> Delhi");
				//c_ans[m]=3;
				break;
			case 20:
				System.out.println("Who is the writer of 'Post Office'?");
				System.out.println("1> Kazi Nazrul Islam		2> Jibananda Das");
				System.out.println("3> Rabindranath Tagore		4> Sukumar Ray");
				//c_ans[m]=3;
				break;
		}
	}
	void display()
	{
		System.out.println("\t\t\t DISPLAY---------------------------");
		int j;
		for(i=0;i<20;i++)
		{
			j=i+1;
			System.out.println("Your "+j+" question details");
			question(j);
			if(u_ans[i]==0)
				System.out.println("Your option=None");
			else
				System.out.println("\t\tYour option="+u_ans[i]);
		}
	}
	void upgrade()
	{
		System.out.println("\t\t\t UPGRADE---------------------------");
		int n,j;
		for(i=0;i<20;i++)
		{
			j=i+1;
			System.out.println("Your "+j+" question details");
			question(j);
			if(u_ans[i]==0)
				System.out.println("Your option=None");
			else
				System.out.println("Your option="+u_ans[i]);
			System.out.println("Press 1 if you want to change your answer");
			System.out.println("Press 2 for exit from exam");
			System.out.println("Press any to continue");
			System.out.println("Enter your choice=");
			n=sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter 0 for None answer otherwise enter your answer=");
				u_ans[i]=sc.nextInt();
			}
			else if(n==2)
			{
				System.out.println("You decided to left from the exam");
				ansCheck();
			}
		}
		System.out.println("--------------------");
	}
	void ansCheck()
	{
		System.out.println("\t\t\t RESULT---------------------------");
		int marks=0;
		int n;
		for(i=0;i<20;i++)
		{
			if(u_ans[i]!=0)
			{
				if(u_ans[i]==c_ans[i])
					marks=marks+2;
				else
					marks=marks-1;
			}
		}
		System.out.println("your total marks="+marks);
		System.out.println("Enter 1 to show the correct answer otherwise enter any key");
		System.out.print("Enter your choice=");
		n=sc.nextInt();
		for(i=0;i<20;i++)
		{
			question(i+1);
			if(u_ans[i]==0)
			{
				System.out.println("No answer");
				System.out.println("Correct="+c_ans[i]);
			}
			else if(u_ans[i]==c_ans[i])
				System.out.println("Correct answer");
			else
			{
				System.out.println("Wrong answer");
				System.out.println("Correct="+c_ans[i]);
			}
		}
	}
}