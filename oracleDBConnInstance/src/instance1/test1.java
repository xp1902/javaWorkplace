package instance1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class test1 {
	private Connection con;
	private String user = "c##test";
	//private String user="sys as sysdba";
	private String pwd = "12138";
	private String className = "oracel.jdbc.driver.OracelDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public Connection getCon() {
		try {
			con = DriverManager.getConnection(url);
			System.out.println("�������ݿ����ӳɹ�");
			
		}catch(SQLException e) {
			System.out.print(con);
			System.out.println("�������ݿ�����ʧ��");
			con = null;
			e.printStackTrace();
		}
		return con;
	}
	
	 public void closed(){
		  try{
		   if(con!=null){
		    con.close();
		   }
		  }catch(SQLException e){
		   System.out.println("�ر�con����ʧ�ܣ�");
		   e.printStackTrace();
		  }
		 }

	
	public test1() {
		try {
			Class.forName(className);
			System.out.println("����oracle�����ɹ�");
		}catch(ClassNotFoundException e) {
			System.out.println("����oracle����ʧ��");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		test1 c=new test1();
		c.getCon();
		c.closed();
		return;
	}
}
