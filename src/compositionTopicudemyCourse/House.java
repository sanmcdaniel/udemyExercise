package compositionTopicudemyCourse;

public class House {
	private LivingRoom livingRoom;
	private Kitchen kitchen;
	private BathRoom bathRoom;
	private BedRoom bedroom;
	
	public House(LivingRoom livingRoom, Kitchen kitchen, BathRoom bathRoom, BedRoom bedroom) {
		this.livingRoom = livingRoom;
		this.kitchen = kitchen;
		this.bathRoom = bathRoom;
		this.bedroom = bedroom;
	}

	public LivingRoom getLivingRoom() {
		return livingRoom;
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public BathRoom getBathRoom() {
		return bathRoom;
	}

	public BedRoom getBedroom() {
		return bedroom;
	}
}
