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
        Meny.userBalance += amount;
        System.out.println("Du har nu satt in " + amount + " " + Meny.userInputCurrency + " till ditt konto!");
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
        System.out.println("Hur mycket pengar vill du ta ut?");
        this.setScan(new Scanner(System.in));
        amount = getScan().nextFloat();
        if (amount > Meny.userBalance) {
            System.out.println("Du har för lite pengar på ditt konto.");
            
            Meny.BankMainMenu();
        } else {
            Meny.userBalance -= amount;
            TimeUnit.SECONDS.sleep(1); //stannar konsolen i en sekund så användaren hinner se vad som händer
            checkBalance(Meny.userBalance);
        }
    }
    
    //Skriver ut saldot
   
    @Override
    public void checkBalance(float userBalance) throws InterruptedException {
        //Hämtar userBalance och userInputCurrency från Meny klassen som är användarens saldo och valuta
        System.out.println("Du har " + Meny.userBalance + " " + Meny.userInputCurrency + " på ditt konto" );
        System.out.println("---------------------------------------------------------------");
        System.out.println("Du har lånat totalt: " + Aktiemarknad.getTotalLoan() + " med en ränta på " + Meny.userMoneyAndCurrency.getInterest());
        System.out.println("Total skuld: " + Aktiemarknad.getDebt());
        System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(" ");
        
    }
    
    //Låter användaren skapa en instans av en array list
    public static void addStocks(ArrayList<Aktie> listOfStocks) throws InterruptedException{
         
         
    //     
        Scanner scan = new Scanner(System.in);
        System.err.println("Följ instruktionerna för att lägga till en aktie i listan");
        System.out.println("Aktiens:");
        
        //Användaren får mata in ett String värde som symboliserar namnet på en aktie som sedan används för att skapa instansen
        System.out.println("Namn");
        String aktieNamn = (scan.next());
        
        //Användaren får mata in en float som symboliserar priset på en aktie som sedan används för att skapa instansen
         
        System.out.println("Pris");
        float kostnad =scan.nextFloat();
        
        //Börjar om metoden ifall användaren har för lite pengar
        if (kostnad > Meny.userBalance) {
            System.out.println("Du har för lite pengar på ditt konto");
            addStocks(listOfStocks);
        }
        
        //For each loop för att automatiskt ge id
        //Börjar på 0 och symboliserar index värdet
        int count;
        count = 0;
        for (Aktie i: listOfStocks) {
            count++;
        }
        

        //Skriver ut  meddelande till användaren att köpet gått igenom
  

        System.out.println("Gratulerar");
        System.out.println("Du har nu köpt " + aktieNamn + " för " + kostnad + " " + Meny.userInputCurrency);
        System.out.println("Aktien har tilldelats ID " + count);
        
        //programmet väntar 1 sekund på en uppdatering
        TimeUnit.SECONDS.sleep(1);
        
        //Med hjälp av användarens tidigare inmatningar skapas nu en ny instans baserat på de inmatninarna
        Aktiemarknad.listOfStocks.add(new Aktie(count, aktieNamn, kostnad));
         
         
         
         
         

         
        
             
         //skriver upp alla de aktier som användaren har i sin protfölj
         
         
        for (Aktie antalAktier: listOfStocks){
             
            System.out.println("Aktie ID: " + antalAktier.getAktieID() +  " Aktie: " + antalAktier.getAktieNamn() + " Pris: " + antalAktier.getKostnad());
            
        }
         
         
        
         
     
         
    }
    
    //Låter användaren radera en instans av arraylisten
    public static void removeStock() throws InterruptedException{
        
        //Återigen listas alla befintliga idexes upp i arrayListen med hjälp av en for each loop
        for (Aktie antalAktier: listOfStocks){
             
            System.out.println("ID: " + antalAktier.getAktieID() +  ". Aktie: " + antalAktier.getAktieNamn() + " Pris: " + antalAktier.getKostnad());
            
        }
        
        System.out.println("Skriv in ID numret på den aktie du vill ta bort");
        Scanner scan = new Scanner(System.in);
        int removeInput = scan.nextInt();
        //När användaren skriver in index värdet raderas den instansen
        listOfStocks.remove(removeInput);
        
    }
    //En lista av tillgängla aktier i arrayListen
    public static void listAllStocks() throws InterruptedException{
        int numreraAktierna= 0;
         
        for (Aktie antalAktier: getListOfStocks()){
             
             
            System.out.println(numreraAktierna + ". Aktie: " + antalAktier.getAktieNamn() + " ID: " + antalAktier.getAktieID() + " Pris: " + antalAktier.getKostnad());
            numreraAktierna++;
        }

   
    }

    /**
     * @return the scan
     */
    @Override
    public Scanner getScan() {
        return scan;
    }

    /**
     * @param scan the scan to set
     */
    @Override
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
      


