package testGoddness;
import goddness.Goddness;

public class TestGoddness {
	public static void main(String[] args) {
		System.out.println("创建单一实例测试");
		Goddness one = Goddness.getInstance();
		System.out.println(one.getName());
		Goddness two = Goddness.getInstance();
		System.out.println(two.getName());
	}
}
