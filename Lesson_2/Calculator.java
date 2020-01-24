import java.util.Scanner;

public class Calculator {

	int a;
	int b;
	char operation;
	double result;
	Scanner scan = new Scanner(System.in);

	void inputA() {
		System.out.print("Введите первое число: ");
		a = scan.nextInt();
	}

	void inputOperation() {
		System.out.print("Введите знак математической операции: ");
		operation = scan.next().charAt(0);
	}

	void inputB() {
		System.out.print("Введите второе число: ");
		b = scan.nextInt();
	}

	void output() {
		boolean error = false;
		switch (operation) {
			case '+': result = a + b;
				break;
			case '-': result = a - b;
				break;
			case '*': result = a * b;
				break;
			case '/': result = a / b;
				break;
			case '%': result = a % b;
				break;
			case '^': result = a;
				for (int i = 2; i <=b; i++){
					result *= a;
				}
				break;
			default: System.out.println("Неверная операция");
				error = true;
				break;
		}
		if (!error) {
		System.out.println(result);
		}
	}	
}