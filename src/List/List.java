package List;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter the lenght of the list: ");
		int loop=scan.nextInt();
		for(int i=0; i<loop; i++) {
			System.out.println("Enter the number you want to add in the list: ");
			String s= scan.next();
			int input=Integer.parseInt(s);
			l.add(input);
			
		}
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(3, 10);
		System.out.println(l);
		scan.close();
	}

}
