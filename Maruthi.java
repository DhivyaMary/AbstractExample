package AbstractExample;

public class Maruthi extends Car {

	@Override
	String color() {
		return "Blue";
	}

	@Override
	Double speedPerkm() {
		return 150.0;
	}

	@Override
	void Display() {
		System.out.println("Maruthi Color is " + color());
		System.out.println("Maruthi Speed Per km is " + speedPerkm());

	}

}
