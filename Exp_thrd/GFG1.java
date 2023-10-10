import java.security.*; 
import java.util.*; 
public class GFG1
{ 
	public static void main(String[] argv) 
	{ 
		try
		{
			Signature sr = Signature.getInstance("Amit"); 
			String algo = sr.getAlgorithm(); 
			System.out.println("Algorithm: " + algo); 
		}
		catch (NoSuchAlgorithmException e)
		{
			System.out.println("Exception thrown : " + e); 
		} 
	} 
} 
