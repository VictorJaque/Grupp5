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
public class User {
    //användare variabel
    private String name;
    private String password;
    private float debt;
    
    
    public User() {
        super();
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * @return the debt
     */
    public float getDebt() {
        return debt;
    }

    /**
     * @param debt the debt to set
     */
    public void setDebt(float debt) {
        this.debt = debt;
    }
}
