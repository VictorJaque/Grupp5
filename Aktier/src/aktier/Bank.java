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
    private float interest; 

    
    //Konstruktor
    public Bank (float value, String currency) {
        super();
        this.value = value;
        this.currency = currency;
        this.interest = (float)3.4;
    }
    
    //Metoder

    /**
     * 
     * @param userBalance
     * @throws InterruptedException
     */
    @Override
    public void insertMoney(float userBalance)throws InterruptedException  {
        //Metod för att sätta in pengar.
        float amount;
        System.out.println("Sätt in pengar");
        System.out.println("Hur mycket pengar vill du sätta in?");
        this.setScan(new Scanner(System.in));
        amount = getScan().nextFloat();
        Meny.userBalance += amount;
        System.out.println("Du har nu satt in " + amount + " " + GetCurrency() + " till ditt konto!");
        TimeUnit.SECONDS.sleep(1); //Stannar upp konsolen så användaren hinner se vad som hänt
        checkBalance(Meny.userBalance);
        }
    


    /**
     * 
     * @param userBalance
     * @throws InterruptedException
     */
    @Override
    public void withdrawMoney(float userBalance) throws InterruptedException {
        //Metod för att ta ut pengar
        //Samma logik som ovan fast att den tar ut istället för att sätta in
        float amount;
        System.out.println("Ta ut pengar");
        System.out.println("Hur mycket pengar vill du ta ut?");
        this.setScan(new Scanner(System.in));
        amount = getScan().nextFloat();
        //Kollar så användaren har tillräckligt med pengar
        if (amount > Meny.userBalance) {
            System.out.println("Du har för lite pengar på ditt konto.");
            System.out.println("Försök igen!");
            withdrawMoney(Meny.userBalance);
        } else {
            Meny.userBalance -= amount;
            setValue(getValue() + amount);
            System.out.println("Du har nu tagit ut " + amount + " " + Meny.userInputCurrency + " från ditt konto!");
            TimeUnit.SECONDS.sleep(1); //stannar konsolen i en sekund så användaren hinner se vad som händer
            checkBalance(Meny.userBalance);
        }
    }
    
    //Skriver ut saldo 
    @Override
    public void checkBalance(float userBalance) throws InterruptedException {
        System.out.println("Du har " + Meny.userBalance + " " + GetCurrency() + " på ditt konto" );
        System.out.println("---------------------------------------------------------------");
        System.out.println("Du har lånat totalt: " + this.getTotalLoan() + " med en ränta på " + this.getInterest());
        System.out.println("Total skuld: " + this.getDebt());
        System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(" ");
        
    }
    //Ta ett lån. Tar in hur mycket, ränta och vem som tar lån
    public void takeLoan() throws InterruptedException {  
        this.setScan(new Scanner(System.in));
        float userDebt = 0;
        System.out.println("Hur mycket vill du låna?");
        float amount;
        amount = getScan().nextFloat();
                
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
        checkBalance(Meny.userBalance);
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

    /**
     * @return the interest
     */
    public float getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(float interest) {
        this.interest = interest;
    }

    /**
     * @return the debt
     */
    public static float getDebt() {
        return debt;
    }

    /**
     * @return the totalLoan
     */
    public static float getTotalLoan() {
        return totalLoan;
    }



    
}
