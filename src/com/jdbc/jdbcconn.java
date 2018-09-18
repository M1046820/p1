

package com.jdbc;
import java.sql.SQLException;
import java.util.*;
public class jdbcconn {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id :");
		int id=sc.nextInt();
		System.out.println("name :");
		String name=sc.next();
		System.out.println("sub1 :");
		String sub1 =sc.next();
		System.out.println("marks 1:");
		int marks1= sc.nextInt();
		System.out.println("sub2 :");
		String sub2=sc.next();
		System.out.println("marks 2:");
		int marks2=sc.nextInt();
		System.out.println("sub3 :");
		String sub3=sc.next();
		System.out.println("marks 3:");
		int marks3=sc.nextInt();
		
		DatabaseConn ob = new DatabaseConn();
		try {
			ob.insert(id,name,sub1,sub2,sub3,marks1,marks2,marks3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ob.getMaxValue();
	}
}
