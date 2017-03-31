package inheritanceTopicudemyCourse;
import inheritanceTopicudemyCourse.Nissan;

public class Main {
	Nissan nissan;
    public static void main(String[] args) {
//	    Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
////        dog.eat();
//        dog.walk();
////        dog.run();
    	
    	Nissan sylphy = new Nissan();
    	sylphy.moving(50);
    	sylphy.changingGear(2);
    	sylphy.moving(70);
    	sylphy.changingGear(1);
    	sylphy.moving(40);
    	sylphy.handSteering("Left");
    	sylphy.changingGear(2);
    	sylphy.moving(70);
    	sylphy.changingGear(7);   
    	sylphy.moving(100);
    	sylphy.handSteering("Right");
    	sylphy.changingGear(4);
    	sylphy.moving(120);
    	sylphy.checkNiTrousOxide();
    	sylphy.changingGear(5);
    	sylphy.setNiTrousOxide(true);
    	sylphy.moving(150);
    }
}
