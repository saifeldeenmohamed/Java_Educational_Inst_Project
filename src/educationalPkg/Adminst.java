/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationalPkg;

/**
 *
 * @author SaiF El-deen
 */
public class Adminst extends Person {
    private String contact;
    private String role;

    public Adminst(String contact, String role) {
        this.contact = contact;
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
