package AbstractExample;

public interface CarInterface {

	void startCar();

	void stopCar();

	/* We can use static or default modifiers methods only in interface */
	static void test() {
		System.out.println("Hii im interface");
	}

	public static void main(String args[]) {
		System.out.println("Interface main method : ");
	}

}
