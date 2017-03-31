package compositionTopicudemyCourse;

public class HouseUser {
	public static void main(String[] args) {
		LivingRoom livingRoom = new LivingRoom();
		BedRoom bedRoom = new BedRoom();
		BathRoom bathRoom = new BathRoom();
		Kitchen kitchen = new Kitchen();
		
		House house = new House(livingRoom, kitchen, bathRoom, bedRoom);
		house.getLivingRoom().watchTelevision(true, "I can see your voice.");
		house.getLivingRoom().watchTelevision(true, "The mask singer");
		house.getLivingRoom().watchTelevision(false);
	}
}
