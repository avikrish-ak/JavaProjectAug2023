package day08;

public class Nexon extends TataCars{

	public static void main(String[] args) {
		Nexon nexon = new Nexon();
		nexon.musicSystem();
		nexon.carDisplay();
		nexon.engineType();
		nexon.maxSpeed();
		headlight();

	}

	@Override
	void musicSystem() {
		System.out.println("JBL");
	}

	@Override
	void engineType() {
		System.out.println("1100cc");
		
	}

	@Override
	void maxSpeed() {
		System.out.println("120 kph");
		
	}

	@Override
	void carDisplay() {
		System.out.println("120x30p");
		
	}

}
