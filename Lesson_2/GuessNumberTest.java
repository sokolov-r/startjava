import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите имя первого игрока:");

		Player player1 = new Player(scan.next());
		
		System.out.println("Введите имя второго игрока:");

		Player player2 = new Player(scan.next());
		
		guessNumber.game(player1, player2);
	}
}