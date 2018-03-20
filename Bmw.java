package AbstractExample;

public class Bmw extends Car {

	@Override
	String color() {
		return "Black";
	}

	@Override
	Double speedPerkm() {
		return 500.0;
	}

	@Override
	void Display() {
		System.out.println("Bmw Color is " + color());
		System.out.println("Bmw Speed Per km is " + speedPerkm());
	}

}
