package day08;

public class Punch extends TataCars{

	public static void main(String[] args) {
		Punch punch = new Punch();
		punch.musicSystem();
		punch.carDisplay();
		punch.engineType();
		punch.maxSpeed();
		headlight();

	}

	@Override
	void musicSystem() {
		System.out.println("JBL");
	}

	@Override
	void engineType() {
		System.out.println("1600cc");
		
	}

	@Override
	void maxSpeed() {
		System.out.println("110 kph");
		
	}

	@Override
	void carDisplay() {
		System.out.println("110x20p");
		
	}

}
