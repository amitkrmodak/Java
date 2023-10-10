import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.*;
import java.awt.Label;
import java.awt.TextField;
class Label1 extends Frame implements ActionListener
{
	public static void main(String args[])
	{
		new Label1();
	}
	TextField id,pass;
	Label id_label,pass_label;
	public Label1()
	{
		setSize(500, 600);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Button b1=new Button();
		b1.setBackground(Color.RED);
		b1.setForeground(Color.YELLOW);
		b1.setLabel("Login");
		b1.addActionListener(this);
		
		id= new TextField(20);
		pass= new TextField(20);
		id_label= new Label("USER ID=");
		pass_label= new Label("PASSWORD=");
		
		add(id_label);
		add(id);
		add(pass_label);
		add(pass);
		add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button Clicked");
	}
}