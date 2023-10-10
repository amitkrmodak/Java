import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;
class ButtonAction1 extends Frame
{
	public static void main(String args[])
	{
		new ButtonAction1();
	}
	public ButtonAction1()
	{
		setSize(500, 600);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Button b1=new Button();
		b1.setBackground(Color.RED);
		b1.setForeground(Color.YELLOW);
		b1.setLabel("Programming");
		
		add(b1);
		b1.addActionListener(new MyActionListener());
		//add(b1);
	}
	
}
class MyActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button Clicked");
	}
}
