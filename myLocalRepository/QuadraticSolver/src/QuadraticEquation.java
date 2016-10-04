import java.lang.Math;
import java.util.Scanner;
/**
 * 
 * @author Alexander Berry
 * A working class for solving quadratic equations. Complex number support coming soon™
 *
 */
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	private double[] answer = new double[2];
	Scanner takeUserInput = new Scanner(System.in);
	public QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public QuadraticEquation()
	{
		
	}
	public void getUserInput()
	{
		System.out.println("Please enter the a value of your quadratic equation.");
		a = takeUserInput.nextDouble();
		System.out.println("Please enter the b value of your quadratic equation.");
		b = takeUserInput.nextDouble();
		System.out.println("Please enter the c value of your quadratic equation.");
		c = takeUserInput.nextDouble();
	}
	public void solveEquation()
	{
		answer[0] = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2 * a);
		answer[1] = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2 * a);
	}
	public void returnAnswer(){
		if(Double.isNaN(answer[0]) || Double.isNaN(answer[1]))
		{
			System.out.println("One or more of your answers is imaginary");
		}
		else
		{
		System.out.println("Your first answer is: " + answer[0] + " " + ", and your second answer is " + answer[1]); 
		}
	}
}
