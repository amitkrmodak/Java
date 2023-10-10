import java.awt.Frame;
class FrameCreate2 extends Frame
{
	public static void main(String args[])
	{
		System.out.println("Frame creating..");
		 FrameCreate2 fr=new  FrameCreate2();
		fr.setVisible(true);
		//fr.setSize(100,500);
		fr.setBounds(100, 200,500,700);
		System.out.print("Frame creation successful..");
	}
}