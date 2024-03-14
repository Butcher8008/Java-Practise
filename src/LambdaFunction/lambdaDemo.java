package LambdaFunction;
interface osama{
	abstract void name(String o);
}

public class lambdaDemo {

	public static void main(String[] args) {
		osama o= (String a)->{
		System.out.println("printing abstract function using lamba function: " + a);	
		};
		o.name("osama");
	}
}
// lamba expression are used taky programmer jo h wo easily ussy excess kr saky bagir extend kiye interface class ko 
