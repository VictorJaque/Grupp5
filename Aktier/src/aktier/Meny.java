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
    //static scanner för att nå den i hela klassen
    static Scanner scan = new Scanner(System.in);
    
    //Menyn som visas först vid exekvering
    public static void MenuStart(){
        System.out.println("Registrera dig");
        System.out.println("Logga in");
        
        //Inväntar en metod från registreringsklassen som ska initieras nedan
        
    }
    // Efter första menyvalet kommer denna meny att köras
    public static void MenuAfterLogin() {
        System.out.println("1. Bank");
        System.out.println("2. Aktiemarknaden");
        
        
        
        
        String choice = scan.nextLine();
        
        //lägg in en metod från bankklass eller likande här
        switch (choice){
            case "1": 
                BankMainMenu();                
                break;
            case "2":
                AktieMarknadenMainMenu();
                               
                default: 
                    System.out.println("Du skrev inte in något av alternativen");
                        MenuAfterLogin();
                
                
        
    }
        
        
    }
    public static void BankMainMenu(){
            System.out.println("1. Ta ut pengar");
            System.out.println("3. Kolla saldo");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ett lån");
            
            String choice = scan.nextLine();
            switch (choice){
                case "1": 
                    //här ska en metod från bankklassen initieras
                    break;
                case "2":
                    //här ska en metod från bankklassen initieras
                    break;
                case "3":
                    //här ska en metod från bankklassen initieras
                    break;
                case "4":
                    //här ska en metod från bankklassen initieras
                    break;
                    default:
                        System.out.println("Du skrev inte in något av alternativen");
                        BankMainMenu();
                    
                    
            }
            }
            public static void AktieMarknadenMainMenu(){
                System.out.println("1. Ta ut pengar");
                System.out.println("3. Kolla saldo");
                System.out.println("3. Sätt in pengar");
                
                String choice = scan.nextLine();
                
                switch (choice){
                    case "1":
                        //här ska en metod från aktiemarknadsklassen initieras
                        break;
                    case "2":
                        //här ska en metod från aktiemarknadsklassen initieras
                        break;
                    case "3":
                        System.out.println("Hur mucket vill du sätta in?");
        
                        int userValueInput = scan.nextInt();
                        
                        //skapar en instans av klassen 
                        Aktiemarknad userMoneyAndCurrency = new Aktiemarknad(userValueInput, choice);
                        //genom Klassen aktiemarknad kan vi nå value och currency samt get och set för att sätta och få fram värdet på currency
                        
                        userMoneyAndCurrency.insertMoney();                                              
                        
                        break;
                    case "4":
                        //här ska en metod från aktiemarknadsklassen initieras
                        break;
                        default:
                            System.out.println("Du skrev inte in något av alternativen"); 
                            AktieMarknadenMainMenu();
                            
                        
                }
                
            }
            
        
    
    
    
}
