package DB;
import java.sql.*;
import java.util.Scanner;


import ResourceManagment.HumanResource;
import ResourceManagment.Job;
import ResourceManagment.Subsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Driver {

	private static Driver self = null;
	private File dbDescriptor = null;
	private Connection connect = null;

	public static final String TAG_DATABASE = "database";
	public static final String TAG_TABLE = "table";
	public static final String TAG_CREATE_SUPER_USER = "creat_user";

	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "simoorgh-managment-system";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";
	private static final String COMMA_SEP = " ,\n ";



	public static Driver getInstance() {
		if (self == null) {
			System.out.println("create new driver");
			return new Driver();
		}
		System.out.println("the driver is exist");
		return self;
	}
	public Driver(){

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(DB_URL+DATABASE_NAME, USER_NAME, PASSWORD);
			System.out.println("connection stablish");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection not stablish");
		}


	}


	public void insertHumanResource(String tableName,Object...args ) {
		//		try {
		//			String command = "INSERT INTO " +DATABASE_NAME+"."+ "human-resource" + " VALUES ("
		//					+ hr.firstName+","+hr.lastName+","+ hr.melliNo +","+hr.employeeNo+","
		//					+ hr.job.toString()+","+hr.subsystem.toString()+","
		//					+hr.StartDate+")";
		//			// PreparedStatements can use variables and are more efficient
		//			Statement statment = connect.createStatement();
		//			System.out.println(command);
		//			statment.executeUpdate(command);
		//
		//
		//		} catch (SQLException e) {
		//			e.printStackTrace();
		//		}
		//
		try{
		String command = "INSERT INTO " + "`simoorgh-managment-system`.`human-resource`" + " VALUES (";
		for (int i = 0; i < args.length-1; i++)
			command += " ?,";
		command += "?);";

		// PreparedStatements can use variables and are more efficient
		PreparedStatement statment = connect.prepareStatement(command);

		for (int i = 1; i <= args.length; i++)
			statment.setObject(i, args[i - 1]);

		System.out.println(statment.toString());
		statment.executeUpdate();



	} 
	catch(Exception e)
	{
		e.printStackTrace();
	}
	//catch (Exception e) {
		//e.printStackTrace();
	//}
}
}





