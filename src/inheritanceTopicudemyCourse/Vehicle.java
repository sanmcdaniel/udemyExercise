package inheritanceTopicudemyCourse;

public class Vehicle {
	private int gearNumber;
	private String name;
	private String size;
	
	public Vehicle() {
		this.gearNumber = 1;
	}

	public Vehicle(int gearNumber) {
		this.gearNumber = gearNumber;
	}

	public void changingGear(int gearNumber) {
		System.out.println("You change gear from " + this.gearNumber + " to gear " + gearNumber + ".");
		System.out.println();
		setGearNumber(gearNumber);
	}

	public int getGearNumber() {
		return this.gearNumber;
	}

	public void setGearNumber(int gearNumber) {
		if (gearNumber > 0 && gearNumber <=6) {
			this.gearNumber = gearNumber;
		} else {
			System.out.println("There are only 6 gears, from 1 to 6");
			System.out.println("Your input is " + gearNumber);
			System.out.println();
		}
	}
	
}
