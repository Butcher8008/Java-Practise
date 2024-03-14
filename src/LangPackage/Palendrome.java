package LangPackage;

import java.util.Scanner;

class check{
	boolean show(String word) {
		
		String rev="";
		boolean condition;
		for (int i =word.length()-1; i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
		if(word.equals(rev)) {
			System.out.println("Word: " + word + " is palinderom: " + rev );
			condition=true;
			return condition;
		}
		else {
			System.out.println("the word is not a palinderom");
			condition = false;
			return condition;
		}
	}
}

public class Palendrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the any word to check wether the word is palendrom or not: ");
		String word = s.next().toLowerCase();
		check c= new check();
		c.show(word);
		s.close();
	}

}
