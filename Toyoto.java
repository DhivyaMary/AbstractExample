package AbstractExample;

public class Toyoto extends Car implements CarInterface {

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

	@Override
	void process(String carName) {
		startCar();
		System.out.println("Changing gear for  " + carName);
		System.out.println("Hearing Song in  FM ......");
		System.out.println("Reached Destination by ......" + carName);
		stopCar();

	}

	@Override
	public void startCar() {
		System.out.println("Toyoto Car Started");

	}

	@Override
	public void stopCar() {
		System.out.println("Toyoto car stopped");

	}

}
