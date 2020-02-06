import java.util.Scanner;

public class GuessNumber {

	private int randomNumber;
	private Player player1, player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		Scanner scan = new Scanner(System.in);
		randomNumber = (int)(Math.random() * 101);
		System.out.println("Отгадайте число от 0 до 100");

		do {
			System.out.println("Отвечает " + player1.getName());
			player1.setNumber(scan.nextInt());
			if (player1.getNumber() > randomNumber) {
				System.out.println("Загаданное число меньше");
			} else if (player1.getNumber() < randomNumber) {
				System.out.println("Загаданное число больше");
			} else {
				System.out.println("Выиграл " + player1.getName());
				break;
			}
			
			System.out.println("Отвечает " + player2.getName());
			player2.setNumber(scan.nextInt());
			if (player2.getNumber() > randomNumber) {
				System.out.println("Загаданное число меньше");
			} else if (player2.getNumber() < randomNumber) {
				System.out.println("Загаданное число больше");
			} else {
				System.out.println("Выиграл " + player2.getName());
				break;
			}
		} while (true);
	}
}