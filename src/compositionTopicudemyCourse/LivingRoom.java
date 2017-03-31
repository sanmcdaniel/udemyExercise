package compositionTopicudemyCourse;

public class LivingRoom {
	
	public LivingRoom() {
		
	}

	public void watchTelevision(boolean onOff, String tvProgram) {
		if (onOff) {
			System.out.println("You are now watching " + tvProgram + ".");
		} else {
			System.out.println("TV is off, you cannot watch " + tvProgram + ".");
		}
	}
	
	public void watchTelevision(boolean onOff) {
		if (onOff) {
			System.out.println("TV is on.");
		} else {
			System.out.println("TV is off.");
		}
	}
	
	public void computer(boolean onOff, String computerProgram) {
		if (onOff) {
			System.out.println("Computer is on.");
			System.out.println(computerProgram + " is opened.");
		} else {
			System.out.println("Computer is off, you cannot open " + computerProgram + ".");
		}
	}
	
	public void sofa(String action) {
		System.out.println("You " + action + " on sofa.");
	}
}
