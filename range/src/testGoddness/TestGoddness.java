package testGoddness;
import goddness.Goddness;

public class TestGoddness {
	public static void main(String[] args) {
		System.out.println("������һʵ������");
		Goddness one = Goddness.getInstance();
		System.out.println(one.getName());
		Goddness two = Goddness.getInstance();
		System.out.println(two.getName());
	}
}
