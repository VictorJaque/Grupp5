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
public class Meny {
   public static String userInputCurrency;
    public static float userValueInput;
    public static  String choiceMainMenu;
    public static Aktiemarknad userMoneyAndCurrency = new Aktiemarknad(userValueInput, choiceMainMenu);
    //userBalance används för att lagra det befintliga värdet av value för att sedan kunna öka eller minska den beroende på insättning/uttag
    public static float userBalance = 0;
    //static scanner för att nå den i hela klassen
    static Scanner scan = new Scanner(System.in);
    
    //Menyn som visas först vid exekvering
    public static void MenuStart() throws InterruptedException{
      /*  System.out.println("1. Registrera dig");
        System.out.println("2. Logga in");
        String choiceMenuStart = scan.next(); */
        
        
        
        //Inväntar en metod från registreringsklassen som ska initieras nedan
        
         
            //Ange val av
            System.out.println("-------------------Välkommen till banken-------------------");
            System.out.println("1 Logga in");
            System.out.println("2 Registrera dig");
            System.out.println("3 Avsluta");
            
            
            //Flera olika logic måste anropas
            UserInterface ui = new InterfaceImpl();
            Scanner sc = new Scanner(System.in);
            
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
                        System.out.println("Vill du gå vidare?y/n");
                        
                        
                        
                            String result = sc.nextLine();
                            if(result.equals("y")) {
                                DeclareCurrency();
                                
                                
                            
                            } else {
                                break;
                            }     
                       
                        //Avbryta
                        
                        System.exit(0);
                    }else {
                        System.out.println("Ditt namn eller lösenord är fel...");
                    }        
                    break;
                case "2":
                    //Registrera
                    System.out.println("Skriv in ditt namn:");
                    String newUserName = sc.nextLine();
                    System.out.println("Skriv in ditt lösenord");
                    String newPassword = sc.nextLine();
                    
                    //kapsla in namnet och lösenordet till användare object
                    User user = new User();
                    user.setName(newUserName);
                    user.setPassword(newPassword);
                    
                    //Anropa registrations funktion
                    //Skapa interface object
                    ui.register(user);
                    System.out.println("Registreringen lyckades");
                    break;
                case "3":
                    
                    System.out.println("Du loggade ut");
                    Main.setFalseOrTrue = false;
                    break;
                    
