/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

    /**
     * 
     * @throws InterruptedException
     */
    @Override
    public void insertMoney()throws InterruptedException  {
        //Metod för att sätta in pengar.
        //Boolean till while loop  som inte stänger ner funktionen ifall användaren
        //matar in mer pengar än den har
        boolean waitForInput = true;
        float amount;
        //While loop som kollar att användaren har tillräckligt med pengar för att kunna sätta in på sitt saldo 
        while (waitForInput) {
            System.out.println("Sätt in pengar");
            System.out.println("Hur mycket pengar vill du sätta in?");
            this.scan = new Scanner(System.in);
            amount = scan.nextFloat();
            if (amount > value) {
                System.out.println("Du har för lite pengar.");
                System.out.println("Försök igen!");
            } else if (amount < value) { 
                this.balance += amount;
                float newValue = (value - amount);
                SetValue(newValue);  
                checkBalance();
                waitForInput = false;
                System.out.println("Du har nu satt in " + amount + " " + this.currency + " till ditt konto!");
                TimeUnit.SECONDS.sleep(1); //Stannar upp konsolen så användaren hinner se vad som hänt
                break;
            }
        }
        
    }
    


    /**
     * 
     * @throws InterruptedException
     */
    @Override
    public void withdrawMoney() throws InterruptedException {
        //Metod för att ta ut pengar
        //Samma logik som ovan fast att den tar ut istället för att sätta in
        boolean waitForInput = true;
        float amount;
        
        while (waitForInput) {
            System.out.println("Ta ut pengar");
            System.out.println("Hur mycket pengar vill du ta ut?");
            this.scan = new Scanner(System.in);
            amount = scan.nextFloat();
            if (amount > this.balance) {
                System.out.println("Du har för lite pengar på ditt konto.");
                System.out.println("Försök igen!");
            } else if (amount < this.balance) {
                this.balance -= amount;
                float newValue = (value + amount);
                SetValue(newValue);
                checkBalance();
                waitForInput = false;
                System.out.println("Du har nu tagit ut " + amount + " " + this.currency + " från ditt konto!");
                TimeUnit.SECONDS.sleep(1); //stannar konsolen i en sekund så användaren hinner se vad som händer
                break;
            }
        }
    }
    
    //Skriver ut saldo 
    @Override
    public void checkBalance() {
        System.out.println("Du har " + this.balance + " " + this.currency + " på ditt konto" );
        
    }
    //Ta ett lån.
    private void applyForLoan() {
                
        
    }

    void takeLoan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
