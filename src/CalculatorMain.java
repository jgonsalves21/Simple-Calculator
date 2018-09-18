/*
* jgonsalves21
* CalculatorMain
*
*/
public class CalculatorMain {

	public static void main(String[] args) 
	{
		// This is how we create an object
		// New --> java keyword which creates an object
		
		Calculator calc = new Calculator();
		System.out.println("The sum of 6 and 2 is " + calc.add(2, 6));
		
		CalculatorSubtract calculator = new CalculatorSubtract();
		System.out.print("The difference between 37582 and 18574 is " + calculator.sub(37582, 18574));
		
		
	}

}
