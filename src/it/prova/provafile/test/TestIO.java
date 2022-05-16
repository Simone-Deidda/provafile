package it.prova.provafile.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) {
		try {
			File txt = new File("prova.txt");
			Scanner scanner = new Scanner(txt);

			File upperCase = new File("uppercase.txt");
			if(upperCase.createNewFile())
				System.out.println("File created.");
			else {
				System.out.println("File already esists.");
			}
			
			FileWriter writer = new FileWriter("uppercase.txt");
			
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				writer.write(data.toUpperCase() + "\n");
				
				System.out.println(data);
			}
			scanner.close();
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
