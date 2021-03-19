/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.ArrayList;

/**
 *
 * @author Preecha
 */
public class InterfaceImpl implements UserInterface {
    
    //Spara användare data
    private static ArrayList<User> list = new ArrayList<User>();

    @Override
    public boolean isLogin(String username, String password) {
        //antar att logningen fail
        boolean flag = false; 
        
        for(User u: list){
            if(u.getName().equals(username) && u.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void register(User user) {
         //Registerings logic
         //Spara alla användare in i en samling
         //
         list.add(user);
    }
    
}
