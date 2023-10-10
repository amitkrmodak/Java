import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.Button;
class WindowListener1 extends Frame 
{
	public static void main(String args[])
	{
		WindowListener1 wl=new WindowListener1();
		wl.addWindowListener(new WindowListener()
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
				wl.dispose();
			}
		}
		);
	}
	public WindowListener1()
	{
		setBounds(100, 200,500,700);
		setVisible(true);
	}
}