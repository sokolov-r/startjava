public class Calculator {

	private int a;
	private int b;
	private char operation;
	private double result;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void inputA() {
		System.out.print("Введите первое число: ");
	}

	public void inputOperation() {
		System.out.print("Введите знак математической операции: ");
	}

	public void inputB() {
		System.out.print("Введите второе число: ");
	}

	public double calculate() {
		switch (operation) {
			case '+': 
				result = a + b;
				return result;
			case '-': 
				result = a - b;
				return result;
			case '*': 
				result = a * b;
				return result;
			case '/': 
				result = a / b;
				return result;
			case '%': 
				result = a % b;
				return result;
			case '^': 
				result = a;
				for (int i = 2; i <= b; i++) {
					result *= a;
				}
				return result;
			default: 
				return 0;
		}	
	}	
}