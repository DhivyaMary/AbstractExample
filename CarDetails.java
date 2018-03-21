package AbstractExample;

public class CarDetails {

	public static void main(String[] args) {
		System.out.println("Getting Car Details");

		Car c;
		c = new Maruthi();
		c.Display();

		c = new Toyoto();
		c.Display();

		c = new Bmw();
		c.Display();

		/* accessing abstract class methods */
		c.test();
		/* accessing interface methods */
		CarInterface.test();

		System.out.println("Done...........");
	}

}
