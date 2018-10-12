package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
	private static Scanner scan;
	public static void main(String[] args) {
		openFile();
		readFile();
		closeFile();
	}
	private static void openFile() {
		try {
			scan = new Scanner(Paths.get("d:" + File.separator + "credits.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}
	private static void readFile() {
		try {
			while(scan.hasNext()) {
				System.out.printf("-10%d-12%s-12%s10%f", scan.nextInt(), scan.next(), scan.next(), scan.nextDouble());
			}
		}
		catch(NoSuchElementException e) {
			
		}
		catch(IllegalStateException e) {
			
		}
	}
	private static void closeFile() {
		if(scan != null) {
			scan.close();
		}
	}
}
