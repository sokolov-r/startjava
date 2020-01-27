public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private String weapon;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getArmor() {
		return armor;
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