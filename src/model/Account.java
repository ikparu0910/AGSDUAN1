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
public class Account {
    
    private String username;
    private String password;
    private String Chucvu;
    
    public Account(String username, String password, String Chucvu, String CurrentUser){
        this.username = username;
        this.password = password;
        this.Chucvu = Chucvu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }
    
    public Account() {
		
	}
}
