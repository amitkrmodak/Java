import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
class FlowLayout1 extends Frame
{
	public static void main(String args[])
	{
		System.out.println("Frame creating..");
		 FrameLayout1 fr=new  FrameLayout1();
		fr.setVisible(true);
		//fr.setSize(100,500);
		fr.setBounds(100, 200,500,700);
		//System.out.print("Frame creation successful..");
		fr.setLayout(new FlowLayout());
		TextField tf1=new TextField("AMIT");
		TextField tf2=new TextField(" KUMAR");
		TextField tf3=new TextField(" MODAK");
		fr.add(tf1);
		fr.add(tf2);
		fr.add(tf3);
	}
}