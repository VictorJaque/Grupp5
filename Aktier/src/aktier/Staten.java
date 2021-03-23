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
 * @author Nureddin Elmas
 */
public class Staten extends Money implements MoneyMethods{

 

    private Scanner scan;
    
    
    public Staten(float value, String currency) {
        super();
        this.value = value;
        this.currency = currency;
        scan = new Scanner(System.in);
    }

 

    @Override
    public void insertMoney(float userBalance) throws InterruptedException {
        float amount;
        System.out.println("Sätt in pengar");
        System.out.println("Hur mycket pengar vill du sätta in?");
        amount = scan.nextFloat();
        Meny.userBalance += amount;
        System.out.println("Du har nu satt in " + Meny.userBalance + " " + Meny.userInputCurrency + " till ditt konto!");
    }

    @Override
    public void withdrawMoney(float userBalance) throws InterruptedException {
                float amount;
        System.out.println("Hur mycket pengar vill du ta ut?");
        this.setScan(new Scanner(System.in));
        amount = getScan().nextFloat();
        if (amount > Meny.userBalance) {
            System.out.println("Du har för lite pengar på ditt konto.");
        } else {
            Meny.userBalance -= amount;
            checkBalance(Meny.userBalance);
        }
    }
    
    @Override
    public void checkBalance(float userBalance) throws InterruptedException {
        
        System.out.println("Du har " + Meny.userBalance + " " + Meny.userInputCurrency + " på ditt konto" );
        System.out.println("---------------------------------------------------------------");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(" ");
        
        
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

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public Scanner getScan() {
        return scan;
    }
}

