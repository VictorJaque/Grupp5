/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.Scanner;

/**
 *
 * @author Kalle
 */
public class Aktiemarknad extends Pengar implements MoneyMethods{
    
    Scanner scan = new Scanner(System.in);
    
    public Aktiemarknad(float value, String currency) {
        super(value, currency);
    }

    @Override
    public void insertMoney() {
        System.out.println("Vilken valuta vill använda?");
        System.out.println("1. Dollar");
        System.out.println("2. Sek");
        //Ger användaren möjligheten att välja valuta att mata in
        String choice = scan.nextLine();
        
        switch (choice){
            case "1":
                SetMethod("Dollar");
                System.out.println("Du valde" + getClass());
            case "2":
                SetMethod("Kronor");
                System.out.println("Du valde" + getClass());
                
                
                
        }
        
        
        
                       
        }
        
    

    @Override
    public void withdrawMoney() {


    }

    @Override
    public void checkBalance() {
    }
    
    
}

