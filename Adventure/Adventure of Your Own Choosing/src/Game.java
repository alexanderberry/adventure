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
					+ "\nYou can go through the door to the bridge or go through the door marked maintenance.");
			System.out.print("\n>");
			if(ui.takeValidInput("go through the door to the bridge","go through the door marked maintenance").equals("go through the door to the bridge"))
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
						System.out.println("You are in . You see a keycard on the floor." +
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
				System.out.println("You are in a corridor. A loud humming surrounds you." +
				"\n You see two doors before you. You can:" +
				"\n Go through the door marked \u001B[1m engine or" +
				"\n Go through the door marked \u001B[1m reactor.");
				System.out.print("\n>");
				if(ui.takeValidInput("engine", "reactor").equals("engine"))
				{
					System.out.print("\nYou are in the engine room. You can go to the reactor room or disable the engines." + "\n>");
					if(ui.takeValidInput("disable the engines", "go to the reactor room").equals("disable the engines"))
					{
						System.out.print("You disabled the engines. You moron.");
						ending = "Terminated for moronic behavior";
						System.out.println("\nEnding Get: " + "\n" + ending);
					}
					else
					{
						System.out.println("You are now in the reactor room. You can override the reactor saftey protocols from here" + "\n"
						+ "(but why would you ever want to do that?) You can also go back to the corridor you came from.");
						System.out.print("\n>");
							if(ui.takeValidInput("override reactor saftey protocols", "go back").equals("override reactor saftey protocols"))
							{
								System.out.println("Warning: Core temperature rising. Systems shutting down. Self destruction imminent.");
								System.out.println("As alarms continue to blare throughout the ship, you contemplate your compulsivity" +
								"\n and how it lead you to your demise.");
								ending = "Overly compulsive";
								System.out.println("\nEnding Get: " + "\n" + ending);
							}
							else
							{
								System.out.println("You are in a corridor. You see a keycard on the floor." +
								"\n You think that you should pick it up.");
								System.out.print("\n>");
								if(ui.takeValidInput("pick up the keycard").equals("pick up the keycard"))
								{
									System.out.println("You pick up the keycard and subsequently decide to go to the bridge.");
									System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
											+ " escape pods. You may also self destruct the ship");
									System.out.print("\n>");
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
				else
				{
					System.out.println("You are in a corridor. A loud humming surrounds you." +
							"\n You see two doors before you. You can:" +
							"\n Go through the door marked \u001B[1m engine or" +
							"\n Go through the door marked \u001B[1m reactor.");
					if(ui.takeValidInput("engine", "reactor").equals("engine"))
					{
						System.out.print("\nYou are in the engine room. You can go to the reactor room or disable the engines." + "\n>");
						if(ui.takeValidInput("disable the engines", "go to the reactor room").equals("disable the engines"))
						{
							System.out.print("You disabled the engines. You moron.");
							ending = "Terminated for moronic behavior";
							System.out.println("\nEnding Get: " + "\n" + ending);
						}
						else
						{
							System.out.println("You are now in the reactor room. You can override the reactor saftey protocols from here" + "\n"
							+ "(but why would you ever want to do that?) You can also go back to the corridor you came from.");
							System.out.print("\n>");
								if(ui.takeValidInput("override reactor saftey protocols", "go back").equals("override reactor saftey protocols"))
								{
									System.out.println("Warning: Core temperature rising. Systems shutting down. Self destruction imminent.");
									System.out.println("As alarms continue to blare throughout the ship, you contemplate your compulsivity" +
									"\n and how it lead you to your demise.");
									ending = "Overly compulsive";
									System.out.println("\nEnding Get: " + "\n" + ending);
								}
								else
								{
									System.out.println("You are in a corridor. You see a keycard on the floor." +
									"\n You think that you should pick it up.");
									System.out.print("\n>");
									if(ui.takeValidInput("pick up the keycard").equals("pick up the keycard"))
									{
										System.out.println("You pick up the keycard and subsequently decide to go to the bridge.");
										System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
												+ " escape pods. You may also self destruct the ship");
										System.out.print("\n>");
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
							+ "\nYou can go through the door to the bridge or go through the door marked maintenance.");
					System.out.print("\n>");
					if(ui.takeValidInput("go through the door to the bridge","go through the door marked maintenance").equals("go through the door to the bridge"))
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
								System.out.println("You are in . You see a keycard on the floor." +
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
						System.out.println("You are in a corridor. A loud humming surrounds you." +
						"\n You see two doors before you. You can:" +
						"\n Go through the door marked \u001B[1m engine or" +
						"\n Go through the door marked \u001B[1m reactor.");
						System.out.print("\n>");
						if(ui.takeValidInput("engine", "reactor").equals("engine"))
						{
							System.out.print("\nYou are in the engine room. You can go to the reactor room or disable the engines." + "\n>");
							if(ui.takeValidInput("disable the engines", "go to the reactor room").equals("disable the engines"))
							{
								System.out.print("You disabled the engines. You moron.");
								ending = "Terminated for moronic behavior";
								System.out.println("\nEnding Get: " + "\n" + ending);
							}
							else
							{
								System.out.println("You are now in the reactor room. You can override the reactor saftey protocols from here" + "\n"
								+ "(but why would you ever want to do that?) You can also go back to the corridor you came from.");
								System.out.print("\n>");
									if(ui.takeValidInput("override reactor saftey protocols", "go back").equals("override reactor saftey protocols"))
									{
										System.out.println("Warning: Core temperature rising. Systems shutting down. Self destruction imminent.");
										System.out.println("As alarms continue to blare throughout the ship, you contemplate your compulsivity" +
										"\n and how it lead you to your demise.");
										ending = "Overly compulsive";
										System.out.println("\nEnding Get: " + "\n" + ending);
									}
									else
									{
										System.out.println("You are in a corridor. You see a keycard on the floor." +
										"\n You think that you should pick it up.");
										System.out.print("\n>");
										if(ui.takeValidInput("pick up the keycard").equals("pick up the keycard"))
										{
											System.out.println("You pick up the keycard and subsequently decide to go to the bridge.");
											System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
													+ " escape pods. You may also self destruct the ship");
											System.out.print("\n>");
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
						else
						{
							System.out.println("You are in a corridor. A loud humming surrounds you." +
									"\n You see two doors before you. You can:" +
									"\n Go through the door marked \u001B[1m engine or" +
									"\n Go through the door marked \u001B[1m reactor.");
							if(ui.takeValidInput("engine", "reactor").equals("engine"))
							{
								System.out.print("\nYou are in the engine room. You can go to the reactor room or disable the engines." + "\n>");
								if(ui.takeValidInput("disable the engines", "go to the reactor room").equals("disable the engines"))
								{
									System.out.print("You disabled the engines. You moron.");
									ending = "Terminated for moronic behavior";
									System.out.println("\nEnding Get: " + "\n" + ending);
								}
								else
								{
									System.out.println("You are now in the reactor room. You can override the reactor saftey protocols from here" + "\n"
									+ "(but why would you ever want to do that?) You can also go back to the corridor you came from.");
									System.out.print("\n>");
										if(ui.takeValidInput("override reactor saftey protocols", "go back").equals("override reactor saftey protocols"))
										{
											System.out.println("Warning: Core temperature rising. Systems shutting down. Self destruction imminent.");
											System.out.println("As alarms continue to blare throughout the ship, you contemplate your compulsivity" +
											"\n and how it lead you to your demise.");
											ending = "Overly compulsive";
											System.out.println("\nEnding Get: " + "\n" + ending);
										}
										else
										{
											System.out.println("You are in a corridor. You see a keycard on the floor." +
											"\n You think that you should pick it up.");
											System.out.print("\n>");
											if(ui.takeValidInput("pick up the keycard").equals("pick up the keycard"))
											{
												System.out.println("You pick up the keycard and subsequently decide to go to the bridge.");
												System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
														+ " escape pods. You may also self destruct the ship");
												System.out.print("\n>");
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
			else
			{
				System.out.println("You wake up in a spaceship in deep space. "
						+ "\nThe view monitors all display deep black. "
						+ "\nThere are two doors. "
						+ "\nYou can go through the door to the bridge or go through the door marked maintenance.");
				System.out.print("\n>");
				if(ui.takeValidInput("go through the door to the bridge","go through the door marked maintenance").equals("go through the door to the bridge"))
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
							System.out.println("You are in . You see a keycard on the floor." +
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
					System.out.println("You are in a corridor. A loud humming surrounds you." +
					"\n You see two doors before you. You can:" +
					"\n Go through the door marked \u001B[1m engine or" +
					"\n Go through the door marked \u001B[1m reactor.");
					System.out.print("\n>");
					if(ui.takeValidInput("engine", "reactor").equals("engine"))
					{
						System.out.print("\nYou are in the engine room. You can go to the reactor room or disable the engines." + "\n>");
						if(ui.takeValidInput("disable the engines", "go to the reactor room").equals("disable the engines"))
						{
							System.out.print("You disabled the engines. You moron.");
							ending = "Terminated for moronic behavior";
							System.out.println("\nEnding Get: " + "\n" + ending);
						}
						else
						{
							System.out.println("You are now in the reactor room. You can override the reactor saftey protocols from here" + "\n"
							+ "(but why would you ever want to do that?) You can also go back to the corridor you came from.");
							System.out.print("\n>");
								if(ui.takeValidInput("override reactor saftey protocols", "go back").equals("override reactor saftey protocols"))
								{
									System.out.println("Warning: Core temperature rising. Systems shutting down. Self destruction imminent.");
									System.out.println("As alarms continue to blare throughout the ship, you contemplate your compulsivity" +
									"\n and how it lead you to your demise.");
									ending = "Overly compulsive";
									System.out.println("\nEnding Get: " + "\n" + ending);
								}
								else
								{
									System.out.println("You are in a corridor. You see a keycard on the floor." +
									"\n You think that you should pick it up.");
									System.out.print("\n>");
									if(ui.takeValidInput("pick up the keycard").equals("pick up the keycard"))
									{
										System.out.println("You pick up the keycard and subsequently decide to go to the bridge.");
										System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
												+ " escape pods. You may also self destruct the ship");
										System.out.print("\n>");
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
					else
					{
						System.out.println("You are in a corridor. A loud humming surrounds you." +
								"\n You see two doors before you. You can:" +
								"\n Go through the door marked \u001B[1m engine or" +
								"\n Go through the door marked \u001B[1m reactor.");
						if(ui.takeValidInput("engine", "reactor").equals("engine"))
						{
							System.out.print("\nYou are in the engine room. You can go to the reactor room or disable the engines." + "\n>");
							if(ui.takeValidInput("disable the engines", "go to the reactor room").equals("disable the engines"))
							{
								System.out.print("You disabled the engines. You moron.");
								ending = "Terminated for moronic behavior";
								System.out.println("\nEnding Get: " + "\n" + ending);
							}
							else
							{
								System.out.println("You are now in the reactor room. You can override the reactor saftey protocols from here" + "\n"
								+ "(but why would you ever want to do that?) You can also go back to the corridor you came from.");
								System.out.print("\n>");
									if(ui.takeValidInput("override reactor saftey protocols", "go back").equals("override reactor saftey protocols"))
									{
										System.out.println("Warning: Core temperature rising. Systems shutting down. Self destruction imminent.");
										System.out.println("As alarms continue to blare throughout the ship, you contemplate your compulsivity" +
										"\n and how it lead you to your demise.");
										ending = "Overly compulsive";
										System.out.println("\nEnding Get: " + "\n" + ending);
									}
									else
									{
										System.out.println("You are in a corridor. You see a keycard on the floor." +
										"\n You think that you should pick it up.");
										System.out.print("\n>");
										if(ui.takeValidInput("pick up the keycard").equals("pick up the keycard"))
										{
											System.out.println("You pick up the keycard and subsequently decide to go to the bridge.");
											System.out.println("You enter the bridge. You see a control panel." + "\nYou may now release the"
													+ " escape pods. You may also self destruct the ship");
											System.out.print("\n>");
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
	
}

	 

