import java.sql.*;

class TestMain{
	public static void main(String []ar){
		try{
			Connection con = DriverManager.getConnection("jdbc:sqlite:trialdb.db");
			Statement st = con.createStatement();
			
			String query = "CREATE TABLE db" + "(sno integer(3), title varchar(30));";
			st.execute(query);
			st.close();
			con.close();
			System.out.println("Zala de ata theun");
		}
		catch(SQLException e){	
			System.out.println(e);			
		}		
	}
}