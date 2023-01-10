package com.sgtesting.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DatabaseOperationUsingPreparedStatementDemo {

	public static void main(String[] args) {
	//	readRecordsFromTable();
		insertRecordsInToTable();
	}
	
	private static void readRecordsFromTable()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
			
			String strQuery="select * from dept1";
			PreparedStatement stmt= conn.prepareStatement(strQuery);
			ResultSet rs=stmt.executeQuery(strQuery);
			ResultSetMetaData rsdata=rs.getMetaData();
			String deptno1=rsdata.getColumnName(1);
			String dname1=rsdata.getColumnName(2);
			String loc1=rsdata.getColumnName(3);
			System.out.printf("%-12s",deptno1);
			System.out.printf("%-12s",dname1);
			System.out.printf("%-12s",loc1);
			System.out.println();
			while(rs.next())
			{
				String deptno=rs.getString("DEPTNO");
				String dname=rs.getString("DNAME");
				String location=rs.getString("LOCATION");
				System.out.printf("%-12s",deptno);
				System.out.printf("%-12s",dname);
				System.out.printf("%-12s",location);
				System.out.println();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void insertRecordsInToTable()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
			
			String strQuery="insert into dept1 values(60,'MEDICAL','SANJOSE')";
			PreparedStatement stmt= conn.prepareStatement(strQuery);
			stmt.executeQuery(strQuery);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
