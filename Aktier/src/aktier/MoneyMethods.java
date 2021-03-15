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
    void insertMoney(float userBalance) throws InterruptedException; 
    
    void withdrawMoney(float userBalance) throws InterruptedException;
    
    void checkBalance(float userBalance) throws InterruptedException;
    
}
