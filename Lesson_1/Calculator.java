public class Calculator {
	public static void main(String[] args){
		int a = 3;
		int b = 2;
		char operation = '^';
		double result = 0;

		if (operation == '+') {
			result = a + b;			
		} else if (operation == '-') {
			result = a - b;
		} else if (operation == '*') {
			result = a * b;
		} else if (operation == '/') {
			result = (double)a / b;
		} else if (operation == '%') {
			result = a % b;
		} else if (operation == '^') {
			result = a;
			for (int i = 2; i <= b; i++){
				result *= a;
			}
		}
		System.out.println(result);
	}
}