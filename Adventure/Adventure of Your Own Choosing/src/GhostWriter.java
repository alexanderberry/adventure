/**
 * 
 * @author Alexander Berry
 * @version 1.0.0
 * Yet another dependency for the "Adventure of your Own Choosing". Writes a single character of text to a line every
 * 400 milliseconds.
 * 
 */
public class GhostWriter {
	public GhostWriter()
	{
		
	}
	public void type(String...text)
	{
		for(int i = 0; i > text.length; i++)
		{
			String charToType = text.toString().substring(i, i + 1);
			System.out.print(charToType);
			try 
			{
				Thread.sleep(400);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			type();
		}
	}
}
