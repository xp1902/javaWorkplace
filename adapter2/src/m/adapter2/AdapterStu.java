package m.adapter2;

public class AdapterStu extends Student implements StuA{

	public AdapterStu(Student x) {
		super(x.name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shower() {
		// TODO Auto-generated method stub
		System.out.println("showering now");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleepping now");
	}

}
