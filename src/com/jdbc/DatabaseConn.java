package com.jdbc;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class DatabaseConn {

		Connection con; 
		public DatabaseConn() {
			ConnectionOne ob = new ConnectionOne();
			con=ob.sendConnection();
		}
		
		
		public void insert(int id, String name, String sub1, String sub2, String sub3, int marks1, int marks2, int marks3) throws SQLException {
			PreparedStatement ps1 = con.prepareStatement("insert into students values(?,?,?,?)");
			ps1.setInt(1, id);
			ps1.setString(2, name);
			ps1.setString(3, sub1);
			ps1.setInt(4, marks1);
			
			ps1.executeUpdate();
			
			
			PreparedStatement ps2 = con.prepareStatement("insert into students values(?,?,?,?)");
			ps2.setInt(1, id);
			ps2.setString(2, name);
			ps2.setString(3, sub2);
			ps2.setInt(4, marks2);
			
			ps2.executeUpdate();
			
			PreparedStatement ps3 = con.prepareStatement("insert into students values(?,?,?,?)");
			ps3.setInt(1, id);
			ps3.setString(2, name);
			ps3.setString(3, sub3);
	
			ps3.setInt(4, marks3);
			//Assert.assertEquals(3,4);
			System.out.println(" ARE  not EQUAL");
			
			ps3.executeUpdate();
			
		}


		public void getMaxValue() {
			// TODO Auto-generated method stub
			ResultSet rs = null;
			try {
				PreparedStatement ps2 = con.prepareStatement("select subname,marks from students order by marks desc limit 1");
				rs=ps2.executeQuery();
				while(rs.next()) {
					System.out.println("subject of maximum marks is:");
					System.out.println(rs.getString(1)+" "+rs.getInt(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
