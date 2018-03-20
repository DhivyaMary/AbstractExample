package AbstractExample;

public class Toyoto extends Car {

	@Override
	String color() {
		return "Red";
	}

	@Override
	Double speedPerkm() {
		return 200.0;
	}

	@Override
	void Display() {
		System.out.println("Toyoto Color is " + color());
		System.out.println("Toyoto Speed Per km is " + speedPerkm());

	}

}
