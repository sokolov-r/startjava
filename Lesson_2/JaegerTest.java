public class JaegerTest {

	 public static void main(String[] args) {
	 	Jaeger jaegerCrimson = new Jaeger();
	 	jaegerCrimson.setModelName("Crimson Typhoon");
	 	jaegerCrimson.setMark("Mark-4");
	 	jaegerCrimson.setOrigin("China");
	 	jaegerCrimson.setWeapon("IB22 Plasmacaster");
	 	jaegerCrimson.setHeight(76.2f);
	 	jaegerCrimson.setWeight(1772f);
	 	jaegerCrimson.setSpeed(9);
	 	jaegerCrimson.setStrength(8);
	 	jaegerCrimson.setArmor(6);

	 	Jaeger jaegerStriker = new Jaeger();
	 	jaegerStriker.setModelName("Striker Eureka");
	 	jaegerStriker.setMark("Mark-5");
	 	jaegerStriker.setOrigin("Australia");
	 	jaegerStriker.setWeapon("Assault Mount 3.25 \"Sting-Blades\"");
	 	jaegerStriker.setHeight(76.2f);
	 	jaegerStriker.setWeight(1850f);
	 	jaegerStriker.setSpeed(10);
	 	jaegerStriker.setStrength(10);
	 	jaegerStriker.setArmor(9);

	 	if (jaegerCrimson.drift()) {
	 		jaegerCrimson.move();
	 		if (jaegerCrimson.scanKaiju()) {
	 			jaegerCrimson.attack();
	 			jaegerCrimson.setArmor(3);
	 			System.out.println("Armor = " + jaegerCrimson.armor);
	 		}
	 	}

	 	if (jaegerStriker.drift()) {
	 		jaegerStriker.move();
	 		if (jaegerStriker.scanKaiju()) {
	 			jaegerStriker.attack();
	 			jaegerStriker.setArmor(5);
	 			System.out.println("Armor = " + jaegerStriker.armor);
	 		}
	 	}
	 

	 }
}