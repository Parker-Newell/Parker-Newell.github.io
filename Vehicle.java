
public class Vehicle {

	private String manuName;
	private int cylinders;
	private String ownersName;
	
	public Vehicle() {
		this.manuName = "No name";
		this.cylinders = 4;
		this.ownersName = "No name";
	}
	
	public Vehicle(String xManuName, int xCylinders, String xOwnersName) {
	this.setManuName(xManuName);
	this.setCylinders(xCylinders);
	this.setOwnersName(xOwnersName);
}

	public String getManuName() {
		return manuName;
	}
	public int getCylinders() {
		return cylinders;
	}
	public String getOwnersName() {
		return ownersName;
	}
	
	public void setManuName(String xManuName) {
		if (xManuName == "Toyota" 
				|| xManuName == "Honda"
				|| xManuName == "Chevy"
				|| xManuName == "Ford"
				|| xManuName == "Nissan") {
			this.manuName = xManuName;
		} else {
			System.out.println("Invalid manufacturer!");
		}
	}
	public void setCylinders(int xCylinders) {
		if (xCylinders < 4 || xCylinders > 8) {
			System.out.println("Invalid number of cylinders!");
		} else {
			this.cylinders = xCylinders;
		}
	}
	public void setOwnersName(String xOwnersName) {
		this.ownersName = xOwnersName;
	}
	
	public String toString() {
		return "Manufacturer: " + manuName +
				"\nCylinders: " + cylinders + 
				"\nOwner: " + ownersName;
	}
}