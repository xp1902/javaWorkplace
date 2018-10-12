package UnderGraduates;
import student.Student;

public class Undergraduates extends Student{

	public Undergraduates(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		level = "undergraduate";
	}

	@Override
	public void calCG() {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 0; i < courseNum; i ++) {
			total += super.getCourses(i);
		}
		if(total >= 270) courseGrade = "ÓÅÐã";
		else if(total >= 180 && total < 270) courseGrade = "ºÏ¸ñ";
	}

	public static void main(String[] args) {
		Student stu1 = new Undergraduates("tlion");
		for(int i = 0; i < 3; i++) {
			stu1.setCourses(i, 90);
		}
		stu1.calCG();
		System.out.println(stu1.name + "    "+ stu1.level + "    " + stu1.courseGrade);
	}
}
