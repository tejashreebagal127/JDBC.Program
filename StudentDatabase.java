package com.jdbc.std;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;

		public class Employee {
				public static void main(String[] args) 
				{
					
					String url="jdbc:mysql://localhost:3306/java";
					String username="root";
		        	String password="W@2915djkq#";
					String sql="INSERT INTO employee VALUES(1,'TEJASHREE','tejashree@mail.com') ";
					Connection connection = null;
					//step 1:load/register the driver
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						//2:establish connection 
						connection=DriverManager.getConnection(url, username, password);
						
						//3:establish connection
						Statement statement= connection.createStatement();
						
						//4:execute the statement
						statement.execute(sql);
						//5: close connection
						connection.close();
						
						System.out.println("all  good");

					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						try {
							connection.close();
							System.out.println("All Good");
							}
						catch(SQLException e){
							e.printStackTrace();
						}
					}
					
				}

	}


