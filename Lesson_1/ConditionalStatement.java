public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 5;

		if (age > 20) {
			System.out.println("возраст > 20");
		}
		
		boolean isMan = true;
		if (isMan) {
			System.out.println("мужчина");
		}
		
		if (!isMan) {
			System.out.println("женщина");
		}
		
		float height = 1.90f;
		if (height < 1.80) {
			System.out.println("рост < 1.80");
		} else {
			System.out.println("рост >= 1.80");
		}
		
		char firstLetterName = 'H';
		if (firstLetterName == 'M') {
			System.out.println("первая буква имени М");
		} else if (firstLetterName == 'I') {
			System.out.println("первая буква имени I");
		} else {
			System.out.println("первая буква имени не М и не I");
		}
	}
}