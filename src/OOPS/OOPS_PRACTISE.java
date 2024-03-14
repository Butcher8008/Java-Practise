package OOPS;

class practise{
	String name;
	int age;
	double height;
	
	practise(String name, int age, double height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
	void display() {
		System.out.println("Name: "+name+"Age: "+age+"Height: "+height);
	}
}


public class OOPS_PRACTISE {

	public static void main(String[] args) {
		practise p=new practise("Osama", 24, 5.8);
		p.display();

	}

}
