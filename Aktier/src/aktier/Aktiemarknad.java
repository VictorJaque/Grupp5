/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Kalle
 */
public class Aktiemarknad extends Bank implements MoneyMethods{
    //Attribut 
    private static ArrayList<Aktie> listOfStocks;
   
    private Scanner scan = new Scanner(System.in);
    
    public Aktiemarknad(float value, String currency) {
        super(value, currency); 
        this.listOfStocks = new ArrayList<>();
    }

      /**
     * 
     * @param userBalance
     * @throws InterruptedException
     */
    @Override
    public void insertMoney(float userBalance)throws InterruptedException  {
        //Metod för att sätta in pengar.
        //Boolean till while loop  som inte stänger ner funktionen ifall användaren
        //matar in mer pengar än den har
        float amount;
        System.out.println("Sätt in pengar");
        System.out.println("Hur mycket pengar vill du sätta in?");
        this.setScan(new Scanner(System.in));
        amount = getScan().nextFloat();
        if (amount < GetValue()) { 
            Meny.userBalance += amount;
            SetValue(GetValue() - amount);
            checkBalance(Meny.userBalance);
            System.out.println("Du har nu satt in " + amount + " " + GetCurrency() + " till ditt konto!");
            TimeUnit.SECONDS.sleep(1); //Stannar upp konsolen så användaren hinner se vad som hänt
            checkBalance(Meny.userBalance);
            Meny.AktieMarknadenMainMenu();
            }
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
        if (amount > Meny.userBalance) {
            System.out.println("Du har för lite pengar på ditt konto.");
            System.out.println("Försök igen!");
            withdrawMoney(Meny.userBalance);
        } else {
            Meny.userBalance -= amount;
            TimeUnit.SECONDS.sleep(1); //stannar konsolen i en sekund så användaren hinner se vad som händer
            checkBalance(Meny.userBalance);
            Meny.AktieMarknadenMainMenu();
        }
    }
    
    //Skriver ut saldo 
    @Override
    public void checkBalance(float userBalance) throws InterruptedException {
        System.out.println("Du har " + Meny.userBalance + " " + Meny.userInputCurrency + " på ditt konto" );
        System.out.println("---------------------------------------------------------------");
        System.out.println("Du har lånat totalt: " + Meny.userMoneyAndCurrency.totalLoan + " med en ränta på " + Meny.userMoneyAndCurrency.interest);
        System.out.println("Total skuld: " + Bank.debt);
        System.out.println(" ");
        System.out.println(" ");
        Meny.AktieMarknadenMainMenu();
        
    }
    
    
    public static void addStocks(ArrayList<Aktie> listOfStocks) throws InterruptedException{
         
         
         
        Scanner scan = new Scanner(System.in);
        System.err.println("Följ instruktionerna för att lägga till en aktie i listan");
        System.out.println("Aktiens:");
        
        System.out.println("Namn");
        String aktieNamn = (scan.next());
         
        System.out.println("ID");
        String aktieID = scan.next();
         
        System.out.println("Pris");
        float kostnad =scan.nextFloat();
         
         
         
        Aktiemarknad.listOfStocks.add(new Aktie(aktieID, aktieNamn, kostnad));
         
         
         
         
         

         
        
             
        int numreraAktierna= 0;
         
        for (Aktie antalAktier: listOfStocks){
            numreraAktierna++;
             
            System.out.println(numreraAktierna + ". Aktie: " + antalAktier.getAktieNamn() + " ID: " + antalAktier.getAktieID() + " Pris: " + antalAktier.getKostnad());
            
    }
        Meny.AktieMarknadenMainMenu();
         
         
        
         
     
         
    }
    public static void removeStock() throws InterruptedException{
        int numreraAktierna= 0;
         
        for (Aktie antalAktier: getListOfStocks()){
            numreraAktierna++;
             
            System.out.println(numreraAktierna + ". Aktie: " + antalAktier.getAktieNamn() + " ID: " + antalAktier.getAktieID() + " Pris: " + antalAktier.getKostnad());
            
    }
        System.out.println("Skriv in ID numret på den aktie du vill ta bort");
        Scanner scan = new Scanner(System.in);
        int removeInput = scan.nextInt();
        getListOfStocks().remove(removeInput);
        Meny.AktieMarknadenMainMenu();
        
    }
    public static void listAllStocks() throws InterruptedException{
        int numreraAktierna= 0;
         
        for (Aktie antalAktier: getListOfStocks()){
             
             
            System.out.println(numreraAktierna + ". Aktie: " + antalAktier.getAktieNamn() + " ID: " + antalAktier.getAktieID() + " Pris: " + antalAktier.getKostnad());
            numreraAktierna++;
        }
        Meny.AktieMarknadenMainMenu();

   
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
     * @return the listOfStocks
     */
    public static ArrayList<Aktie> getListOfStocks() {
        return listOfStocks;
    }

    /**
     * @param aListOfStocks the listOfStocks to set
     */
    public static void setListOfStocks(ArrayList<Aktie> aListOfStocks) {
        listOfStocks = aListOfStocks;
    }
       
             
}
      


