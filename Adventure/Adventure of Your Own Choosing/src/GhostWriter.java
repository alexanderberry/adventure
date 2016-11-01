/**
 * 
 * @author Alexander Berry
 * @version 1.2.0
 * Yet another dependency for the "Adventure of your Own Choosing". Writes a single character of text to a line every
 * random selection between 400 and 550 milliseconds.
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
				Thread.sleep((long) (Math.random() * ((300 - 200) + 1)) + 200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(count < text.length());
		
	}
}
