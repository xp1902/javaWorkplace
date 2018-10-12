package goddness;

public class Goddness {
	private String name;
	private static Goddness goddness = null;
	private Goddness() {
		System.out.println("正在初始化goddness");
		setName("me");
	}
	public static Goddness getInstance() {
		if(goddness  == null) {
			goddness = new Goddness();
		}
		return goddness;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public  String getName() {
		return name;
	}
}
