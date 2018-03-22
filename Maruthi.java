package AbstractExample;

public class Maruthi extends Car implements CarInterface {

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

	@Override
	void process(String carName) {
		System.out.println("Changing gear for  " + carName);
		System.out.println("Hearing Song in  FM ......");
		System.out.println("Reached Destination by ......" + carName);

	}

	@Override
	public void startCar() {
		System.out.println("Maruthi Car Started");

	}

	@Override
	public void stopCar() {
		System.out.println(" Maruthi car stopped");

	}

}
