package OOPS;
interface shape{
	void draw();
	default void fill() {
		System.out.println("Filling");
	
}
}
class circle implements shape{
	public void draw() {
		System.out.println("Drawing a circle");
	}
	
}
public class interfaces {

	public static void main(String[] args) {
		shape c=new circle();
		c.draw();
		c.fill();
	}
}
