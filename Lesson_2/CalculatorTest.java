import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "";

		while (true) {
			answer = "";
			calculatorOne.inputA();
			calculatorOne.setA(scan.nextInt());
			calculatorOne.inputOperation();
			calculatorOne.setOperation(scan.next().charAt(0));
			if ((calculatorOne.getOperation() == '+') || (calculatorOne.getOperation() == '-') || (calculatorOne.getOperation() == '*') || (calculatorOne.getOperation() == '/') || (calculatorOne.getOperation() == '%') || (calculatorOne.getOperation() == '^')) {
				calculatorOne.inputB();
				calculatorOne.setB(scan.nextInt());
				System.out.println(calculatorOne.calculate());
			} else {
				System.out.println("Неверная операция");
			}

			while (!(answer.equals("да") || answer.equals("нет"))) {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
			}

			if (answer.equals("нет")) {
				break;
			}
		}
	}
}