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
                bankMainMenu();
                break;
            case "2":
                
                default: 
                    System.out.println("idk");
                
                
        
    }
        
        
    }
    public static void bankMainMenu(){
            System.out.println("1. Ta ut pengar");
            System.out.println("3. Kolla saldo");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ett lån");
            
            String choice = scan.nextLine();
            switch (choice){
                case "1": 
                    //här ska en metod från bankklassen initieras
                case "2":
            
            }
            
        }
    
    
    
}
