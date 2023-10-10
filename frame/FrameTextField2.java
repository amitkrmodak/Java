import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
class FrameTextField2 extends Frame 
{
	public static void main(String args[])
	{
		new FrameTextField2();
	}
	public FrameTextField2()
	{
		setVisible(true);
		setSize(600, 300);
		setLayout(new FlowLayout());
		TextField tf=new TextField("JAVA");
		add(tf);
		tf.setEditable(true);
		System.out.println(tf.isEditable());
		System.out.println(tf.isEditable());
		System.out.println("The text is: "+tf.getText());
	}
}