import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "";

		while (true) {
			calculatorOne.inputA();
			calculatorOne.setA(scan.nextInt());
			calculatorOne.inputOperation();
			calculatorOne.setOperation(scan.next().charAt(0));
			calculatorOne.inputB();
			calculatorOne.setB(scan.nextInt());

			if (calculatorOne.calculate()) {
				System.out.println(calculatorOne.getResult());
			}

			while (!(answer.equals("да") | answer.equals("нет"))) {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
			}

			if (answer.equals("нет")) {
				break;
			}
		}
	}
}