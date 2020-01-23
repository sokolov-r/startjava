public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.isMale = true;
		wolfOne.name = "Akela";
		wolfOne.weight = 70;
		wolfOne.age = 30;
		wolfOne.color = "grey";

		System.out.println(wolfOne.isMale);
		System.out.println(wolfOne.name);
		System.out.println(wolfOne.weight);
		System.out.println(wolfOne.age);
		System.out.println(wolfOne.color);

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}