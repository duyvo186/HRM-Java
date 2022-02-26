package controller;
import model.m_login;
import Connectsql.connectionft;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Connectsql.*;
import baocaojava.login;
import baocaojava.trangchu;
import model.*;
public class c_login {

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    private connectionft model;
        
//        public int insertBook(insertIndex insert)
//    	{
//    		int value = 0;
//    		try {
//    			value = dao.insertBook(insert);
//    		} catch (Exception e) {
//    			System.err.println("ERROR"+e.toString());
//    		}
//    		return value;
//    	}
    	
    	//Phần điều khiển xóa sách
    public int loginaccount(m_login account)  {
		int value = 0;
		try {
			value = model.login(account);
		} catch (Exception e) {
			System.err.println("ERROR"+e.toString());
		}
		return value;
	}
    	public int Delete(Delete Delete)
    	{
    		int value = 0;
    		try {
    			value = model.Delete(Delete);
    		} catch (Exception e) {
    			System.err.println("ERROR"+e.toString());
    		}
    		return value;
    	}
    	
    	//Phần điều khiển cập nhật sách
//    	public int upDateBook(upDateIndex upDate, String MASACH)
//    	{
//    		int value = 0;
//    		try {
//    			value = dao.upDateBook(upDate, MASACH);
//    		} catch (Exception e) {
//    			System.err.println("ERROR"+e.toString());
//    		}
//    		return value;
//    	}
    }
    

