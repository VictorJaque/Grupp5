/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

/**
 *
 * @author preec 
 */
public interface UserInterface {
    
    /**
    *  Detta är användarens loggnings funktion
    *  @param username login username
    *  @param password login password
    *  @return ätervänder värde om logningen lyckas oavsett
    */
    
    public abstract boolean isLogin(String username, String password) ;
    /**
     * 
     * @param user användare som behöver registrera
     */
    
    public abstract void register (User user);
}
