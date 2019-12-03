package anil.demo.method.override;

public class Main {

	private int id = 0;

	public static void main(String[] args) {

		Bike bike1 = new Bike();// only super class methods are visible
		Bike bike2 = new TvsBike();// super class methods+sub class overriden
									// methods
		TvsBike bike3 = new TvsBike();// super class methods+sub class overriden
										// methods+other subclass methods
		bike1.getBikeManifaturers();
		bike1.hasGeared();

		bike2.getBikeManifaturers();
		bike2.hasGeared();

		bike3.getBikeManifaturers();
		bike3.hasGeared();
		bike3.isScootyAvailable();

		// if methods are static overriding magic wont work

		bike1.noOfWheels();
		bike2.noOfWheels();
		bike3.noOfWheels();

	}

}
