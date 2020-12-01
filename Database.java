import java.sql.*;

class Database{
	public static void main(String []ar){
		try{
			Connection con = DriverManager.getConnection("jdbc:sqlite:jdbctrial.db");
			Statement stat = con.createStatement();

			String ct = "CREATE TABLE DB" +
						"( SrNo INTEGER(3), "+
						"Title Varchar(30));";

			stat.executeUpdate(ct);
			stat.close();
			con.close();
			System.out.println("Banla bhau");
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}
}