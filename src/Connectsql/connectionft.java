/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.m_login; 
import model.Delete;

 
public class connectionft {
    private static Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
	}
    
    public int login(m_login account) throws SQLException{

		Connection cnn= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int value = 0;
		try {
			cnn=this.getConnection();
			ps = cnn.prepareStatement("Select username, password from table_user where username=? AND password =?");
			ps.setString(1, account.getusername());
			ps.setString(2,	account.getpw());
			rs = ps.executeQuery();
			if(rs.next())
			{
				value = 1;
			}
		} catch (Exception e) {
			
			System.out.print("ko vao dc");
		}
		finally {
			if(ps != null)
			{
				ps.close();
			}
			else if( cnn != null)
			{
				cnn.close();
			}
		}
		return value;
	}
    
    public int Delete(Delete delete) throws SQLException
	{
    	
		Connection cnn= null;
		PreparedStatement ps = null;
		int value =0;
		try {
			cnn=this.getConnection();
			ps = cnn.prepareStatement("delete from user where ma = ?");
			ps.setString(1, delete.getMA());
			value = ps.executeUpdate();
		} catch (Exception e) {
			System.out.print("ko vao dc");
			
		}
		finally {
			if(ps != null)
			{
				ps.close();
			}
			else if( cnn != null)
			{
				cnn.close();
			}
		}
		return value;
	}
}
