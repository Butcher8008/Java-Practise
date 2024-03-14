package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hellow world");
		File file= new File("E:\\Java Work Space\\Practise\\osama.txt");
		BufferedReader reader= new BufferedReader(new FileReader(file));
		
		String st;
		int Line=0;
		
		while((st = reader.readLine()) != null) {
			Line=Line+1;
			System.out.println( Line +"."+st);
		}
		System.out.println("Number of lines are: "+Line);
		reader.close();
	}

}
