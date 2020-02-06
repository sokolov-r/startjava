import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;
		char operation;

		do {
			System.out.print("Введите первое число: ");
			calculatorOne.setA(scan.nextInt());
			
			System.out.print("Введите знак математической операции: ");
			operation = scan.next().charAt(0);
			if ((operation == '+') || (operation == '-') || (operation == '*') || 
				(operation == '/') || (operation == '%') || (operation == '^')) {
				calculatorOne.setOperation(operation);
				System.out.print("Введите второе число: ");
				calculatorOne.setB(scan.nextInt());
				System.out.println(calculatorOne.calculate());
			} else {
				System.out.println("Неверная операция");
			}

			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
			} while (!(answer.equals("да") || answer.equals("нет")));
		} while (!answer.equals("нет"));
	}
}