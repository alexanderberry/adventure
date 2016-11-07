/**
 * 
 * @author Alexander Berry
 * @version 1.0.4
 * A program developed to take a user input and check it against a list of valid user inputs, before returning the user's input
 * if it matches the inputs as specified in the arguments of takeValidInput.
 *
 */
import java.util.Arrays;
import java.util.Scanner;
public class ValidUserInput 
{
	Scanner ui = new Scanner(System.in);
	private String userInput;
	public ValidUserInput()
	{
		
	}
	/**
	 * Takes a list of valid user inputs, and then returns the valid input.
	 * @param valid A list of valid inputs.
	 * @return The user's input.
	 */
	public String takeValidInput(String...valid)
	{
			userInput = ui.nextLine().toLowerCase();
			if(Arrays.asList(valid).contains(userInput))
			{
				return userInput;
			}
			else
			{
				while(!((userInput.equals(valid))))
				{
					System.out.print("Error, input is not valid. You can " + Arrays.toString(valid) + ". " + "Please try again" + "\n>");
					takeValidInput(valid);
					if(Arrays.asList(valid).contains(userInput))
					{
						return userInput;
					}
				}
			}
		return "error";

	}
	
}	