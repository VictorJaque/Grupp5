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
        
        //Ifall användaren matar in  "1" eller "2" kallas "SetCurrency" metoden från den abstrkta klassen "Pengar"
        //SetCurrency är en Set metod och sätter värdet på currency
        //Raden efter hämtar värdet med hjälp av "GetCurrency" metoden från den abstrakta klassen "Pengar"
        //Användaren fick därav en output om vilken "currency" som används.
        switch (choice){
            case "1":
                SetCurrency("Dollar");
                System.out.println("Du valde" + GetCurrency());
                break;
            case "2":
                SetCurrency("Kronor");
                System.out.println("Du valde att sätta in" + GetCurrency());
                Meny.AktieMarknadenMainMenu();
                break;
                //Vid fel inmatning körs metoden om från början till en korrekt inmatning tagit plats.
                default:
                    System.out.println("Du valde inget av alternativen, försök igen");
                    insertMoney();
                                               
        }
        
        
        
                                              
        }
        
    

    @Override
    public void withdrawMoney() {


    }

    @Override
    public void checkBalance() {
    }
    
    
}

