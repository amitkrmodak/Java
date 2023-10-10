import java.awt.Frame;
//import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;
import java.awt.BorderLayout;
//import java.awt.TextField;
import java.awt.Panel;
class Panel1 extends Frame 
{
	public static void main(String args[])
	{
		new Panel1();
	}
	//TextField id,pass;
	//Label id_label,pass_label;
	Panel n,s,e,w,c;
	public Panel1()
	{
		n=new Panel();
		s=new Panel();
		e=new Panel();
		w=new Panel();
		c=new Panel();
		
		setSize(500, 600);
		setVisible(true);
		setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		
		n.setBackground(Color.BLUE);
		s.setBackground(Color.RED);
		e.setBackground(Color.GRAY);
		w.setBackground(Color.ORANGE);
		c.setBackground(Color.YELLOW);
		
		add(n, BorderLayout.NORTH);
		add(s, BorderLayout.SOUTH);
		add(e, BorderLayout.EAST);
		add(w, BorderLayout.WEST);
		add(c, BorderLayout.CENTER);
	}
}