import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class SampleFrame extends Frame
{
	SampleFrame(Strinf title)
	{
		super (title);
		addWindowListener(adapter);
	}
	public void paint (graphics g)
	{
		g.drawString("This ia in frame window");
	}
}
class MyWindowAdapter extends WindowAdapter
{
	SampleFrame sampleFrame;
	public MyWindowAdapter(SampleFrame sampleFrame)
	{
		this.sampleFrame = sampleFrame;
	}
}
public class AppletFrame extends AppletFrame{
{
	Frame f;
	public void init()
	{
		f=new SampleFrame("A Frame Window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is in Applet window", 10,20);
	}
}
class Test
{
		public static void main(String args[])
	{
		AppletFrame obj = new AppletFrame();
		obj.init();
		obj.start();
		obj.paint(obj);
		obj.stop();
		new MyWindowAdapter();
	}
}