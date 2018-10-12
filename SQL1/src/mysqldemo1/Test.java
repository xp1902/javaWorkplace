package mysqldemo1;

import java.io.Reader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.rowset.CachedRowSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		if(args.length != 4) {
//			System.out.println("Wrongly input");
//			System.exit(-1);
//		}
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/tlion";
	    String username = "root";
	    String password = "121380";
	    
	    try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	  
	    try(Connection conn = (Connection) DriverManager.getConnection(url, username, password)) {
	    	String sql0 = "insert into student values('xp1901', 'm', '2000-10-10', 'American')";
	    	String sql = "select * from student";
//	    	String sql1 = "insert into student values(?, ?, ?, ?)";
//		    PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql1, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//	        stmt.setString(1, args[0]);
//	        stmt.setString(2, args[1]);
//	        stmt.setDate(3, (java.sql.Date) new Date(args[2]));
//	        stmt.setString(4, args[3]);
//		    stmt.executeUpdate();       
	        Statement stmt2 = (Statement) conn.createStatement();
//	        stmt2.executeUpdate(sql);
	        ResultSet rs = stmt2.executeQuery(sql);
		    
	        //可更新的结果集
//	        Statement stmt2 = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//	        ResultSet rs = stmt2.executeQuery(sql);
//	        rs.next();
//	        rs.moveToInsertRow();
//	        rs.updateString("name", "xp1902");
//	        rs.insertRow();
//	        rs.moveToCurrentRow();

	        int col = rs.getMetaData().getColumnCount();//获得表格的列数
		    System.out.println("============================");
			while (rs.next()) {
				for (int i = 1; i <= col; i++) {
		        	System.out.print(rs.getString(i) + "\t");
		        	if ((i == 2) && (rs.getString(i).length() < 8)) {
		        		System.out.print("\t");
		        	}
				}
		    	System.out.println("");
			}
		    System.out.println("============================");
		    
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
