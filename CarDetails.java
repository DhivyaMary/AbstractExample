package AbstractExample;

public class CarDetails {

	public static void main(String[] args) {
//		System.out.println("Getting Car Details");

		Car c;
		c = new Maruthi();
		c.process("Maruthi");
		System.out.println("------##-------");

		c = new Toyoto();
		c.process("Toyoto");
		System.out.println("------##-------");

		c = new Bmw();
		c.process("BMW");
		System.out.println("------##-------");

		/* accessing abstract class methods */
		// c.test();
		/* accessing interface methods */
		// CarInterface.test();

		System.out.println(" Testing Done...........");
	}

}
