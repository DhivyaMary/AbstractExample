package AbstractExample;

/* We cannot instantiate abstract class */
abstract class Car {

	/* This abstract method or variable will tell to extend in subclasses */
	abstract String color();

	abstract Double speedPerkm();

	/* abstract method we can't implement method body here */
	abstract void Display();

	/*
	 * This won't tell to extend in subclasses..... But we can call this method
	 * throw subclasses object
	 */
	void test() {
		System.out.println("This is abstract class");
	}

	/*
	 * We can create main method in abstract class
	 * 
	 * This main method doesn't need object to instantiate this abstract class
	 * because static method will call without creating object
	 */
	public static void main(String args[]) {
		System.out.println("Abstract Class main method : ");
	}

	abstract void process(String carName);
}
