package jdbcselectstmtexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) {
		// step1 => to register the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		//step 2 => Establish the connection to DB
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moriech", "root", "1233");
		//step 3 = > Create a statement
		    Statement stmt = con.createStatement();
	    //step 4 => Execute the statement
		    ResultSet rs = stmt.executeQuery("select * from movie");
		//step 5 => show the result
		    while(rs.next()) {
		    	
		    	System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getFloat(5));
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
