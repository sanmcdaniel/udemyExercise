package inheritanceTopicudemyCourse;

public class Nissan extends Car{
	public boolean niTrousOxide;
	public Nissan() {
		super();
	}
	
	@Override
	public void moving(int speed) {
		if (niTrousOxide == true) {
			speed *= 1.25; 
			System.out.println("Nitrous Oxide has been triggered, 25% speed boosted!!!");
		}
		super.moving(speed);
	}

	public boolean checkNiTrousOxide() {
		return this.niTrousOxide;
	}

	public void setNiTrousOxide(boolean niTrousOxide) {
		System.out.println("NitrousOxide is set to " + niTrousOxide);
		this.niTrousOxide = niTrousOxide;
	}
	
}
