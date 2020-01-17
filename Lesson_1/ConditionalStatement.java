public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 5;
		boolean isMan = true;
		float height = 1.90f;
		char firstLetterName = 'H';

		if (age > 20) {
			System.out.println("возраст > 20");
		}
		
		if (isMan) {
			System.out.println("мужчина");
		}
		
		if (!isMan) {
			System.out.println("женщина");
		}

		if (height < 1.80) {
			System.out.println("рост < 1.80");
		} else {
			System.out.println("рост >= 1.80");
		}

		if (firstLetterName == 'M') {
			System.out.println("первая буква имени М");
		} else if (firstLetterName == 'I') {
			System.out.println("первая буква имени I");
		} else {
			System.out.println("первая буква имени не М и не I");
		}
	}
}