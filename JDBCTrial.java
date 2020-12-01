import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class JDBCTrial{

	public static void main(String []ar){
		Connection con = null;
		try{
			String str = "jdbc:sqlite:jdbctrial.db";
			con = new DriverManager.getConnection(str);

			System.out.println("Connected");
		}catch(SQLException e){
				System.out.println(e);
			}
	}
}