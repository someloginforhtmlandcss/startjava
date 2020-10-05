import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		boolean work = true;
		String answer;
		Calculator calc = new Calculator();
		Scanner inData = new Scanner(System.in);
				
		while(work) {

			System.out.println("Enter the first number:");
			calc.setNum01(inData.nextInt());
			
			System.out.println("Enter the math operation:");
			calc.setMathOperation(inData.next());		

			System.out.println("Enter the second number:");
			calc.setNum02(inData.nextInt());

			calc.mathOperation(calc.getNum01(), calc.getNum02(), calc.getMathOperation());

			do {
				System.out.println("Would you like to continue?");
				answer = inData.next();
				if (answer.equals("no")){
					System.out.println("Calculator stopped!");
					work = false;
					break;
				}
			} while (!answer.equals("yes"));
		}
	}
}