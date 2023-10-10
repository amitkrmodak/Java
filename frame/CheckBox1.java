import java.awt.Frame;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.Checkbox;
import java.awt.event.*;
import java.awt.Button;
import java.awt.*;
class CheckBox1 extends Frame implements ActionListener
{
	Checkbox c1,c2,c3;
	Label lb;	
	Button b;
	public static void main(String args[])
	{
		CheckBox1 ch=new CheckBox1();
		ch.addWindowListener(new MyWindowListener());
	}
	
	private void init()
	{
		c1=new Checkbox("C++");
		c2=new Checkbox("JAVA");
		c3=new Checkbox("PYTHON");
		b=new Button("okk");
		lb=new Label("Select any cource");
		//setActionOnButton();
	}
	/*private void setActionOnButton()
	{
		b.addActionListener(new ActionListener()
		{
			public void ActionPerformed(ActionEvent ev)
			{
				System.out.println("Button is clicked");
			}
		});
	}*/
	CheckBox1()
	{
		setBounds(100, 200,500,700);
		setVisible(true);
		init();
		setLayout(new GridLayout(5, 1, 10, 10));
		add(lb);
		add(c1);
		add(c2);
		add(c3);
		add(b);
		
	}
}
class MyWindowListener implements WindowListener
{
	public void windowActivated(WindowEvent ev)
	{
		System.out.println("Window is activated");
	}
	public void windowDeactivated(WindowEvent ev)
	{
		System.out.println("Window is deactivated");
	}
	public void windowOpened(WindowEvent ev)
	{
		System.out.println("Window is opened");
	}
	public void windowIconified(WindowEvent ev)
	{
		System.out.println("Window is iconified");
	}
	public void windowDeiconified(WindowEvent ev)
	{
		System.out.println("Window is deiconified");
	}
	public void windowClosed(WindowEvent ev)
	{
		System.out.println("Window is closed");
	}
	public void windowClosing(WindowEvent ev)
	{
		System.out.println("Window is closing");
		ev.getWindow().dispose();
	}
}