/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.Scanner;

/**
 *
 * @author Victor Jaque <victor.jaque.mte21lin@tucsweden.se>
 */
public class Staten extends Money implements MoneyMethods{

 

    public Scanner scan;
    
    
    public Staten(float value, String currency) {
        super(value, currency);
    }

 

    @Override
    public void insertMoney() throws InterruptedException {
        System.out.println("Du har nu " + Meny.userBalance +Meny.userInputCurrency);
       
       Meny.SkatteMainMenu();

 

    }

 

    @Override
    public void withdrawMoney() throws InterruptedException {
        
        System.out.println("Du har " + Meny.userBalance +  " " + Meny.userInputCurrency);
        
        Meny.SkatteMainMenu();

 

    }

 

    @Override
    public void checkBalance() throws InterruptedException {
        
        System.out.println("Du har nu " + Meny.userBalance + " " +Meny.userInputCurrency);
        
        Meny.SkatteMainMenu();
        
        
    }
    
    public void BetalaSkatt() throws InterruptedException{
       this.setScan(new Scanner(System.in));
       float komunalskatt = (float) 33.4;
       float userSkatt = 0;
        System.out.print("Hur mycket tjänar du varje månad? ");
        float amount;
        amount = getScan().nextFloat();
        
        userSkatt = amount * (komunalskatt/100);
        if (Meny.userBalance < userSkatt){
            System.out.println("Du har inget tillräckligt pengar, först sätta in pengar ");
            Meny.SkatteMainMenu();
        } else{
            Meny.userBalance -= userSkatt;
             System.out.println("Skatten "+userSkatt+" har betalt nu och du har nu "+Meny.userBalance+ " "+ Meny.userInputCurrency);
        }

 

    }

 

    private void setScan(Scanner scan) {
        this.scan = scan;

 

    }
        
    private Scanner getScan() {
        return scan;
    }
}