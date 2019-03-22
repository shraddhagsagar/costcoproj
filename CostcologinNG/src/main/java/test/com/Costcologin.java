/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

/**
 *
 * @author vinot
 */
public class Costcologin {
    String emailid;
    String password;
    

    @Override
    public String toString() {
        return "Costcologin{" + "emailid=" + emailid + ", password=" + password + '}';
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
