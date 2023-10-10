import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;
import java.awt.BorderLayout;
//import java.awt.TextField;
import java.awt.Panel;
class Panel2 extends Frame 
{
	public static void main(String args[])
	{
		new Panel2();
	}
	//TextField id,pass;
	//Label id_label,pass_label;
	Panel n,s,e,w,c;
	public Panel2()
	{
		n=new Panel();
		s=new Panel();
		e=new Panel();
		w=new Panel();
		c=new Panel();
		setSize(500, 600); 
		setVisible(true);
		BorderLayout bl=new BorderLayout();
		setLayout(bl);
		bl.setVgap(10);
		bl.setHgap(10);
		
		n.setPreferredSize(new Dimension(20,50));
		s.setPreferredSize(new Dimension(20,50));
		e.setPreferredSize(new Dimension(20,50));
		w.setPreferredSize(new Dimension(20,50));
		
		
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
		
		System.out.println(bl.getConstraints(n));
		System.out.println(bl.getConstraints(s));
		System.out.println(bl.getConstraints(e));
		System.out.println(bl.getConstraints(w));
		System.out.println(bl.getConstraints(c));
	}
}