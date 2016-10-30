/**
 * 
 * @author Alexander Berry
 * @version 0.1.2
 *
 */
public class Game {
	private boolean hasBridgeKey = false;
	private String ending;
	ValidUserInput ui = new ValidUserInput();
	GhostWriter g = new GhostWriter();
	
	public Game()
	{
		
	}
	
	public void startGame()
	{
		System.out.println("Welcome to the game! Let's start!");
		if(ui.takeValidInput("start","leave").equals("start"))
		{
			System.out.println("You wake up in a spaceship in deep space. "
					+ "\nThe view monitors all display deep black. "
					+ "\nThere are two doors. "
					+ "\nYou can go through the door to the bridge or go through the door to the engine room. \n>");
			if(ui.takeValidInput("go through the door to the bridge","go through the door to the engine room").equals("go through the door to the bridge"))
			{
				if(hasBridgeKey == true)
				{
					System.out.println("You have now entered the bridge. You can:");
				}
				else
				{
					System.out.println("No use, the door's locked. You should probably \u001B[1m go back"
							+ "\n>");
					if(ui.takeValidInput("go back").equals("go back"))
					{
						System.out.println("You are back where you started. You think you should probably go to the " + "\n reactor room now.");
						System.out.println("You are in the reactor room. You see a keycard on the floor." +
								"\n You think that you should pick it up.");
					}
				}
			}
			
			else
			{
				System.out.println("You are in the engine room. A loud humming surrounds you." +
				"\n You see two doors before you. You can:" +
				"\n Go through the door marked \u001B[1m engine or" +
				"\n Go through the door marked \u001B[1m reactor." + "\n>");
				String userInput = ui.takeValidInput("engine", "reactor");
				if(userInput.equals("engine"))
				{
					System.out.println("You are in the engine room. You can:");
					//TODO: Implement complete engine room functionality.
				}
				else
				{
					String input = ui.takeValidInput("override reactor control protocols", "look at the reactor", "pick up keycard");
					System.out.println("You are in the reactor room. You see a keycard on the floor." +
					"\n You think that you should pick it up.");
					//TODO: Implement complete reactor room functionality.
				}
			}
		}
		else if (ui.takeValidInput("start","leave").equals("Leave"))
		{
			g.type("Wait, what are you doing? You don't want to leave yet, there's so much more to do!" + "\n>");
			if (ui.takeValidInput("leave").equals("leave"))
			{
				g.type("You're making a horrible mistake" + "\n>");
				if (ui.takeValidInput("leave").equals("leave"))
				{
					g.type("Alright then, I suppose I have to let you go");
					ending = "Don't play the game. Fine then";
					System.out.flush();
					System.out.println("Ending Get: " + "\n" + ending);
				}
				else
				{
					System.out.println("You wake up in a spaceship in deep space. "
							+ "\nThe view monitors all display deep black. "
							+ "\nThere are two doors. "
							+ "\nYou can go through the door to the bridge or go through the door to the engine room. \n>");
					if(ui.takeValidInput("go through the door to the bridge","go through the door to the engine room").equals("go through the door to the bridge"))
					{
						if(hasBridgeKey == true)
						{
							System.out.println("You have now entered the bridge. You can:");
						}
						else
						{
							System.out.println("No use, the door's locked. You should probably \u001B[1m go back"
									+ "\n>");
							if(ui.takeValidInput("go back").equals("go back"))
							{
								System.out.println("You are back where you started. You think you should probably go to the " + "\n reactor room now.");
								System.out.println("You are in the reactor room. You see a keycard on the floor." +
										"\n You think that you should pick it up.");
							}
						}
					}
					
					else
					{
						System.out.println("You are in the engine room. A loud humming surrounds you." +
						"\n You see two doors before you. You can:" +
						"\n Go through the door marked \u001B[1m engine or" +
						"\n Go through the door marked \u001B[1m reactor." + "\n>");
						String userInput = ui.takeValidInput("engine", "reactor");
						if(userInput.equals("engine"))
						{
							System.out.println("You are in the engine room. You can:");
							//TODO: Implement complete engine room functionality.
						}
						else
						{
							String input = ui.takeValidInput("override reactor control protocols", "look at the reactor", "pick up keycard");
							System.out.println("You are in the reactor room. You see a keycard on the floor." +
							"\n You think that you should pick it up.");
							//TODO: Implement complete reactor room functionality.
						}
					}
				}
			}
			else
			{
				System.out.println("You wake up in a spaceship in deep space. "
						+ "\nThe view monitors all display deep black. "
						+ "\nThere are two doors. "
						+ "\nYou can go through the door to the bridge or go through the door to the engine room. \n>");
				if(ui.takeValidInput("go through the door to the bridge","go through the door to the engine room").equals("go through the door to the bridge"))
				{
					if(hasBridgeKey == true)
					{
						System.out.println("You have now entered the bridge. You can:");
					}
					else
					{
						System.out.println("No use, the door's locked. You should probably \u001B[1m go back"
								+ "\n>");
						if(ui.takeValidInput("go back").equals("go back"))
						{
							System.out.println("You are back where you started. You think you should probably go to the " + "\n reactor room now.");
							System.out.println("You are in the reactor room. You see a keycard on the floor." +
									"\n You think that you should pick it up.");
						}
					}
				}
				
				else
				{
					System.out.println("You are in the engine room. A loud humming surrounds you." +
					"\n You see two doors before you. You can:" +
					"\n Go through the door marked \u001B[1m engine or" +
					"\n Go through the door marked \u001B[1m reactor." + "\n>");
					String userInput = ui.takeValidInput("engine", "reactor");
					if(userInput.equals("engine"))
					{
						System.out.println("You are in the engine room. You can:");
						//TODO: Implement complete engine room functionality.
					}
					else
					{
						String input = ui.takeValidInput("override reactor control protocols", "look at the reactor", "pick up keycard");
						System.out.println("You are in the reactor room. You see a keycard on the floor." +
						"\n You think that you should pick it up.");
						//TODO: Implement complete reactor room functionality.
					}
				}
			}
		}
	
		
		
		
		
	}
	 
}
