/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalle
 */
public class Aktiemarknad extends Money implements MoneyMethods{
    //Attribut 
    public static ArrayList<Aktier> market; //Arraylist för att lägga in aktier
    Scanner scan = new Scanner(System.in);
    
    public Aktiemarknad(float value, String currency) {
        super(value, currency);
        market = new ArrayList<>();
    }

    @Override
    public void insertMoney() throws InterruptedException {
        System.out.println("Vilken valuta vill använda?");
        System.out.println("1. USD"); 
        System.out.println("2. SEK");
        
        
        
        
        
        //Ger användaren möjligheten att välja valuta att mata in
        String choiceInsertMoney = scan.next();
        
        //Ifall användaren matar in  "1" eller "2" kallas "SetCurrency" metoden från den abstrkta klassen "Pengar"
        //SetCurrency är en Set metod och sätter värdet på currency
        //Raden efter hämtar värdet med hjälp av "GetCurrency" metoden från den abstrakta klassen "Pengar"
        //Användaren fick därav en output om vilken "currency" som används.
        switch (choiceInsertMoney){
            case "1":
                SetCurrency("USD");
                System.out.println("Du har nu " + Meny.userBalance +GetCurrency ());
                Meny.AktieMarknadenMainMenu();
                break;
            case "2":
                SetCurrency("SEK");
                System.out.println("Du har nu " + Meny.userBalance +" " +GetCurrency ());
                Meny.AktieMarknadenMainMenu();
                break;
                //Vid fel inmatning körs metoden om från början till en korrekt inmatning tagit plats.
                default:
                    System.out.println("Du valde inget av alternativen, försök igen");
                    insertMoney();
                                               
        }
        
        
        
                                              
        }
        
    

    @Override
    //Anropas i Meny klassen när användaren väljer att göra ett uttag
    public void withdrawMoney() {
        System.out.println("Du har " + Meny.userBalance +  " " + GetCurrency());


    }

    @Override
    //Anropas i Meny klassen när användaren väljer att kolla sitt saldo
    public void checkBalance() {
        System.out.println("Du har nu " + Meny.userBalance + " " +GetCurrency ());
    }
    
      
}

