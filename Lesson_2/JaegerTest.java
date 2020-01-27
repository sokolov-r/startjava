public class JaegerTest {

	 public static void main(String[] args) {
	 	Jaeger jaegerCrimson = new Jaeger("Crimson Typhoon", "Mark-4", "China", "IB22 Plasmacaster", 76.2f, 1772f, 9, 8, 6);
	 	Jaeger jaegerStriker = new Jaeger("Striker Eureka", "Mark-5", "Australia", "Assault Mount 3.25 \"Sting-Blades\"", 76.2f, 1850f, 10, 10, 9);

	 	if (jaegerCrimson.drift()) {
	 		jaegerCrimson.move();
	 		if (jaegerCrimson.scanKaiju()) {
	 			jaegerCrimson.attack();
	 			jaegerCrimson.setArmor(3);
	 			System.out.println("Armor = " + jaegerCrimson.getArmor());
	 		}
	 	}

	 	if (jaegerStriker.drift()) {
	 		jaegerStriker.move();
	 		if (jaegerStriker.scanKaiju()) {
	 			jaegerStriker.attack();
	 			jaegerStriker.setArmor(5);
	 			System.out.println("Armor = " + jaegerStriker.getArmor());
	 		}
	 	}
	 }
}