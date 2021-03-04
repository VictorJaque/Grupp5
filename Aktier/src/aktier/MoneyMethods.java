/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

/**
 *
 * @author Kalle
 */
public interface MoneyMethods {
    void insertMoney() throws InterruptedException; 
    
    void withdrawMoney() throws InterruptedException;
    
    void checkBalance() throws InterruptedException;
    
}
