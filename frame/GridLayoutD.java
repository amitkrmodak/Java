import java.awt.Frame;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Button;
class GridLayoutD extends Frame
{
	public static void main(String args[])
	{
		new GridLayoutD();
	}
	public GridLayoutD()
	{
		setBounds(100, 200,500,700);
		setVisible(true);
		setLayout(new GridLayout(2,3,10,20));
		
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Button("5"));
		add(new Button("6"));
	}
}