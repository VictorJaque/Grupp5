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
public class Bank extends Money implements MoneyMethods {  //
    //Attribut för bank
    private float balance;
    Scanner scan;

    
    //Konstruktor
    public Bank (float value, String currency) {
        super(value, currency);
        this.balance = 0;
        
    }
    
    //Metoder
    
    //Sätta in pengar på konto
    @Override
    public void insertMoney() {
        //Boolean till while loop  som inte stänger ner funktionen ifall användaren
        //matar in mer pengar än den har
        boolean waitForInput = true;
        float amount;
        
        while (waitForInput) {
            System.out.println("Sätt in pengar");
            System.out.println("Hur mycket pengar vill du sätta in?");
            this.scan = new Scanner(System.in);
            amount = scan.nextFloat();
            if (amount > value) {
                System.out.println("Du har för lite pengar.");
                System.out.println("Försök igen!");
            } else if (amount < value) { 
                this.balance = amount;
                float newValue = (value - amount);
                SetValue(newValue);  
                checkBalance();
                waitForInput = false;
                System.out.println("Du har nu satt in " + amount + " " + this.currency + " till ditt konto!");
                break;
            }
        }
        
    }
    
    //Ta ut pengar från konto
    @Override
    public void withdrawMoney() {
        //Väntar på kod
        
    }
    
    //Skriver ut saldo 
    @Override
    public void checkBalance() {
        System.out.println("Du har " + this.balance + " " + this.currency + " på ditt konto" );
        
    }
    //Ta ett lån.
    private void applyForLoan() {
                
        
    }
}
