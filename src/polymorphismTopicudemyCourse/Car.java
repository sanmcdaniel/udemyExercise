package polymorphismTopicudemyCourse;

public class Car {
	private boolean engine = true;
	private int noOfCylinders = 8;
	private String cylindersName = "Four-Stoke Cycle";
	private int noOfWheels = 4;

	public Car(boolean engine, int noOfCylinders, String cylindersName, int noOfWheels) {
		this.engine = engine;
		this.noOfCylinders = noOfCylinders;
		this.cylindersName = cylindersName;
		this.noOfWheels = noOfWheels;
	}
	
	
	public boolean getEngine() {
		return engine;
	}


	public void setEngineType(boolean engine) {
		this.engine = engine;
	}


	public int getNoOfCylinders() {
		return noOfCylinders;
	}


	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}


	public String getCylindersName() {
		return cylindersName;
	}


	public void setCylindersName(String cylindersName) {
		this.cylindersName = cylindersName;
	}


	public int getNoOfWheels() {
		return noOfWheels;
	}


	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public void startEngine() {
		if (engine) {
			System.out.println("This message is from based class.");
			System.out.println("Engine has been started!");
		} else {
			System.out.println("This message is from based class.");
			System.out.println("There is no engine, cannot start!");
		}
	}
	
	public void accelerate() {
		System.out.println("This message is from based class.");
	}
	
	public void brake() {
		System.out.println("This message is from based class.");
	}

}
