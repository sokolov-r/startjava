public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setIsMale(true);
		wolfOne.setName("Akela");
		wolfOne.setWeight(70);
		wolfOne.setAge(4);
		wolfOne.setColor("grey");

		System.out.println(wolfOne.getIsMale());
		System.out.println(wolfOne.getName());
		System.out.println(wolfOne.getWeight());
		System.out.println(wolfOne.getAge());
		System.out.println(wolfOne.getColor());

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}