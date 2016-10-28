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
		if(ui.takeValidInput("Go through the door to the bridge","Go through the door to the engine room").equals("Go through the door to the bridge"))
		{
			if(hasBridgeKey == true)
			{
				System.out.println("You have now entered the bridge. You can:");
			}
			
			{
				System.out.println("No use, the door's locked");
			}
		}
		
		else
		{
			System.out.println("You are in the engine room. A loud humming surrounds you." +
			"\n You see two doors before you. You can:" +
			"\n Go through the door marked \u001B[1m engine or" +
			"\n Go through the door marked \u001B[1m reactor." + "\n>");
			if(ui.takeValidInput("engine", "reactor").equals("engine"))
			{
				System.out.println("You are in the engine room. You can:");
			}
		}
		
		
		
	}
	 
}
