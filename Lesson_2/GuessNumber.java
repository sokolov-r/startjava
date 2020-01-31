public class GuessNumber {

	private int randomNumber;

	public int getRandomNumber() {
		return randomNumber;
	}

	public void makeNumber() {
		randomNumber = (int)(Math.random() * 100);
	}
}