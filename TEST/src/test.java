import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	private static Connection connect;

	public static final String TAG_DATABASE = "database";
	public static final String TAG_TABLE = "table";
	public static final String TAG_CREATE_SUPER_USER = "creat_user";

	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "simoorgh-managment-system";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";
	private static final String COMMA_SEP = " ,\n ";

	
	public static void main(String args []){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(DB_URL+DATABASE_NAME, USER_NAME, PASSWORD);
			//String command="DROP DATABASE myfirstdb;";
//			String command ="INSERT INTO human-resource"
//					+" values (?,?,?,?,?,?,?)";
//			PreparedStatement statment = connect.prepareStatement(command);
//			statment.setString(1,"jbj");
//			statment.setString(2,"jkb");
//			statment.setInt(3,234);
//			statment.setInt(4,654);
//			statment.setString(5,"manager");
//			statment.setString(6,"design");
//			statment.setInt(7,896765);
//			
//			//String command2="CREATE TABLE TEST.FIRST;";
//			//System.out.println(command2);
//			statment.executeUpdate();
			String command ="INSERT INTO `simoorgh-managment-system`.`human-resource` VALUES ('jkhjh', 'uhi', 8768, 875, 'EMPLOYEE', 'ANALYSIS','0986');";
			Statement st=connect.createStatement();
			st.executeUpdate(command);
		}
		
		
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
