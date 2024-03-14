package OOPS;
// we cannot create object for abstrract class and interfaces

abstract class vehical{
	abstract void drive();
	void applyBreak() {
		System.out.println("Changing Gear");
	}
}
class car extends vehical{
	void drive() {
		System.out.println("Driving car");
	}
	
	void changeGear() {
		System.out.println("changing gear");
	}
	
}
public class AbstractionClass {

	public static void main(String[] args) {
		vehical car=new car();
		car.drive();
		car.applyBreak();
//		car.changeGear(); while give error
		car c=new car();
		c.changeGear();
	}

}
