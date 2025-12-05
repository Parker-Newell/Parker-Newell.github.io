
public class Truck extends Vehicle {

	private double loadCap;
	private double towCap;
	
	public Truck() {
		super();
		this.loadCap = 0.0;
		this.towCap = 0.0;
	}
	
	public Truck(String xManuName, int xCylinders, String xOwnerName, double xLoadCapacity, double xTowingCapacity) {
		super(xManuName, xCylinders, xOwnerName);
		setLoadCapacity(xLoadCapacity);
		setTowingCapacity(xTowingCapacity);
	}
	
	public double getLoadCapacity() {
		return loadCap;
	}
	public double getTowingCapacity() {
		return towCap;
	}
	
	public void setLoadCapacity(double xLoadCapacity) {
		if (xLoadCapacity < 0) {
			this.loadCap = 0;
		} else {
			this.loadCap = xLoadCapacity;
		}
	}
	public void setTowingCapacity(double xTowingCapacity) {
		if(xTowingCapacity < 0) {
			this.towCap = 0;
		} else {
			this.towCap = xTowingCapacity;
		}
	}
	
	public String toString() {
		return super.toString() +
				"\nLoad capacity (tons): " + loadCap +
				"\nTowing capacity (tons): " + towCap;
	}
}
