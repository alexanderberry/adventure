
public class QuadraticSolverTester {
	public static void main(String[] args)
	{
		QuadraticEquation solver = new QuadraticEquation(56, 216, 73);
		solver.solveEquation();
		solver.returnAnswer();
		QuadraticEquation solverTwo = new QuadraticEquation();
		solverTwo.getUserInput();
		solverTwo.solveEquation();
		solverTwo.returnAnswer();
	}
}
