package anil.demo.method.override;

public class Bike {

	static class BikeAccessories {
		public void getBikeAccManifaturers() {
			System.out.println("From Super Static getBikeAccManifaturers");
		}

	}

	public void getBikeManifaturers() {
		System.out.println("Tvs/Honda/Hero");

	}

	public void hasGeared() {
		System.out.println("From Super Class");
	}

	public static void noOfWheels() {
		System.out.println("From Super class");
	}
}
