
public class Car extends Vehicle{

	private double gasMileage;
	private int numPassengers;
	
	public Car() {
		super();
		this.gasMileage = 0.0;
		this.numPassengers = 0;
	}
	
	public Car(String xManuName, int xCylinders, String xOwnerName, double xGasMileage, int xNumPassengers) {
		super(xManuName, xCylinders, xOwnerName);
		setGasMileage(xGasMileage);
		setNumPassengers(xNumPassengers);
	}
	
	public double getGasMileage() {
		return gasMileage;
	}
	public int getNumPassengers() {
		return numPassengers;
	}
	
	public void setGasMileage(double xGasMileage) {
		if (xGasMileage < 0) {
			System.out.println("Invalid gas mileage!");
		} else {
			this.gasMileage = xGasMileage;
		}
	}
	public void setNumPassengers(int xNumPassengers) {
		if (xNumPassengers < 0) {
			System.out.println("Invalid number of passengers!");
		} else {
			this.numPassengers = xNumPassengers;
		}
	}
	
	public String toString() {
		return super.toString() +
				"\nGas mileage: " + gasMileage +
				"\nNumber of passengers: " + numPassengers;
	}
}
