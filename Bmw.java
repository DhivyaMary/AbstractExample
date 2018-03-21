package AbstractExample;

public class Bmw extends Car implements CarInterface {

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
		startCar();
		stopCar();
	}

	@Override
	public void startCar() {
		System.out.println("Bmw Car Started");

	}

	@Override
	public void stopCar() {
		System.out.println("After some time Bmw car stopped");

	}

}
