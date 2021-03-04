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
    public static float userValueInput;
    public static  String choiceMainMenu;
    public static Aktiemarknad userMoneyAndCurrency = new Aktiemarknad(userValueInput, choiceMainMenu);
    //userBalance används för att lagra det befintliga värdet av value för att sedan kunna öka eller minska den beroende på insättning/uttag
    public static float userBalance = 0;
    //static scanner för att nå den i hela klassen
    static Scanner scan = new Scanner(System.in);
    
    //Menyn som visas först vid exekvering
    public static void MenuStart(){
        System.out.println("1. Registrera dig");
        System.out.println("2. Logga in");
        String choiceMenuStart = scan.next();
        
        
        
        //Inväntar en metod från registreringsklassen som ska initieras nedan
        
    }
    // Efter första menyvalet kommer denna meny att köras
    public static void MenuAfterLogin() {
        System.out.println("1. Bank");
        System.out.println("2. Aktiemarknaden");
        System.out.println("-----------------");
        System.out.println("0. Logga ut");
        
        
        
        
        int choiceMenuAfterLogin = scan.nextInt();
        
        //lägg in en metod från bankklass eller likande här
        switch (choiceMenuAfterLogin){
            case 0:
                waitForInput = false;
                break;
            case 1: 
                BankMainMenu();                
                break;
            case 2:
                AktieMarknadenMainMenu();
                break;
                default: 
                    System.out.println("Du skrev inte in något av alternativen");
                        MenuAfterLogin();
                
                
        
    }
        
        
    }
    public static void BankMainMenu() throws InterruptedException{
            Bank bank = new Bank(10000, "SEK");
            //Banken körs så länge man inte matar in 0
            //Har problem med att den läser in en gång utan att jag matar in något!
            boolean waitForInput = true;
            while (waitForInput) {
                System.out.println("1. Ta ut pengar");
                System.out.println("2. Kolla saldo");
                System.out.println("3. Sätt in pengar");
                System.out.println("4. Ta ett lån");
                System.out.println("5. Öppna aktiemarknaden");
                System.out.println("-----------------------");
                System.out.println("0. Gå tillbaka");
                
                int choiceBankMainMenu = scan.nextInt();
                switch (choiceBankMainMenu){
                    case 0: 
                        waitForInput = false;
                        break;
                    case 1: 
                        //här ska en metod från bankklassen initieras 
                        bank.insertMoney();
                        break;
                    case 2:
                        //här ska en metod från bankklassen initieras
                        bank.checkBalance();
                        break;
                    case 3:
                        //här ska en metod från bankklassen initieras
                        bank.insertMoney();
                        break;
                    case 4:
                        //här ska en metod från bankklassen initieras
                        bank.takeLoan();
                        break;
                    case 5: 
                        //här ska en metod för att öppna aktiemarknaden initieras
                        
                    default:
                        System.out.println("Du skrev inte in något av alternativen");                
                }
             }
            
            //Nedan är kod som berör Aktiemarknaden
            }
            public static void AktieMarknadenMainMenu(){
                System.out.println("1. Sätt in pengar");
                System.out.println("2. Ta ut pengar");
                System.out.println("3. Kolla saldo");
                
                
                
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
                            
                        default:
                            System.out.println("Du skrev inte in något av alternativen"); 
                            AktieMarknadenMainMenu();
                            
                        
                }
                
            }
            
        
    
    
    
}
