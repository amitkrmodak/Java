import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExp
{
	public FileInputStream testMethod1(){
		File file = new File("test.txt");
		FileInputStream fileInputStream = null;
		try
		{
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}
		catch (IOException e)
		{			
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (fileInputStream != null){
					fileInputStream.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return fileInputStream;
	}
	public static void main(String[] args){
		IOExp instance1 = new IOExp();
		instance1.testMethod1();
	}
}