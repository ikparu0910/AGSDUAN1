/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connectdtb.ConnectToDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Phong;

/**
 *
 * @author GAMING-PC
 */
public class PhongDao{
    
    public ArrayList<Phong> getListphong(){
        ArrayList<Phong> listPhong = new ArrayList<Phong>();
        Phong phong = null;
        String str = "select * from phong";
        
        try{
            PreparedStatement pst = ConnectToDB.getConnection().prepareStatement(str);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                phong  = new Phong();
                phong.setMaP(rs.getString(1));
                phong.setTenP(rs.getString(2));
                phong.setMaLoaiP(rs.getString(3));
                phong.setSonguoi(rs.getInt(4));
                if(rs.getString(5) == "A"){
                    phong.setTinhtrangP("Checkin");
                }else if(rs.getString(5) == "W"){
                    phong.setTinhtrangP("Đang dọn dẹp");
                }else{
                    phong.setTinhtrangP("Trống");
                }
                phong.setMaKH(rs.getString(6));
                
                listPhong.add(phong);
            }
        }
        catch (Exception e) {
            listPhong = null;
        }
        
        return listPhong;
    }
}
