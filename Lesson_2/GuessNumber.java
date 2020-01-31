import java.util.Scanner;

public class GuessNumber {

	private int randomNumber;

	public void makeNumber() {
		randomNumber = (int)(Math.random() * 100);
	}

	public void game(Player player1, Player player2) {
		Scanner scan = new Scanner(System.in);
		boolean isPlayer1 = false;
		String answer = "";

		while (!(answer.equals("нет"))) {
			isPlayer1 = false;
			makeNumber();
			System.out.println("Отгадайте число от 0 до 100");

			do {
				if (isPlayer1 == false) {
					System.out.println("Отвечает " + player1.getName());
					player1.setNumber(scan.nextInt());
					isPlayer1 = true;
					if (player1.getNumber() > randomNumber) {
						System.out.println("Загаданное число меньше");
					} else if (player1.getNumber() < randomNumber) {
						System.out.println("Загаданное число больше");
					} else {
						break;
					}
				} else {
					System.out.println("Отвечает " + player2.getName());
					player2.setNumber(scan.nextInt());
					isPlayer1 = false;
					if (player2.getNumber() > randomNumber) {
						System.out.println("Загаданное число меньше");
					} else if (player2.getNumber() < randomNumber) {
						System.out.println("Загаданное число больше");
					} else {
						break;
					}
				}
			} while ((player1.getNumber() != randomNumber) || (player2.getNumber() != randomNumber));
			
			if 	(player1.getNumber() == randomNumber) {
				System.out.println("Выиграл " + player1.getName());
			} else {
				System.out.println("Выиграл " + player2.getName());
			}

			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
			} while (!(answer.equals("да") || answer.equals("нет")));
		}
	}
}