import java.awt.Frame;
class FrameDemo1 extends Frame
{
	public static void main(String args[])
	{
		System.out.println("Frame creating..");
		 FrameDemo1 fr=new  FrameDemo1();
		fr.setVisible(true);
		//fr.setSize(100,500);
		fr.setBounds(100, 200,500,700);
		System.out.print("Frame creation successful..");
	}
}