import java.awt.*;
class FrameCreate1
{
	public static void main(String args[])
	{
		System.out.print("Frame creating..");
		Frame fr=new Frame();
		fr.setVisible(true);
		fr.setSize(100,500);
		fr.setBackground(Color.BLUE);
	}
}