/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

/**
 *
 * @author Victor Jaque <victor.jaque.mte21lin@tucsweden.se>
 */
public class Admin extends User {
    //attribut
    private final boolean isAdmin = true;
    
    public Admin(String password) {
        super("admin", password);
    }

    /**
     * @return the isAdmin
     */
    public boolean isIsAdmin() {
        return isAdmin;
    }
    
}
