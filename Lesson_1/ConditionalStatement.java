public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 5;
		boolean isMan = true;
		float height = 1.90f;
		char firstLetterName = 'H';

		if (age > 20) {
			System.out.println("������� > 20");
		}
		
		if (isMan) {
			System.out.println("�������");
		}
		
		if (!isMan) {
			System.out.println("�������");
		}

		if (height < 1.80) {
			System.out.println("���� < 1.80");
		} else {
			System.out.println("���� >= 1.80");
		}

		if (firstLetterName == 'M') {
			System.out.println("������ ����� ����� �");
		} else if (firstLetterName == 'I') {
			System.out.println("������ ����� ����� I");
		} else {
			System.out.println("������ ����� ����� �� � � �� I");
		}
	}
}