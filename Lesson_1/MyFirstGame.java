public class MyFirstGame {
	public static void main(String[] args) {
		int randomNumber = 35;
		int answerNumber = 50;
		while (answerNumber != randomNumber) {
			if (answerNumber > randomNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				answerNumber--;
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				answerNumber++;
			}
		}
		System.out.println("Вы угадали!");
	}
}