package student;

public abstract class Student {
	public String name;
	protected static int courseNum = 3;
	int[] courses;
	public String courseGrade;
	public String level;
	
	public abstract void calCG();
	
	public Student(String name) {
		this.name = name;
		courseGrade = "";
		courses = new int[courseNum];
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {

		return name;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel() {

		return level;
	}

	public void setCourses(int no, int score) {
		courses[no] = score;
	}
	public int getCourses(int no) {
		return courses[no];
	}
}
