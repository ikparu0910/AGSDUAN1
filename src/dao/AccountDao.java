/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connectdtb.ConnectToDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;

/**
 *
 * @author GAMING-PC
 */
public class AccountDao {

    
    public boolean insert(Account account) {
		String str = "insert into taikhoan values(?, ?, ?)";
		try {
			PreparedStatement pst = ConnectToDB.getConnection().prepareStatement(str);
			pst.setString(1, account.getUsername());
			pst.setString(2, account.getPassword());
			pst.setString(3, account.getChucvu());
			
			return pst.executeUpdate() > 0;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	public Account search(String id) {
		Account account = new Account();
		String str = "select * from taikhoan where username=?";
		try {
			PreparedStatement pst = ConnectToDB.getConnection().prepareStatement(str, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.isBeforeFirst() == false) {
				account.setUsername(null);
				account.setPassword(null);
				account.setChucvu(null);
			}
			else {
				rs.next();
				account.setUsername(rs.getString(1));
				account.setPassword(rs.getString(2));
				account.setChucvu(rs.getString(3));
			}
		}
		catch (Exception ex) {
			account = null;
		}
		
		return account;
	}
	
	public boolean updateAccount(Account account) {
		String str = "update taikhoan set password=?, Chucvu=? where username=?";
		try {
			PreparedStatement pst = ConnectToDB.getConnection().prepareStatement(str);
			pst.setString(3, account.getUsername());
			pst.setString(1, account.getPassword());
			pst.setString(2, account.getChucvu());
			
			return pst.executeUpdate() > 0;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	public boolean delete(Account account) {
		String str = "delete from NguoiDung where TenTaiKhoan=?";
		try {
			PreparedStatement pst = ConnectToDB.getConnection().prepareStatement(str);
			pst.setString(1, account.getUsername());
			
			return pst.executeUpdate() > 0;
		}
		catch (Exception ex) {
			return false;
		}
	}

 
}
