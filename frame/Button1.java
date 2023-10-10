import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
class Button1
{
	public static void main(String args[])
	{
		Frame fr=new Frame();
		fr.setBounds(100, 200,500,700);
		fr.setVisible(true);
		fr.setLayout(new FlowLayout());
		
		Button b1=new Button("java");
		Button b2=new Button();
		
		b1.setPreferredSize(new Dimension(700,700));
		b2.setPreferredSize(new Dimension(100,70));
		
		b1.setBackground(Color.RED);
		b1.setForeground(Color.YELLOW);
		b2.setForeground(Color.BLUE);
		b2.setBackground(Color.GRAY);
		
		fr.add(b1);
		fr.add(b2);
		
		b1.setEnabled(false);
		b2.setEnabled(true);
		
		b1.setVisible(true);
		b2.setLabel("PRogramming");
		
		String str1=b1.getLabel();
		String str2=b2.getLabel();
		
		System.out.println(str1);
		System.out.println(str2);
	}
}