package mysqlTest;

public class DBTest{
	
	public static void main(String args[]) {
	    JDBCOperation.getAll();
	    JDBCOperation.insert(new Student("Achilles", "Male", "14"));
	    JDBCOperation.getAll();
	    JDBCOperation.update(new Student("Bean", "", "7"));
	    JDBCOperation.delete("Achilles");
	    JDBCOperation.getAll();
	}
}