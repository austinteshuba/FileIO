///FileIO.java
//Austin Teshuba
//This is a file IO template for future reference.


import java.io.*;//imports
import java.util.*;
public class file1 {
	public static void main (String[]args) {
		Scanner inFile;//make a new scanner 
		try {
			inFile = new Scanner (new File("test.txt"));//assign an instance to the variable
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		int total = 0;//make a starting total, and add all the integers in the document to the total
		while (inFile.hasNextInt()) {
			int n = inFile.nextInt();
			total += n;
		}
		*/
	}
}
