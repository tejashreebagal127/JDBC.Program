package com.jdbc.std;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveEmp {
	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/java";
		String username="root";
		String password="W@2915djkq#";
		
		
		Connection connection= null;
		try {
			
		//STEP1: LOAD/REGISTER THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//STEP2: ESTABLISH THE CONNECTION
			connection=DriverManager.getConnection(url, username, password);
			
		//STEP3:CREATE STATEMENT
			Statement statement = connection.createStatement();
			
		//STEP4:EXECUTE STATEMENT
			statement.execute("INSERT INTO employee VALUES (1,'abc','abc@gmail.com')");
			statement.execute("INSERT INTO employee VALUES (2,'xyz','xyz@gmail.com')");
			statement.execute("INSERT INTO employee VALUES (3,'lmn','lmn@gmail.com')");
			System.out.println("data inserted!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				System.out.println("onnection Closed!!");
			}catch (SQLException e) {
				e.printStackTrace();
			}
			}
		}
	}

