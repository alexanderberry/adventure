/**
 * 
 * @author Alexander Berry
 * @version 1.0.0
 *
 */
public class Game {
	private boolean hasBridgeKey = false;
	ValidUserInput ui = new ValidUserInput();
	
	public Game()
	{
		
	}
	
	public void startGame()
	{
		System.out.println("You wake up in a spaceship in deep space. "
				+ "\nThe view monitors all display deep black. "
				+ "\nThere are two doors. "
				+ "\nYou can go through the door to the bridge or go through the door to the engine room. \n>");
		if(ui.takeValidInput("Go through the door to the bridge").equals("Go through the door to the bridge"))
		{
			if(hasBridgeKey == true)
			{
				System.out.println("You have now entered the bridge. You can:");
			}
		}
		else
		{
			System.out.println("No use, the door's locked");
		}
		
		
		
	}
	 
}
