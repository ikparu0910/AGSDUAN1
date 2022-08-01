/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author GAMING-PC
 */
public class Phong {
    private String MaP;
    private String TenP;
    private String MaLoaiP;
    private int Songuoi;
    private String TinhtrangP;
    private String MaKH;
    

    
    
    public Phong(String MaP, String TenP, String MaLoaiP, int Songuoi, String TinhtrangP, String MaKH){
        this.MaP = MaP;
        this.TenP = TenP;
        this.MaLoaiP = MaLoaiP;
        this.Songuoi = Songuoi;
        this.TinhtrangP = TinhtrangP;
        this.MaKH = MaKH;
    }
    
    public Phong(){
        
    }

    public String getMaP() {
        return MaP;
    }

    public void setMaP(String MaP) {
        this.MaP = MaP;
    }

    public String getTenP() {
        return TenP;
    }

    public void setTenP(String TenP) {
        this.TenP = TenP;
    }

    public String getMaLoaiP() {
        return MaLoaiP;
    }

    public void setMaLoaiP(String MaLoaiP) {
        this.MaLoaiP = MaLoaiP;
    }

    public int getSonguoi() {
        return Songuoi;
    }

    public void setSonguoi(int Songuoi) {
        this.Songuoi = Songuoi;
    }

    public String getTinhtrangP() {
        return TinhtrangP;
    }

    public void setTinhtrangP(String TinhtrangP) {
        this.TinhtrangP = TinhtrangP;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }


    
    
    
}
