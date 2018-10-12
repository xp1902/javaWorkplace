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
			System.out.println("创建数据库连接成功");
			
		}catch(SQLException e) {
			System.out.print(con);
			System.out.println("创建数据库连接失败");
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
		   System.out.println("关闭con对象失败！");
		   e.printStackTrace();
		  }
		 }

	
	public test1() {
		try {
			Class.forName(className);
			System.out.println("加载oracle驱动成功");
		}catch(ClassNotFoundException e) {
			System.out.println("加载oracle驱动失败");
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
