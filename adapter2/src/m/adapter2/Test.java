package m.adapter2;

public class Test {
	public static void main(String[] args) {
		AdapterStu stu = new AdapterStu(new Student("tlion"));
		stu.shower();
	}
}
