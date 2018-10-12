package string;

public class StringTest {
	public static void main(String[] args) {
		String str = new String("java");

		byte[] byteArr = new byte[] {74, 97, 118, 97};
		String str1 = new String(byteArr);
		
		char[] charArr = new char[] {'L', 'o', 'v', 'e'};
		String str2 = new String(charArr);
		
		char[] arr = str2.toCharArray();
		
		char[] a = {'a', 'b', 'c'};
		String b = String.valueOf(a);
		
		String s = "18";
		byte by = Byte.parseByte(s);
		
		System.out.println(by);
	}
}