                    default:
                        System.out.println("Tack för att du använder programmet!");
                    
            
                
        }
            
    }
    
     public static void SkatteMainMenu() throws InterruptedException{
                System.out.println("1. Sätt in pengar");
                System.out.println("2. Ta ut pengar");
                System.out.println("3. Kolla saldo");
                System.out.println("4. Betala Skatt");

 

                System.out.println("-----------------");
                System.out.println("0. Gå tillbaka");
        
                  String choiceSkatteMenu = scan.next();
                  
                  
                  switch(choiceSkatteMenu){
                      case "0":
                          MenuAfterLogin();
                            break;
                      case "1":
                            System.out.println("Hur mycket vill du sätta in?");
        
                            float userValueInput = scan.nextFloat();
                            
        
                            userBalance = userBalance + userValueInput ;
                        
                        
                            userMoneyAndCurrencyStaten.insertMoney();
                        
                            break;
                      case "2":
                          System.out.println("Hur mycket vill du ta ut?");
                        
                            float userWithdrawalAmount = scan.nextFloat();
                            
                            userBalance = userBalance - userWithdrawalAmount;
                            
                            userMoneyAndCurrencyStaten.withdrawMoney();
                            break;
                            
                      case "3":
                          userMoneyAndCurrencyStaten.checkBalance();
                          break;
                      case "4":
                          userMoneyAndCurrencyStaten.BetalaSkatt();
                            break;
                       default:
                            System.out.println("Du skrev inte in något av alternativen"); 
                            SkatteMainMenu();
                  }
    }
    
    public static void DeclareCurrency() throws InterruptedException{
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
                    System.out.println("Skriv in ett giltigt alternativ");
                    DeclareCurrency();
        }
       
       
       
    }
    // Efter första menyvalet kommer denna meny att köras
    public static void MenuAfterLogin() throws InterruptedException {
        System.out.println("1. Bank");
        System.out.println("2. Aktiemarknaden");
        
        System.out.println("-----------------");
        System.out.println("0. Logga ut");
        
        
        
        
        String choiceMenuAfterLogin = scan.next();
        
        
        //lägg in en metod från bankklass eller likande här
            switch (choiceMenuAfterLogin){
                case "0":
                    System.out.println("Du loggade ut");
                    Main.setFalseOrTrue = false;
                    break;
                case "1": 
                    BankMainMenu();                
                    break;
                case "2":
                    AktieMarknadenMainMenu();
                    break;
                    default: 
                        System.out.println("Du skrev inte in något av alternativen");
        
                
        
    }
        
        
    }
    public static void BankMainMenu() throws InterruptedException{
            Bank bank = new Bank(10000, userInputCurrency);
            //Banken körs så länge man inte matar in 0
            //Har problem med att den läser in en gång utan att jag matar in något!
            //Funkar nu fast med en int input från användaren
            //Nu är det dock risk för error
            //Vi får implementera en try/catch eventuellt
            
                System.out.println("1. Ta ut pengar");
                System.out.println("2. Kolla saldo");
                System.out.println("3. Sätt in pengar");
                System.out.println("4. Ta ett lån");
                System.out.println("5. Öppna aktiemarknaden");
                System.out.println("-----------------------");
                System.out.println("0. Gå tillbaka");
                
                String choiceBankMainMenu = scan.next();
                switch (choiceBankMainMenu){
                    case "0": 
                        MenuAfterLogin();
                        break;
                    case "1": 
                         
                        bank.insertMoney();
                        break;
                    case "2":
                        
                        bank.checkBalance();
                        break;
                    case "3":
                        
                        bank.withdrawMoney();
                        break;
                    case "4":
                        
                        bank.takeLoan();
                        break;
                    case "5": 
                        
                        AktieMarknadenMainMenu();
                        break;
                        
                    default:
                        System.out.println("Du skrev inte in något av alternativen");                
                
             }
            
            //Nedan är kod som berör Aktiemarknaden
            }
   @SuppressWarnings("fallthrough")
            public static void AktieMarknadenMainMenu() throws InterruptedException{
                System.out.println("1. Sätt in pengar");
                System.out.println("2. Ta ut pengar");
                System.out.println("3. Kolla saldo");
                System.out.println("4. Lägg till aktier");
                System.out.println("5. Ta bort aktier");
                System.out.println("6. Kolla aktie listan");
                System.out.println("-----------------");
                System.out.println("0. Gå tillbaka");
                
                
                
                String choiceMainMenu = scan.next();
                
                
                    switch (choiceMainMenu){
                    
                        case "1":
                            System.out.println("Hur mycket vill du sätta in?");
        
                            float userValueInput = scan.nextFloat();
                            
                        
                            //userBalance är till för att addera det nuvarande värdet med det nya initierade värdet
        
        
                            userBalance = userBalance + userValueInput ;
                        
                        
                             //skapar en instans av klassen 
                        
                        
                        
                            //Lägger till de nya insatta värdet på det redan befintliga
                        
                            //genom Klassen aktiemarknad kan vi nå value och currency samt get och set för att sätta och få fram värdet på currency
                        
                            userMoneyAndCurrency.insertMoney();
                        
                            break;
                        case "2":
                            System.out.println("Hur mycket vill du ta ut?");
                        
                            float userWithdrawalAmount = scan.nextFloat();
                        
                            userBalance = userBalance - userWithdrawalAmount;
                        
                            userMoneyAndCurrency.withdrawMoney();
                        
                        
                             
                            break;
                        case "3":
                            userMoneyAndCurrency.checkBalance();
                        
                            break;
                          case "4":
                              newStock();
                              break;
                          case "5":
                              removeStock();
                              case "6":
                                  Aktiemarknad.listAllStocks();
                                          break;
                                  
                                  
                        case "0":
                            MenuAfterLogin();
                            break;
                            
                        default:
                            System.out.println("Du skrev inte in något av alternativen"); 
                            AktieMarknadenMainMenu();
                            
                       
                }
                
            }
            public static void newStock() throws InterruptedException{
             System.out.println("Aktier");
             
             
             Aktiemarknad.addStocks(Aktiemarknad.listOfStocks);
             
                
       
             AktieMarknadenMainMenu();
        
       
      
       }
            public static void removeStock() throws InterruptedException{
                Aktiemarknad.removeStock();
            }
            
        
    
    
    
}
