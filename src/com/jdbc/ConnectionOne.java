package com.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;


	public class ConnectionOne {

		Connection con;
		public ConnectionOne() {
			
			String userName="root";
			String password="Welcome123" ;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test",userName,password);
			}
			catch (ClassNotFoundException e) {
				System.out.println("class not found");
				
			}
			catch(SQLException ex)
			{
				System.out.println("SQLEXP");
			}
		}
		
		public Connection sendConnection() {
			return con;
			
		}
		
		public void closeConnection() throws SQLException {
			try {
				
			} finally {
				con.close();
			}
		}

		

}
