/**
 * 
 * @author Alexander Berry
 * @version 0.1.3
 * A choose your own adventure game, complete with if statements.
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
		System.out.print("Welcome to the game! Let's start!" + "\n>");
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
					System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
							+ " escape pods. You may also self destruct the ship");
							if(ui.takeValidInput("self destruct", "release the escape pods").equals("release the escape pods"))
							{
								System.out.println("You enter an escape pod, and slowly begin to drift away from your ship, presumably" +
								"\ntowards a new beginning");
								ending = "Leave it all behind";
								System.out.println("\nEnding Get: " + "\n" + ending);
							}
							else
							{
								g.type("This action cannot be undone. Continue? y/n");
								System.out.print("\n>");
								if(ui.takeValidInput("y","n").equals("y"))
								{
									g.type("Commencing self destruct sequence.");
									System.out.println("The self destruct sequence commences," + "\n blowing the ship to bits, with you inside");
									ending = "Sleep, finally";
									System.out.println("\nEnding Get: " + "\n" + ending);
								}
							}
				}
				else
				{
					System.out.println("No use, the door's locked. You should probably \u001B[1m go back"
							+ "\n>");
					if(ui.takeValidInput("go back").equals("go back"))
					{
						System.out.println("You are back where you started. You think you should probably go to the " + "\n reactor room now.");
						System.out.println("You are in the reactor room. You see a keycard on the floor." +
						"\nYou think that you should pick it up.");
						if(ui.takeValidInput("pick up", "override reactor control protocols").equals("pick up"))
						{
							System.out.println("You pick up the keycard. You can now go to the bridge.");
							if(ui.takeValidInput("go to the bridge", "override reactor control protocols").equals("go to the bridge"))
							{
								System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
								+ " escape pods. You may also self destruct the ship");
								if(ui.takeValidInput("self destruct", "release the escape pods").equals("release the escape pods"))
								{
									System.out.println("You enter an escape pod, and slowly begin to drift away from your ship, presumably" +
									"\ntowards a new beginning");
									ending = "Leave it all behind";
									System.out.println("\nEnding Get: " + "\n" + ending);
								}
								else
								{
									g.type("This action cannot be undone. Continue? y/n");
									System.out.print("\n>");
									if(ui.takeValidInput("y","n").equals("y"))
									{
										g.type("Commencing self destruct sequence.");
										System.out.println("The self destruct sequence commences," + "\n blowing the ship to bits, with you inside");
										ending = "Sleep, finally";
										System.out.println("\nEnding Get: " + "\n" + ending);
									}
								}
								
							}
						}
					}
				}
			}
			
			else
			{
				System.out.println("You are in the reactor room. A loud humming surrounds you." +
				"\n You see two doors before you. You can:" +
				"\n Go through the door marked \u001B[1m engine or" +
				"\n Go through the door marked \u001B[1m reactor." + "\n>");
				if(ui.takeValidInput("engine", "reactor").equals("engine"))
				{
					System.out.println("You are in the engine room. You can:");
					//TODO: Implement complete engine room functionality.
				}
				else
				{
					System.out.println("You are in the reactor room. You see a keycard on the floor." +
					"\n You think that you should pick it up.");
					//TODO: Implement complete reactor room functionality.
				}
			}
		}
		else
		{
			g.type("Wait, what are you doing? You don't want to leave yet, there's so much more to do!" + "\n>");
			if (ui.takeValidInput("leave","start").equals("leave"))
			{
				g.type("You're making a horrible mistake" + "\n>");
				if (ui.takeValidInput("leave","start").equals("leave"))
				{
					g.type("Alright then, I suppose I have to let you go");
					ending = "Don't play the game. Fine then.";
					System.out.flush();
					System.out.println("\nEnding Get: " + "\n" + ending);
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
							System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
									+ " escape pods. You may also self destruct the ship");
									if(ui.takeValidInput("self destruct", "release the escape pods").equals("release the escape pods"))
									{
										System.out.println("You enter an escape pod, and slowly begin to drift away from your ship, presumably" +
										"\ntowards a new beginning");
										ending = "Leave it all behind";
										System.out.println("\nEnding Get: " + "\n" + ending);
									}
									else
									{
										g.type("This action cannot be undone. Continue? y/n");
										System.out.print("\n>");
										if(ui.takeValidInput("y","n").equals("y"))
										{
											g.type("Commencing self destruct sequence.");
											System.out.println("The self destruct sequence commences," + "\n blowing the ship to bits, with you inside");
											ending = "Sleep, finally";
											System.out.println("\nEnding Get: " + "\n" + ending);
										}
									}
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
								if(ui.takeValidInput("pick up", "override reactor control protocols").equals("pick up"))
								{
									System.out.println("You pick up the keycard. You can now go to the bridge.");
									if(ui.takeValidInput("go to the bridge", "override reactor control protocols").equals("go to the bridge"))
									{
										System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
										+ " escape pods. You may also self destruct the ship");
										if(ui.takeValidInput("self destruct", "release the escape pods").equals("release the escape pods"))
										{
											System.out.println("You enter an escape pod, and slowly begin to drift away from your ship, presumably" +
											"\ntowards a new beginning");
											ending = "Leave it all behind";
											System.out.println("\nEnding Get: " + "\n" + ending);
										}
									}
								}
							}
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
						System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
								+ " escape pods. You may also self destruct the ship");
								if(ui.takeValidInput("self destruct", "release the escape pods").equals("release the escape pods"))
								{
									System.out.println("You enter an escape pod, and slowly begin to drift away from your ship, presumably" +
									"\ntowards a new beginning");
									ending = "Leave it all behind";
									System.out.println("\nEnding Get: " + "\n" + ending);
								}
								else
								{
									g.type("This action cannot be undone. Continue? y/n");
									System.out.print("\n>");
									if(ui.takeValidInput("y","n").equals("y"))
									{
										g.type("Commencing self destruct sequence.");
										System.out.println("The self destruct sequence commences," + "\n blowing the ship to bits, with you inside");
										ending = "Sleep, finally";
										System.out.println("\nEnding Get: " + "\n" + ending);
									}
								}
					}
					else
					{
						System.out.println("No use, the door's locked. You should probably \u001B[1m go back"
								+ "\n>");
						if(ui.takeValidInput("go back").equals("go back"))
						{
							System.out.println("You are back where you started. You think you should probably go to the " + "\n reactor room now.");
							System.out.println("You are in the reactor room. You see a keycard on the floor." +
							"\nYou think that you should pick it up.");
							if(ui.takeValidInput("pick up", "override reactor control protocols").equals("pick up"))
							{
								System.out.println("You pick up the keycard. You can now go to the bridge.");
								if(ui.takeValidInput("go to the bridge", "override reactor control protocols").equals("go to the bridge"))
								{
									System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
									+ " escape pods. You may also self destruct the ship");
									if(ui.takeValidInput("self destruct", "release the escape pods").equals("release the escape pods"))
									{
										System.out.println("You enter an escape pod, and slowly begin to drift away from your ship, presumably" +
										"\ntowards a new beginning");
										ending = "Leave it all behind";
										System.out.println("\nEnding Get: " + "\n" + ending);
									}
									else
									{
										g.type("This action cannot be undone. Continue? y/n");
										System.out.print("\n>");
										if(ui.takeValidInput("y","n").equals("y"))
										{
											g.type("Commencing self destruct sequence.");
											System.out.println("The self destruct sequence commences," + "\n blowing the ship to bits, with you inside");
											ending = "Sleep, finally";
											System.out.println("\nEnding Get: " + "\n" + ending);
										}
									}
									
								}
							}
						}
					}
				}
			}
		}
	}
}
	 

