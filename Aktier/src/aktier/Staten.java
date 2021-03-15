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

 

    private Scanner scan;
    
    
    public Staten(float value, String currency) {
        super(value, currency);
        scan = new Scanner(System.in);
    }

 

    @Override
    public void insertMoney(float userBalance) throws InterruptedException {
        System.out.println("Du har nu " + userBalance +Meny.userInputCurrency);
       
       Meny.SkatteMainMenu();

 

    }

 

    @Override
    public void withdrawMoney(float userBalance) throws InterruptedException {
        
        System.out.println("Du har " + userBalance +  " " + Meny.userInputCurrency);
        
        Meny.SkatteMainMenu();

 

    }

 

    @Override
    public void checkBalance(float userBalance) throws InterruptedException {
        
        System.out.println("Du har nu " + userBalance + " " +Meny.userInputCurrency);
        
        Meny.SkatteMainMenu();
        
        
    }
    
    public static void BetalaSkatt() throws InterruptedException {
        float komunalskatt = (float) 33.4;
        float userSkatt = 0;
        System.out.print("Hur mycket tjänar du varje månad? ");
        Scanner newScan = new Scanner(System.in);
        float amount;
        amount = newScan.nextFloat();
        
        userSkatt = amount * (komunalskatt/100);
        if (Meny.userBalance < userSkatt){
            System.out.println("Du har inget tillräckligt pengar, först sätta in pengar ");
            Meny.SkatteMainMenu();
        } else{
            Meny.userBalance -= userSkatt;
            System.out.println("Skatten "+ userSkatt + " är betald nu och du har " + Meny.userBalance + " " + Meny.userInputCurrency);
        }
    }

 

    private void setScan(Scanner scan) {
        this.scan = scan;

 

    }
        
    private Scanner getScan() {
        scan = new Scanner(System.in);
        return scan;
    }
}

