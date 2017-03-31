package inheritanceTopicudemyCourse;

public class Car extends Vehicle {
	String makeATurn;

	public Car() {
		super();
	}

	public void handSteering(String makeATurn) {
		if (setMakeATurn(makeATurn) == 1) {
			System.out.println("Car is turning to " + makeATurn);
			System.out.println();
		} else {
			System.out.println("Unknown command, go straight");
			System.out.println();
		}
	}

	public void moving(int speed) {
		System.out.println("Your are now at gear " + super.getGearNumber() + ".");
//		speed = speed * (1 + (super.getGearNumber()/10));
		System.out.println("You are now driving at " + (speed * (1 + ((float) super.getGearNumber()/10)) + " km/h."));
//		System.out.println("You are now driving at " + speed + " km/h.");
//		System.out.println((float) super.getGearNumber()/10);
		System.out.println();
	}

	public String getMakeATurn() {
		return this.makeATurn;
	}

	public int setMakeATurn(String makeATurn) {
		makeATurn = makeATurn.toLowerCase();
		if (makeATurn.equals("left") || makeATurn.equals("right")) {
			this.makeATurn = makeATurn;
			return 1;
		} else {
			System.out.println("Input must be either Left or Right.");
			System.out.println("Your input is " + makeATurn);
			System.out.println();
			return 0;
		}
		
	}

}
