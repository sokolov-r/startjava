import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите имя первого игрока:");
		Player player1 = new Player(scan.next());
		
		System.out.println("Введите имя второго игрока:");
		Player player2 = new Player(scan.next());

		GuessNumber guessNumber = new GuessNumber(player1, player2);
		String answer;

		do {
			guessNumber.start();
			do {
					System.out.println("Хотите продолжить? [да/нет]: ");
					answer = scan.next();
			} while (!(answer.equals("да") || answer.equals("нет")));
		} while (!answer.equals("нет"));
	}
}