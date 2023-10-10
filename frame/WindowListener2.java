import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.Button;
class WindowListener2 extends Frame
{
	public static void main(String args[])
	{
		WindowListener2 wl=new WindowListener2();
		wl.addWindowListener(new MyWindowListener());
	}
	public WindowListener2()
	{
		setBounds(100, 200,500,700);
		setVisible(true);
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