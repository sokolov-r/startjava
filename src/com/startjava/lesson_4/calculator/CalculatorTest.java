package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;
		char operation;
		String[] mathExprArr;
		boolean isOk;

		do {
			System.out.print("Введите математическое выражение: ");
			mathExprArr = scan.nextLine().split(" ");

			calculatorOne.setA(Integer.parseInt(mathExprArr[0]));

			operation = mathExprArr[1].charAt(0);
			if ((operation == '+') || (operation == '-') || (operation == '*') ||
				(operation == '/') || (operation == '%') || (operation == '^')) {
				calculatorOne.setOperation(operation);
				isOk = true;
			} else {
				System.out.println("Неверная операция");
				isOk = false;
			}

			if (isOk == true) {
				calculatorOne.setB(Integer.parseInt(mathExprArr[2]));
				System.out.println(calculatorOne.calculate());
			}
			
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.nextLine();
			} while (!(answer.equals("да") || answer.equals("нет")));
		} while (!answer.equals("нет"));
	}
}