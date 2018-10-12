package java001;
import java.util.Scanner;

public class Out {
	
	static public void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input");
		if(scan.hasNextLine()) {
			String str = scan.nextLine();
			System.out.println(str);
		}
	}
}
