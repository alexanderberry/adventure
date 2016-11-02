/**
 * 
 * @author Alexander Berry
 * @version 1.2.0
 * Yet another dependency for the "Adventure of your Own Choosing". Writes a single character of text to a line every
 * random selection between 300 and 100 milliseconds.
 * 
 */
public class GhostWriter {
private String charToType;	
	public GhostWriter()
	{
		
	}
	public void type(String text)
	{
		int count = 0;
		do
		{
		charToType = text.substring(count, count + 1);
		count++;
			System.out.print(charToType);
			try {
				Thread.sleep((long) (Math.random() * ((300 - 100) + 1)) + 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while(count < text.length());
		
	}
}
