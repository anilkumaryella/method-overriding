package anil.demo.method.override;

public class TvsBike extends Bike {

	static class BikeAccessories {
		public void getBikeAccManifaturers() {
			System.out.println("From Sub Static getBikeAccManifaturers");
		}

	}

	public void hasGeared() {
		System.out.println("From Sub Class");
	}

	public void isScootyAvailable() {
		System.out.println("Yes");
	}

	public static void noOfWheels() {
		System.out.println("From Sub class");
	}
}
