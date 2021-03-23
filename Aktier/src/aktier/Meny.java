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
public class Meny {
    public static Bank bank;
    public static String userInputCurrency;
    public static float userValueInput;
    public static  String choiceMainMenu;
    public static Staten userMoneyAndCurrencyStaten;
    public static Aktiemarknad userMoneyAndCurrency;// = new Aktiemarknad(userValueInput, choiceMainMenu);
    //userBalance används för att lagra det befintliga värdet av value för att sedan kunna öka eller minska den beroende på insättning/uttag
    public static float userBalance = 0;
    //static scanner för att nå den i hela klassen
    static Scanner scan = new Scanner(System.in);
    public static boolean setFalseOrTrue = true;

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        while (setFalseOrTrue) {            
            MenuStart();
        }
    }

    //Menyn som visas först vid exekvering
    public static void MenuStart() throws InterruptedException{
        
        
        
        
        //Ange val av
        System.out.println("|---------Grupp5 Koncernens Aktiehandel-----------|");
        System.out.println("|1. Logga in                                      |");
        System.out.println("|2. Registrera dig                                |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|0. Avsluta                                       |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("");
        
        
        //Flera olika logic måste anropas
        UserInterface ui = new InterfaceImpl();
        Scanner sc = new Scanner(System.in);
        userMoneyAndCurrency = new Aktiemarknad(userBalance, userInputCurrency); //Ger användaren 100 000kr att starta med
            
        //input data
        System.out.println("Vänligen gör ett val");
        String choice = sc.nextLine();
            
        //Använder switch statement
        switch(choice) {
            case "1":
                //Läser in användarens input
                System.out.println("Skriv in ditt namn: ");
                String username = sc.nextLine();
                System.out.println("Skriv in ditt lösenord");
                String password = sc.nextLine();
                
                //Tillkalla loggnings funktion
                boolean flag = ui.isLogin(username, password);
                if(flag) {
                    System.out.println("Inloggning lyckad");
                    System.out.println("Vill du gå vidare? y/n");
                    String result = sc.nextLine();
                    if(result.equals("y")) {
                        DeclareCurrency();
                    } else {
                        break;
                    }     
                //Avbryta
                System.exit(0);
                } else {
                    System.err.println("Ditt namn eller lösenord är fel...");
                    System.out.println("Var vänlig och försök igen");
                }        
                break;
            case "2":
                //Registrera
                System.out.println("Skriv in ditt namn:");
                String newUserName = sc.nextLine();
                boolean falseOrTrue = true;
                while(falseOrTrue){
                if (newUserName.isEmpty()){
                    System.err.println("Du måste skriva in någon bokstav eller siffra");
                    System.out.println("Skriv in ditt namn:");
                    newUserName = sc.nextLine();
                } else { 
                    falseOrTrue = false;
                    
                    
                    
                }
                }
                
                System.out.println("Skriv in ditt lösenord");
                String newPassword = sc.nextLine();
                
                boolean falseOrTruePsw = true;
                while(falseOrTruePsw){
                if (newPassword.isEmpty()){
                    System.out.println("Du måste skriva in någon bokstav eller siffra");
                    System.out.println("Skriv in ditt namn:");
                   newPassword = sc.nextLine();
                } else { 
                    falseOrTruePsw = false;
                }
            }
                
                

                //kapsla in namnet och lösenordet till användare object
                User user = new User(newUserName, newPassword);
                //user.setName(newUserName);
                //user.setPassword(newPassword);
                    
                //Anropa registrations funktion
                //Skapa interface object
                ui.register(user);
                System.out.println("Registreringen lyckades");
                break;
            case "0":
                System.out.println("Tack för att du handlar aktier hos oss");
                Main.setFalseOrTrue = false;
                break;
            default:
                System.out.println("Försök igen");
        }
            
    }public static void DeclareCurrency() throws InterruptedException{
        System.out.println("Välj den valuta du vill ha");
        System.out.println("1. SEK");
        System.out.println("2. EUR");
        
        String userInputSwitch = scan.next();
        
        switch(userInputSwitch){
            case "1":
                userInputCurrency = "SEK";
                MenuAfterLogin();
                break;
            case "2":
                userInputCurrency = "EUR";
                MenuAfterLogin();
                break;
            default:
                System.err.println("Skriv in ett giltigt alternativ");
        }
       
       
       
    }
    // Efter första menyvalet kommer denna meny att köras
    @SuppressWarnings("fallthrough")
    public static void MenuAfterLogin() throws InterruptedException {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 1. Bank                                         |");
            System.out.println("| 2. Aktiemarknaden                               |");
            System.out.println("| 3. Skatt                                        |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 0. Logga ut                                     |");
            System.out.println("|-------------------------------------------------|");
            String choiceMenuAfterLogin = scan.next();
        
        
            //lägg in en metod från bankklass eller likande här
            switch (choiceMenuAfterLogin){
                case "0":
                    System.out.println("Du loggade ut");
                    isTrue = false;
                    MenuStart();
                    break;
                case "1": 
                    BankMainMenu();                
                    break;
                case "2":
                    AktieMarknadenMainMenu();
                    break;
                case "3":
                    SkatteMainMenu();
                    break;
                default: 
                    System.err.println("Du skrev inte in något av alternativen");
            }
        }
    }
    
    public static void BankMainMenu() throws InterruptedException{

        //Banken körs så länge man inte matar in 0
        //Har problem med att den läser in en gång utan att jag matar in något!
        //Funkar nu fast med en int input från användaren
        //Nu är det dock risk för error
        //Vi får implementera en try/catch eventuellt
        boolean isTrue = true;
        while (isTrue) {        
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 1. Sätt in pengar                               |");
            System.out.println("| 2. Kolla saldo                                  |");
            System.out.println("| 3. Ta ut pengar                                 |");
            System.out.println("| 4. Ta ett lån                                   |");
            System.out.println("| 5. Öppna aktiemarknaden                         |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 0. Gå tillbaka                                  |");
            System.out.println("|-------------------------------------------------|");
            
            String choiceBankMainMenu = scan.next();
            switch (choiceBankMainMenu){
                case "0": 
                    isTrue = false;
                    break;
                case "1": 
                    
                    userMoneyAndCurrency.insertMoney(userBalance);
                    break;
                case "2":
                    
                    userMoneyAndCurrency.checkBalance(userBalance);
                    break;
                case "3":
                    
                    userMoneyAndCurrency.withdrawMoney(userBalance);
                    break;
                case "4":
                    
                    userMoneyAndCurrency.takeLoan();
                    break;
                case "5": 
                    AktieMarknadenMainMenu();
                    break;
                    
                default:
                    System.err.println("Du skrev inte in något av alternativen");                
                }
            }
        
        }
        //Nedan är kod som berör Aktiemarknaden
    public static void AktieMarknadenMainMenu() throws InterruptedException{
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 1. Sätt in pengar                               |");
            System.out.println("| 2. Ta ut pengar                                 |");
            System.out.println("| 3. Kolla saldo                                  |");
            System.out.println("| 4. Köp Aktier                                   |");
            System.out.println("| 5. Sälj aktier                                  |");
            System.out.println("| 6. Kolla aktie listan                           |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 0. Gå tillbaka                                  |");
            System.out.println("|-------------------------------------------------|");
            
            String choiceMainMenu = scan.next();
            switch (choiceMainMenu){
                case "1":
                    
                    //genom Klassen aktiemarknad kan vi nå value och currency samt get och set för att sätta och få fram värdet på currency
                    userMoneyAndCurrency.insertMoney(userBalance);
                    break;
                case "2":
                  //anropar withdrawMoney metoden ifrån Aktiermarknadsklassen
                    userMoneyAndCurrency.withdrawMoney(userBalance);
                    break;
                case "3":
                    userMoneyAndCurrency.checkBalance(userBalance);
                    break;
                case "4":
                    newStock();
                    break;
                case "5":
                    removeStock();
                    break;
                case "6":
                    Aktiemarknad.listAllStocks();
                    break;
                case "0":
                    isTrue = false;
                    break;
                default:
                    System.err.println("Du skrev inte in något av alternativen"); 
                    AktieMarknadenMainMenu();
            }
        }
    }
    
    public static void newStock() throws InterruptedException{
        System.out.println("Aktier");
        userMoneyAndCurrency.addStocks(Aktiemarknad.getListOfStocks());
        AktieMarknadenMainMenu();
    }
    
    public static void removeStock() throws InterruptedException{
        Aktiemarknad.removeStock();
    }
            
     @SuppressWarnings("fallthrough")
    public static void SkatteMainMenu() throws InterruptedException{
        boolean isTrue = true; 
        while (isTrue) {
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 1. Sätt in pengar                               |");
            System.out.println("| 2. Ta ut pengar                                 |");
            System.out.println("| 3. Kolla saldo                                  |");
            System.out.println("| 4. Betala Skatt                                 |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("| 0. Gå tillbaka                                  |");
            System.out.println("|-------------------------------------------------|");
            String choiceSkatteMenu = scan.next();

        
            switch(choiceSkatteMenu){
                case "0":
                    isTrue = false;
                    break;
                case "1":
                    
                    userMoneyAndCurrency.insertMoney(userBalance);
                    break;
                case "2":
                    userMoneyAndCurrency.withdrawMoney(userBalance);
                    break;
                case "3":
                    userMoneyAndCurrency.checkBalance(userBalance);
                    break;
                case "4":
                    userMoneyAndCurrencyStaten.BetalaSkatt();
                    break;
                default:
                    System.err.println("Du skrev inte in något av alternativen");
            }
        }
    }
}