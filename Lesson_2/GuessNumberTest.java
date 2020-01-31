import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {

		GuessNumber guessNumber = new GuessNumber();
		Scanner scan = new Scanner(System.in);
		boolean isPlayer1 = false;
		String answer = "";

		System.out.println("Введите имя первого игрока:");

		Player player1 = new Player(scan.next());
		
		System.out.println("Введите имя второго игрока:");

		Player player2 = new Player(scan.next());
		
		while (!(answer.equals("нет"))) {
			isPlayer1 = false;
			guessNumber.makeNumber();
			System.out.println("Отгадайте число от 0 до 100");

			do {
				if (isPlayer1 == false) {
					System.out.println("Отвечает " + player1.getName());
					player1.setNumber(scan.nextInt());
					isPlayer1 = true;
					if (player1.getNumber() > guessNumber.getRandomNumber()) {
						System.out.println("Загаданное число меньше");
					} else if (player1.getNumber() < guessNumber.getRandomNumber()) {
						System.out.println("Загаданное число больше");
					} else {
						break;
					}
				} else {
					System.out.println("Отвечает " + player2.getName());
					player2.setNumber(scan.nextInt());
					isPlayer1 = false;
					if (player2.getNumber() > guessNumber.getRandomNumber()) {
						System.out.println("Загаданное число меньше");
					} else if (player2.getNumber() < guessNumber.getRandomNumber()) {
						System.out.println("Загаданное число больше");
					} else {
						break;
					}
				}
			} while ((player1.getNumber() != guessNumber.getRandomNumber()) || (player2.getNumber() != guessNumber.getRandomNumber()));
			
			if 	(player1.getNumber() == guessNumber.getRandomNumber()) {
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