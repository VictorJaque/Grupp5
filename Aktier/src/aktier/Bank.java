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
    private Scanner scan;
    private static float debt = 0;
    private static float totalLoan = 0;
    private final float interest;

    
    //Konstruktor
    public Bank (float value, String currency) {
        super(value, currency);
        interest = (float)3.4; //sätter ränta för lån
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
            this.setScan(new Scanner(System.in));
            amount = getScan().nextFloat();
            if (amount > GetValue()) {
                System.out.println("Du har för lite pengar.");
                System.out.println("Försök igen!");
            } else if (amount < GetValue()) { 
                Meny.userBalance += amount;
                float newValue = (GetValue() - amount);
                SetValue(newValue);  
                checkBalance();
                waitForInput = false;
                System.out.println("Du har nu satt in " + amount + " " + GetCurrency() + " till ditt konto!");
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
            this.setScan(new Scanner(System.in));
            amount = getScan().nextFloat();
            if (amount > Meny.userBalance) {
                System.out.println("Du har för lite pengar på ditt konto.");
                System.out.println("Försök igen!");
            } else if (amount < Meny.userBalance) {
                Meny.userBalance -= amount;
                float newValue = (GetValue() + amount);
                SetValue(newValue);
                checkBalance();
                waitForInput = false;
                System.out.println("Du har nu tagit ut " + amount + " " + GetCurrency() + " från ditt konto!");
                TimeUnit.SECONDS.sleep(1); //stannar konsolen i en sekund så användaren hinner se vad som händer
                break;
            }
        }
    }
    
    //Skriver ut saldo 
    @Override
    public void checkBalance() {
        System.out.println("Du har " + Meny.userBalance + " " + GetCurrency() + " på ditt konto" );
        System.out.println("---------------------------------------------------------------");
        System.out.println("Du har lånat totalt: " + this.totalLoan + " med en ränta på " + this.interest);
        System.out.println("Total skuld: " + this.debt);
        System.out.println(" ");
        System.out.println(" ");
        
    }
    //Ta ett lån. Tar in hur mycket, ränta och vem som tar lån
    public void takeLoan() {  
        this.setScan(new Scanner(System.in));
        float userDebt = 0;
        System.out.println("Hur mycket vill du låna?");
        float amount;
        amount = getScan().nextFloat();
        float interest = (float)3.40;  
                
        //Kollar hur användaren skriver ränta. Ifall man skriver den i heltal så ska den dela med 100
        if (interest < 1.0 && interest > 0.0) {
            userDebt = amount + (amount * interest);
            Meny.userBalance += amount;
        } else if (interest > 1 && interest < 100) {
            float fixedInterest = (interest/100);
            userDebt = amount + (amount * fixedInterest);
            Meny.userBalance += amount;
        }
        this.debt += userDebt;
        this.totalLoan += amount;
    }

    /**
     * @return the scan
     */
    public Scanner getScan() {
        return scan;
    }

    /**
     * @param scan the scan to set
     */
    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    
}
