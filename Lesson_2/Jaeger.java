public class Jaeger {

	String modelName;
	String mark;
	String origin;
	String weapon;
	float height;
	float weight;
	int speed;
	int strength;
	int armor;

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public boolean drift() {
		System.out.println("drift");
		return true;
	}

	public void move() {
		System.out.println("move");
	}

	public boolean scanKaiju() {
		System.out.println("scan Kaiju");
		return true;
	}

	public void attack() {
		System.out.println(modelName + " Attack with " + weapon);
	}
}