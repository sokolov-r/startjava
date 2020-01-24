import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		byte flag = 0;
		String answer;

		while (true) {
			calculatorOne.inputA();
			calculatorOne.inputOperation();
			calculatorOne.inputB();
			calculatorOne.output();
			while (true) {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.nextLine(); 
				if (answer.equals("да")) {
					break;
				} else if (answer.equals("нет")) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				break;
			}
		}
	}
}